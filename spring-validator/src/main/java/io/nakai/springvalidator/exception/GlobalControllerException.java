package io.nakai.springvalidator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalControllerException {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handle(MethodArgumentNotValidException e) {
        Map<String, Object> objectBody = new LinkedHashMap<>();
        objectBody.put("Current Timestamp", new Date());
        objectBody.put("Status", HttpStatus.BAD_REQUEST);

        // Get all errors
        List<String> exceptionalErrors = e.getBindingResult()
                .getFieldErrors().
                stream()
                .map(x -> ErrorCode.getEnumErrorCode(x.getDefaultMessage()).getMessage())
                .collect(Collectors.toList());

        objectBody.put("Errors", exceptionalErrors);
        return new ResponseEntity<>(objectBody, HttpStatus.BAD_REQUEST);
    }
}
