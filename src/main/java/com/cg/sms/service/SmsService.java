package com.cg.sms.service;

import com.cg.sms.pojo.SmsPojo;

/**
 * TODO remandal This type ...
 *
 */
public interface SmsService {

  /**
   * @param sms
   */
  @SuppressWarnings("javadoc")
  public void sendSms(SmsPojo sms);
}
