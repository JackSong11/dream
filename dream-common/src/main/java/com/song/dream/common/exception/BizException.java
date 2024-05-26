package com.song.dream.common.exception;

import com.song.dream.common.enums.result.ResultCode;

/**
 * 统一业务异常
 *
 * @author songzhiquana
 * @version 2023/9/6
 */
public class BizException extends RuntimeException {

  /** 状态码 */
  private int code;
  /** 消息 */
  private String message;

  public BizException(int code, String msg) {
    super(msg);
    this.code = code;
    this.message = msg;
  }

  public BizException(ResultCode errorCode, String... params) {
    super(errorCode.getMsg());

    String desc = errorCode.getMsg();
    if (params != null && params.length > 0 && desc.indexOf("{}") != -1) {
      for (String p : params) {
        desc = desc.replaceFirst("\\{\\}", p);
      }
    }

    this.code = errorCode.getCode();
    this.message = desc;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
