package code.with.sk.validation.role;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import code.with.sk.dto.user.Roles;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EnumValidValueValidator.class)
public @interface ValidRoles {
    Roles[] anyOf();
    String message() default "must be any of {ADMIN,USER}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
