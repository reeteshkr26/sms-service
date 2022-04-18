package com.cg.sms.pojo;

import javax.validation.constraints.NotBlank;

/**
 * TODO remandal This type ...
 *
 */
public class SmsPojo {

  @NotBlank
  private String phone;

  @NotBlank
  private String message;

  /**
   * @return phone
   */
  public String getPhone() {

    return this.phone;
  }

  /**
   * @param phone new value of {@link #getPhone}.
   */
  public void setPhone(String phone) {

    this.phone = phone;
  }

  /**
   * @return message
   */
  public String getMessage() {

    return this.message;
  }

  /**
   * @param message new value of {@link #getMessage}.
   */
  public void setMessage(String message) {

    this.message = message;
  }

  @Override
  public String toString() {

    return "SmsPojo [phone=" + this.phone + ", message=" + this.message + "]";
  }

}
