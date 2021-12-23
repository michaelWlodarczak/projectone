package edu.sda.grcy.patterns2.behavioral.chainOfResponsibility;

import java.util.Random;

public class BearerTokenAuthenticationHandler implements AuthenticationHandler{

    @Override
    public boolean authenticate(Credentials credentials) {
        if(supports(credentials.getClass())){
            return isTokenValid(credentials);
        }
        return false;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(BearerToken.class);
    }

    public boolean isTokenValid(final Credentials credentials) {
        return (new Random().nextInt(3) % 3) != 0; // dummy implementation
    }

}
