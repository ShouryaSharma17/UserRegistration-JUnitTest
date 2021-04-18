package com.validuser;

import java.util.regex.Pattern;

public class UserValidation {
    private static final String first_name=  "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String last_name= "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String email= "[a-zA-z]{1,}[.]?[a-z]{1,}?[@]+[a-zA-z]{1,}[.]+[a-z]{1,}[.]?[a-z]{1,}?";
    private static final String contact_number= "^[0-9]{2}\\s[0-9]{10}";
    private static final String password= "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";

    public static boolean checkFirstName(String FIRSTNAME) {
        if (Pattern.matches(first_name, FIRSTNAME)) {
            System.out.println("Valid FirstName " + first_name);
            return true;
        } else {
            System.out.println("Please Enter Valid First Name");
            return false;
        }
    }
    public static boolean checkLastName(String LASTNAME) {
        if (Pattern.matches(first_name, LASTNAME)) {
            System.out.println("Valid Last Name " + last_name);
            return true;
        } else {
            System.out.println("Please Enter Valid Last Name");
            return false;
        }
    }
    public static boolean checkEmail(String EMAIL) {
        if (Pattern.matches(first_name, EMAIL)) {
            System.out.println("Valid Email " + email);
            return true;
        } else {
            System.out.println("Please Enter Valid Email");
            return false;
        }
    }
    public static boolean checkContact(String CONTACT) {
        if (Pattern.matches(contact_number, CONTACT)) {
            System.out.println("Valid Contact Number " + contact_number);
            return true;
        } else {
            System.out.println("Please Enter Valid Contact Number ");
            return false;
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

