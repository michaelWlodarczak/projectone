package edu.sda.grcy.patterns2.behavioral.chainOfResponsibility;

import java.util.UUID;

public class AwsSignature implements Credentials{

    @Override
    public String getCredentials(String userId) {
        return UUID.randomUUID().toString(); // dummy implementation
    }
}
