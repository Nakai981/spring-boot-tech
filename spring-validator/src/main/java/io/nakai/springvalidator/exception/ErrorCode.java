package io.nakai.springvalidator.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    FAILED("400", "Fail"),
    SUCCESS("200", "Sucess"),
    INVALID_TYPE("1000", "Please provide valid ");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
    public static ErrorCode getEnumErrorCode(String errorCode) {
        ErrorCode[] allValues = ErrorCode.values();

        for (ErrorCode value : allValues) {
            if (value.getCode().equals(errorCode)) {
                return value;
            }
        }

        return null;
    }
}
