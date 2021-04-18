package com.validuser;

import org.junit.Assert;
import org.junit.Test;
//import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void FirstName_WhenValid_ReturnTrue()
    {
        UserValidation userValidation= new UserValidation();
        boolean result= userValidation.checkFirstName("Shourya");
        Assert.assertTrue(result);
    }
    @Test
    public void LastName_WhenValid_ReturnTrue()
        {
            UserValidation userValidation= new UserValidation();
            boolean result= userValidation.checkLastName("Sharma");
            Assert.assertTrue(result);
    }
    @Test
    public void Email_WhenValid_ReturnTrue()
    {
        UserValidation userValidation= new UserValidation();
        boolean result= userValidation.checkEmail("shourya@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void ContactNo_WhenValid_ReturnTrue()
    {
        UserValidation userValidation= new UserValidation();
        boolean result= userValidation.checkContact("91 923456789");
        Assert.assertTrue(result);
    }
    @Test
    public void Password_WhenValid_ReturnTrue()
    {
        UserValidation userValidation= new UserValidation();
        boolean result= userValidation.checkPassword("Ab8@rhsdf");
        Assert.assertTrue(result);
    }

}
