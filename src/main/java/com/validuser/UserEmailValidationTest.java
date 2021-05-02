package com.validuser;
import org.junit.Assert;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.testng.Assert.assertEquals;

@RunWith (Parameterized.class)


public class UserEmailValidationTest {
    private String email;
    private boolean expectedResult;
    private UserEmailValidationTest userValidation;

    public UserEmailValidationTest(String email, boolean expectedResult) {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }
//    @Before
//    public void initialize(){
//        userValidation = new UserEmailValidationTest(email);
//    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abc111@abc.com.au",true},{"abc-",false},{"abc.@gmail.com",false},{"abc123@.com",false}});
    }

    @Test
    public void TestUserValidation() throws UserValidationException
    {
        System.out.println("Valid" +expectedResult);
        boolean result= UserValidation.checkEmail(email);
        assertEquals(expectedResult, result);
    }
}


