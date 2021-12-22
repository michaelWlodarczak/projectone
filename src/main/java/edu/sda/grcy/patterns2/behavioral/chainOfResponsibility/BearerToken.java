package edu.sda.grcy.patterns2.behavioral.chainOfResponsibility;

public class BearerToken implements Credentials{

    @Override
    public String getCredentials(String userId) {
        return "1/m15edCCACwPAb7zZG67s72PvhAbGmB8K1ZrGxpcNM"; // dummy implementation;
    }
}
