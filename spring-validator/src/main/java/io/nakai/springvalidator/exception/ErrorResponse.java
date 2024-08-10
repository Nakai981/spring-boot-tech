package io.nakai.springvalidator.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponse {
    private String responseCode;
    private String responseMessage;
}
