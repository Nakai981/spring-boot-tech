package io.nakai.springvalidator.anotation.impl;

import io.nakai.springvalidator.anotation.FormatDatePattern;
import io.nakai.springvalidator.utils.DateUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;

public class FormatDateValidator implements ConstraintValidator<FormatDatePattern, String> {

    private String pattern;

    @Override
    public void initialize(FormatDatePattern constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String object, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = false;
        if (StringUtils.hasText(object)) {
            isValid = DateUtils.isDateInValidFormat(object, pattern);
        }
        return isValid;
    }
}
