package com.cg.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.cg.sms.config.TwillioConfiguration;
import com.twilio.Twilio;

/**
 * TODO remandal This type ...
 *
 */
@Configuration
public class TwilioInit {

  private static final Logger LOGGER = LoggerFactory.getLogger(TwilioInit.class);

  private final TwillioConfiguration twilioConfiguration;

  /**
   * The constructor.
   *
   * @param twilioConfiguration
   */
  @Autowired
  public TwilioInit(TwillioConfiguration twilioConfiguration) {

    this.twilioConfiguration = twilioConfiguration;
    Twilio.init(twilioConfiguration.getAccountSid(), twilioConfiguration.getAuthToken());
    LOGGER.info("Twilio initialized........ with account sid {}", twilioConfiguration.getAccountSid());
  }

}
