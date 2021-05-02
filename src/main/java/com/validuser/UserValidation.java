package com.validuser;

import java.util.regex.Pattern;
public class UserValidation {
    private static final String first_name=  "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String last_name= "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String email= "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String phone_number= "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String password= "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
    public static boolean checkFirstName(String FIRSTNAME) throws  UserValidationException{
        if (!Pattern.matches(first_name, FIRSTNAME)) {
            throw  new UserValidationException("Invalid first name");
//            System.out.println("Valid FirstName " + first_name);
//            return true;
        } else {
//            System.out.println("Please Enter Valid First Name");
            return true;
        }
    }
    public static boolean checkLastName(String LASTNAME) throws UserValidationException{
        if (!Pattern.matches(last_name, LASTNAME)) {
            throw new UserValidationException("Invalid last name");
//            System.out.println("Valid Last Name " + last_name);
//            return true;
        } else {
//            System.out.println("Please Enter Valid Last Name");
            return true;
        }
    }
    public static boolean checkEmail(String EMAIL) throws UserValidationException{
        if (!Pattern.matches(email, EMAIL)) {
            throw  new UserValidationException("Invalid Email");
//            System.out.println("Valid Email " + email);
//            return true;
        } else {
//            System.out.println("Please Enter Valid Email");
            return true;
        }
    }
    public static boolean checkContact(String CONTACT) throws UserValidationException{
        if (!Pattern.matches(phone_number, CONTACT)) {
            throw new UserValidationException("Invalid Contact");
//            System.out.println("Valid Contact Number " + phone_number);
//            return true;
        } else {
//            System.out.println("Please Enter Valid Contact Number ");
            return true;
        }
    }
    public static boolean checkPassword(String PASSWORD) {
        if (Pattern.matches(password, PASSWORD)) {
            System.out.println("Valid Password " + password);
            return true;
        } else {
            System.out.println("Please Enter Valid Password");
            return false;
        }
    }
}
