package com.cg.sms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sms.config.TwillioConfiguration;
import com.cg.sms.pojo.SmsPojo;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * TODO remandal This type ...
 *
 */
@Service
public class TwilioServiceImpl implements SmsService {

  private static final Logger LOGGER = LoggerFactory.getLogger(TwilioServiceImpl.class);

  @Autowired
  private TwillioConfiguration twilioConfig;

  @Override
  public void sendSms(SmsPojo sms) {

    if (isPhoneValid(sms.getPhone())) {
      PhoneNumber to = new PhoneNumber(sms.getPhone());
      PhoneNumber from = new PhoneNumber(this.twilioConfig.getTrialNumber());
      Message.creator(to, from, sms.getMessage()).create();
      LOGGER.info("sms send {}" + sms);
    } else {
      LOGGER.info("Invalid phone number {}" + sms.getPhone());
    }

  }

  private boolean isPhoneValid(String phone) {

    // logic for checking phone number
    return true;
  }

}
