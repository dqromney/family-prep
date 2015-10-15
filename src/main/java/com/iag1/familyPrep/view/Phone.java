package com.iag1.familyPrep.view;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by dqromney on 10/7/15.
 */
@Documented
@Constraint(validatedBy=PhoneConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
    String message() default "{Phone}";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default{};

}
