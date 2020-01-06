package com.mycompany.classicmodels.domain.model.validator;

import com.mycompany.classicmodels.domain.model.validator.annotation.ValidPassword;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.LengthRule;
import org.passay.PasswordData;
import org.passay.PasswordValidator;
import org.passay.Rule;
import org.passay.RuleResult;
import org.passay.WhitespaceRule;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AccessPasswordValidator implements ConstraintValidator<ValidPassword, Object> {

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {

        PasswordValidator validator = new PasswordValidator(getRules());
        RuleResult ruleResult = validator.validate(new PasswordData((String) value));

        if (!ruleResult.isValid()) {

            List<String> messages = validator.getMessages(ruleResult);
            String template = messages.stream().collect(Collectors.joining(","));

            constraintValidatorContext.buildConstraintViolationWithTemplate(template)
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();

            return false;

        }

        return true;

    }

    private List<Rule> getRules() {
        return Arrays.asList(
                new LengthRule(8, 20),
                new CharacterRule(EnglishCharacterData.UpperCase, 1),
                new CharacterRule(EnglishCharacterData.LowerCase, 1),
                new CharacterRule(EnglishCharacterData.Digit, 1),
                new CharacterRule(EnglishCharacterData.Special, 1),
                new WhitespaceRule()
        );
    }

}
