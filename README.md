# Spring Boot Assignments

#### Assignment 1 : Fetch data from Random Joke API -> RandomJokeController

#### Assignment 2 : Fetch data from Random User API -> RandomUserController

#### Assignment 3 : Fetch data from Chucknorris Random Joke API -> ChucknorrisRandomJokeController

#### Assignment 4 : Fetch data from Zippopotam API -> ZippopotamController

#### Assignment 5 : Fetch data from Nationalize API -> NationalizeController

#### Assignment 6 : Send Email Using Java -> EmailSenderController

- Frameworks and Language used :
  - Spring Boot (SNAPSHOT 3.0.6)
  - Java 17

- Data Flow :
  1. Controller : 
        - Each controller class is fetching a data from an external API and pass the fetched data into a method of a service class.
        - RestTemplate is used to make a connection with an external API.
  2. Services :
        - In service class we are extracting response data of an external API using JSONObject and populating our own user defined object and return it as a response.

- Project Summary :
```
  The goal of this project is to make a connection with an external API , extract the data from the response of 
  that API and populate our own equivalent object and return that object as a response.
```
