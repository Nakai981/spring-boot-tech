package io.nakai.springvalidator.anotation;


import io.nakai.springvalidator.anotation.impl.FormatDateValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = FormatDateValidator.class)
public @interface FormatDatePattern {
    String message() default "";
    String pattern();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
