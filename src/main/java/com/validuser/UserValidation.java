package com.user;

import java.util.regex.Pattern;
public class UserValidation {
    private static final String first_name=  "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String last_name= "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String email= "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String phone_number= "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
    private static final String password= "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
    public static boolean checkEmail(String EMAIL) {
        if (Pattern.matches(email, EMAIL)) {
            System.out.println("Valid Email " + email);
            return true;
        } else {
            System.out.println("Please Enter Valid Email");
            return false;
        }
    }
    public static void main(String[] args){
        checkEmail(email);
    }
}
