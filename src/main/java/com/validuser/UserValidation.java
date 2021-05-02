package com.validuser;

import java.util.regex.Pattern;
interface IUserValidation{
    boolean validate( String userInput, Pattern pattern);
}
public class UserValidation {
    static IUserValidation validateUser = (userInput, pattern) -> {
        return pattern.matcher(userInput).matches();
    };
    public static boolean checkFirstName(String FIRSTNAME) throws UserValidationException {
        try {
            String first_name = "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
            Pattern pattern = Pattern.compile(first_name);
            return validateUser.validate(first_name, pattern);
        } catch (Exception e) {
            throw new UserValidationException("Invalid FirstName");
        }
    }

    public static boolean checkLastName(String LASTNAME) throws UserValidationException {
        try {
            String last_name = "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
            Pattern pattern = Pattern.compile(last_name);
            return validateUser.validate(last_name, pattern);
        } catch (Exception e) {
            throw new UserValidationException("Invalid SecondName");
        }
    }

    public static boolean checkEmail(String EMAIL) throws UserValidationException {
        try {
            String email = "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
            Pattern pattern = Pattern.compile(email);
            return validateUser.validate(email, pattern);
        } catch (Exception e) {
            throw new UserValidationException("Invalid Email");
        }
    }

    public static boolean checkContact(String CONTACT) throws UserValidationException {
        try {
            String phone_number = "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
            Pattern pattern = Pattern.compile(phone_number);
            return validateUser.validate(phone_number, pattern);
        } catch (Exception e) {
            throw new UserValidationException("Invalid Contact");
        }
    }
}
