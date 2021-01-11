package com.banday.vo;


/**
 *
 */
public enum ResultEnum {
    /**
     * 返回结果的状态码和提示信息
     */
    OK(20000,"操作成功"),
    ERROR(50000,"操作失败"),
    ;

    private int status;
    private String message;

    ResultEnum(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
