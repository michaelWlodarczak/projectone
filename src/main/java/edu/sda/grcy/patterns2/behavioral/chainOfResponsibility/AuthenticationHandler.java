package edu.sda.grcy.patterns2.behavioral.chainOfResponsibility;

public interface AuthenticationHandler {
    boolean authenticate(Credentials credentials);
    boolean supports(Class<?> clazz);
}
