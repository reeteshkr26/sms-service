## Implementation of SMS service using Spring Boot with Twilio Java SDK

#### Add Twilio SDK in Pom.xml

    <dependency>
      <groupId>com.twilio.sdk</groupId>
      <artifactId>twilio</artifactId>
      <version>8.27.1</version>
    </dependency>

#### Replace ########## with your Twilio account sid, auth token and trial number

twilio.account_sid= ######################
twilio.auth_token= #######################
twilio.trial_number= #####################

#### References

- https://www.twilio.com/docs/libraries/java
- https://www.twilio.com/docs/sms/quickstart/java


