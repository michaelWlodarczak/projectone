package edu.sda.grcy.patterns2.behavioral.chainOfResponsibility;

import java.util.Random;

public class UsernameAndPasswordAuthenticationHandler implements AuthenticationHandler{

    @Override
    public boolean authenticate(Credentials credentials) {
        if (supports(credentials.getClass())) {
            return isPasswordValid(credentials);
        }
        return false;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(UsernameAndPasswordCredentials.class);
    }

    public boolean isPasswordValid(Credentials credentials) {
        return new Random().nextBoolean(); // dummy implementation - use real credentials in real implementation
    }
}
