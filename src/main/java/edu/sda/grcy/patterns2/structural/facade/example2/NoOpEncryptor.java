package edu.sda.grcy.patterns2.structural.facade.example2;

public class NoOpEncryptor implements Encryptor{

    @Override
    public String encrypt(String toEncrypt) {
        return toEncrypt;
    }
}
