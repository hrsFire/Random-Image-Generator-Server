[![Build Status](https://travis-ci.com/hrsFire/Random-Image-Generator-Server.svg?branch=master)](https://travis-ci.com/hrsFire/Random-Image-Generator-Server)

# Random Image Server 
Generated Server code with additional custom code for the business logic. It was initialized by using https://start.spring.io/ and requires the Web dependency.

# Build
## Local build
Run the following maven command to build the artifact locally:

```
mvn install
```

## Remote build
Travis CI app is used to build the application. The build needs the following environment variables set in order to work:
* TRAVIS_GITHUB_TOKEN: This token is used to update the documentation of the project
* SONAR_TOKEN: This token is used to perform static code analysis within the SonarCloud
* HEROKU_API_KEY: This token is used to deploy the application to the staging and production environment on heroku
* PACKAGECLOUD_TOKEN: This token is used to deploy the application to the maven repository
