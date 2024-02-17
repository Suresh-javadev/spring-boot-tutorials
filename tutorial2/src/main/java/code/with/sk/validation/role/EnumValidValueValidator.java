package code.with.sk.validation.role;

import java.util.Arrays;

import code.with.sk.dto.user.Roles;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EnumValidValueValidator implements ConstraintValidator<ValidRoles, Roles>{

    private Roles[] subset;

    @Override
    public void initialize(ValidRoles constraint) {
        this.subset = constraint.anyOf();
    }

    @Override
    public boolean isValid(Roles value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(subset).contains(value);
    }

}
