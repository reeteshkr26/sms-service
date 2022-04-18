package com.cg.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sms.pojo.OTPPojo;
import com.cg.sms.pojo.SmsPojo;
import com.cg.sms.service.SmsService;

/**
 * TODO remandal This type ...
 *
 */
@RestController
@RequestMapping("/api/v1")
public class SmsController {

  @Autowired
  private SmsService smsService;

  /**
   * @param request
   * @return string
   */
  @PostMapping("/sms")
  public ResponseEntity<String> sendSms(@RequestBody SmsPojo request) {

    this.smsService.sendSms(request);
    return new ResponseEntity<>("Message sent success", HttpStatus.OK);
  }

  /**
   * @param otp
   * @return
   */
  @PostMapping("/otp")
  public ResponseEntity<String> verifyOtp(@RequestBody OTPPojo otp) {

    return new ResponseEntity<>("Success", HttpStatus.OK);

  }
}
