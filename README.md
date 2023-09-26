# greenGroupEcommerce
### CSC 394 Capstone Project: Green Goblins Ecommerce App

### Running the App
---
#### Config
- have Docker installed
- Java 17
- Click Run!
- App should be available at localhost:8080

### Deployment
- In [application.properties](src/main/resources/application.properties) change `spring.profiles.active` value from `dev` to `prod`.

- In [application-prod.properties](src/main/resources/application-prod.properties) fill out the relevant details.

- Run `mvn install`
