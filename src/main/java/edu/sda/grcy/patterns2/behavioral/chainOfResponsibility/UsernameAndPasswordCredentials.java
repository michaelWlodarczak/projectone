package edu.sda.grcy.patterns2.behavioral.chainOfResponsibility;

public class UsernameAndPasswordCredentials implements Credentials{

    // dummy implementation -> load real user UnP in real implementation
    @Override
    public String getCredentials(String userId) {
        return "ptych1410";
    }
}
