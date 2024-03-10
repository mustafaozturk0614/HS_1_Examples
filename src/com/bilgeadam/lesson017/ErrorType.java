package com.bilgeadam.lesson017;

public enum ErrorType {

    HATA_1(1001, "Hata-1"),
    HATA_2(1002, "Hata-2");

    private int code;
    private String message;

    ErrorType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ErrorType{");
        sb.append("code=").append(code);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
