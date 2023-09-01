package pl.sda.spring.springrestapi;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi
 * @created 9/1/2023
 */
public class NullOrNotBlankValidator implements ConstraintValidator<NullOrNotBlank, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s == null || s.trim().length() > 0;
    }
}
