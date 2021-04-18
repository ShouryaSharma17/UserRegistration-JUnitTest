package com.user;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith (Parameterized.class)

public class UserRegistrationTest {
    private String email;
    private boolean expectedResult;
    private UserRegistration userRegistration;

    public UserRegistrationTest(String email, boolean expectedResult) {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize(){
        userRegistration = new UserRegistration();
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
        boolean result= userRegistration.checkEmail(email);
        assertEquals(expectedResult, result);
    }

}

