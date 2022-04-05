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

}