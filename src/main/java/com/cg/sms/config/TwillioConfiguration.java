package com.cg.sms.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * TODO remandal This type ...
 *
 */
@Configuration
@ConfigurationProperties("twilio")
public class TwillioConfiguration {

  private String accountSid;

  private String authToken;

  private String trialNumber;

  /**
   * The constructor.
   */
  public TwillioConfiguration() {

  }

  /**
   * @return accountSid
   */
  public String getAccountSid() {

    return this.accountSid;
  }

  /**
   * @param accountSid new value of {@link #getaccountSid}.
   */
  public void setAccountSid(String accountSid) {

    this.accountSid = accountSid;
  }

  /**
   * @return authToken
   */
  public String getAuthToken() {

    return this.authToken;
  }

  /**
   * @param authToken new value of {@link #getauthToken}.
   */
  public void setAuthToken(String authToken) {

    this.authToken = authToken;
  }

  /**
   * @return trialNumber
   */
  public String getTrialNumber() {

    return this.trialNumber;
  }

  /**
   * @param trialNumber new value of {@link #gettrialNumber}.
   */
  public void setTrialNumber(String trialNumber) {

    this.trialNumber = trialNumber;
  }

}
