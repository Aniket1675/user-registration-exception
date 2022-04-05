package com.bridgelabz.exception;
import org.junit.Assert;
import org.junit.Test;
public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    public void givenFirstName() throws InputInvalidException {
        String firstName = "Aniket";
        Assert.assertTrue(exceptionUserRegistration.testFirstName(firstName));
    }
    @Test
    public void lastName() throws InputInvalidException {
        String lastName = "Kumbhar";
        Assert.assertTrue(exceptionUserRegistration.testLastName(lastName));
    }
    @Test
    public void emailId() throws InputInvalidException {
        String emailId = "aniketkum007@gmail.com";
        Assert.assertTrue(exceptionUserRegistration.testEmailId(emailId));
    }
    @Test
    public void mobileNumber() throws InputInvalidException {
        String mobileNumber = "91 7020409312";
        Assert.assertTrue(exceptionUserRegistration.testMobileNumber(mobileNumber));
    }

}