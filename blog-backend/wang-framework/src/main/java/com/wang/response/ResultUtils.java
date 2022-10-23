package com.wang.response;


public class ResultUtils {
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, "ok",data);
    }

    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }
    public static <T> BaseResponse<T> error(int code, String message) {
        return new BaseResponse<>(code, message);
    }

    public static <T> BaseResponse<T> error(ErrorCode code, String message){
        return new BaseResponse<>(code.getCode(), message);
    }
}
