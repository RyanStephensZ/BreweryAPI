# BreweryAPI
This is a Java / Gradle / Spring Boot application designed to get all breweries or specific breweries using https://api.openbrewerydb.org API

Endpoints:
```aidl
Path        Type    Produces                Description
/           GET     application/json        Find all Breweries
/{name}     GET     application/json        Find Brewery By Name
```

##Example Request Rest API
### Find All Brews
Request
```
GET / HTTP/1.1
Host: localhost:8080
```
Response
```
    {
        "id": "10-56-brewing-company-knox",
        "name": "10-56 Brewing Company",
        "brewery_type": "micro",
        "street": "400 Brown Cir",
        "address_2": null,
        "address_3": null,
        "city": "Knox",
        "state": "Indiana",
        "county_province": null,
        "postal_code": "46534",
        "country": "United States",
        "longitude": null,
        "latitude": "41.289715",
        "phone": "6308165790",
        "website_url": null,
        "updated_at": "2021-10-23T02:24:55.243+00:00",
        "created_at": "2021-10-23T02:24:55.243+00:00"
    }
```
### Find All Brews
Request
```
GET / HTTP/1.1
Host: localhost:8080/modern
```
Response
```
        "id": "modern-brewery-saint-louis",
        "name": "Modern Brewery",
        "brewery_type": "micro",
        "street": "5231 Manchester Ave # E",
        "address_2": null,
        "address_3": null,
        "city": "Saint Louis",
        "state": "Missouri",
        "county_province": null,
        "postal_code": "63110-2092",
        "country": "United States",
        "longitude": null,
        "latitude": "38.625149",
        "phone": null,
        "website_url": "http://www.mb314.com",
        "updated_at": "2021-10-23T02:24:55.243+00:00",
        "created_at": "2021-10-23T02:24:55.243+00:00"
    }
```