package com.mycompany.classicmodels.domain.model.validator.annotation;

import com.mycompany.classicmodels.domain.model.validator.AccessPasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AccessPasswordValidator.class)
@Documented
public @interface ValidPassword {

    String message() default "{invalidPassword}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
