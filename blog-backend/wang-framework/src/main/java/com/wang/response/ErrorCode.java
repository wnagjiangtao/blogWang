package com.wang.response;

/**
 * 返回枚举类
 */
public enum ErrorCode {

    //成功
    SUCCESS(0,"操作成功"),
    //未登录
    NO_LOGIN(40001,"用户未登录"),
    //无权限
    NO_AUTH(40003,"无权限操作"),
    //请求参数错
    PARAMS_ERROR(40002,"请求参数错误"),
    //请求数据为空
    NULL_ERROR(40000,"请求数据为空"),
    //系统内部异常
    SYSTEM_ERROR(50000,"系统内部异常");

    private final int code;
    private final String message;

    ErrorCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {return code;}
    public String getMessage() {return message;}


}
