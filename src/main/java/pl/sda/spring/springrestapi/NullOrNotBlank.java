package pl.sda.spring.springrestapi;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi
 * @created 9/1/2023
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = NullOrNotBlankValidator.class)
public @interface NullOrNotBlank {
    String message() default "Can be null but can't be blank!";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default {};
}
