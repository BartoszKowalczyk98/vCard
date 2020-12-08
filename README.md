# Getting Started
Spring project to get data from user to look for company offers based on input phrase or localization, and then
 process retrieved data. Then present that data and allow user to generate vCard of that company.
 
 Still work in progress, for now only part that works is retrieving data from site and parsing it from Json using
  Gson library. Example api endpoint input:
  ```
/getjobs?k=<input_phrase_here>
```
and it will return list of objects of type DataFromJson

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-developing-web-applications)
* [Main Gson github page](https://github.com/google/gson)
* [Json documentation used during development](https://jsoup.org/)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


