# Spring Cloud Feing Client
Spring Boot project with Spring Cloid Feing Client example service.

---

This project consumes the [OMDb API](http://www.omdbapi.com) as a Client.

Request your apikey in the [ApiKey Tab](http://www.omdbapi.com/apikey.aspx) and add it to as Environment Variable in your IDE as:

```properties
omdb_apikey = YOUR_APIKEY_REQUESTED_HERE
```

Run the project and consume it with the following cURL via terminal/cmd

```shell
curl --location --request GET 'http://localhost:80/omdb?i=tt3896198'
```

Or import as cURL into Postman.

Enjoy it.

