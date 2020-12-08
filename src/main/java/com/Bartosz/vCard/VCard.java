package com.Bartosz.vCard;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VCard {
	//https://panoramafirm.pl/szukaj?k=hydraulik&l=
	@RequestMapping(value = "/getjobs",method = RequestMethod.GET)
	public void getJobs(@RequestParam("k") String searchitem) {
		//jsoup beginners guide taken from https://jsoup.org/cookbook/input/load-document-from-url
		try {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("https://panoramafirm.pl/szukaj?k=").append(searchitem).append("&l=");
			Document doc = Jsoup.connect(stringBuilder.toString()).get();
			Elements jsons = doc.select("script");
			Gson gson = new Gson();
			List<DataFromJson> listOfOffers = new ArrayList<>();

			for (Element element : jsons) {
				if (element.attr("type").equals("application/ld+json") && element.data().contains("LocalBusiness")){

					DataFromJson singleCompanyInfo = gson.fromJson(element.data(),DataFromJson.class);
					listOfOffers.add(singleCompanyInfo);
				}
			}


		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}