package edu.sda.grcy.patterns2.structural.facade.example2;

public class BCryptEncryptor implements Encryptor{

    @Override
    public String encrypt(final String toEncrypt) {
        return "encrypting " + toEncrypt + "with BCrypt";
    }
}
