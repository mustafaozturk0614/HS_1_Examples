package com.bilgeadam.lesson016.throwOrnek;

public class EksiDegerException extends Exception {

    private String message;


    public EksiDegerException(String message) {
        super(message);
        this.message = message;
    }

    public EksiDegerException() {
        this.message = "Default message";
    }

    public String getMessage() {
        return message;
    }

}
