package com.wang.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    // 构造函数
    public BaseResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //重载构造函数
    public BaseResponse(int code, String msg){
        this(code, msg, null);
    }

    public BaseResponse(int code, T data){
        this(code, "",null );
    }

    public BaseResponse(ErrorCode errorCode){
        this(errorCode.getCode(), errorCode.getMessage(),null);
    }

}
