package com.song.dream.common.enums.result;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @package: ResultCode
 * @description: 接口返回数据状态定义
 */
@NoArgsConstructor
@AllArgsConstructor
public enum ResultCode {
  SUCCESS(0, "成功"),
  UNAUTHORIZED(401, "认证失败"),
  SERVER_ERROR(500, "系统异常"),
  DATA_ERROR(600, "数据错误"),
  DATA_NOT_EXIST(601, "数据不存在"),
  PARAMETER_ERROR(700, "参数错误"),
  OTHER_INTERFACE_ERROR(800, "外部接口异常"),
  NOT_EXTENDED(900, "未知错误"),

  USER_NOT_EXIST(1000, "登录用户信息错误！");

  private int code;
  private String msg;

  private ResultCode(Integer code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public static ResultCode getValue(int code) {
    for (ResultCode value : values()) {
      if (value.getCode() == code) {
        return value;
      }
    }
    return NOT_EXTENDED;
  }

  public Integer getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }

  @Override
  public String toString() {
    return "{" + "\"code\":\"" + code + '\"' + ", \"msg\":\"" + msg + '\"' + '}';
  }
}
