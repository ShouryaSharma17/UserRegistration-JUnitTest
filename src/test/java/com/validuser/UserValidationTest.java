package com.user;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith (Parameterized.class)

public class UserValidationTest {
    private String email;
    private boolean expectedResult;
    private UserValidationTest userValidation;

    public UserValidationTest(String email, boolean expectedResult) {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize(){
        userValidation = new UserValidationTest();
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abc111@abc.com.au",true},{"abc-",false},{"abc.@gmail.com",false},{"abc123@.com",false}});
    }

    @Test
    public void TestUserValidation()
    {
        System.out.println("Valid" +expectedResult);
        boolean result= userValidation.checkEmail(email);
        assertEquals(expectedResult, result);
    }

}

