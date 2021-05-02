package com.validuser;
import org.junit.Assert;
import org.junit.Test;


public class UserValidationTest {
    @Test
    public void FirstName_WhenValid_ReturnTrue() {
        UserValidation userValidation = new UserValidation();
        try {
            boolean result = userValidation.checkFirstName("Shourya");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void LastName_WhenValid_ReturnTrue() {
        UserValidation userValidation = new UserValidation();
        try {
            boolean result = userValidation.checkLastName("Sharma");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Email_WhenValid_ReturnTrue() {
        UserValidation userValidation = new UserValidation();
        try {
            boolean result = userValidation.checkEmail("shourya@gmail.com");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ContactNo_WhenValid_ReturnTrue() {
        UserValidation userValidation = new UserValidation();
        try {
            boolean result = userValidation.checkContact("91 923456789");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
}



