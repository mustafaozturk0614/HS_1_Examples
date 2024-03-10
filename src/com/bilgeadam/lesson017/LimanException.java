package com.bilgeadam.lesson017;

public class LimanException extends RuntimeException {

    private ErrorType errorType;

    public LimanException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public LimanException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
