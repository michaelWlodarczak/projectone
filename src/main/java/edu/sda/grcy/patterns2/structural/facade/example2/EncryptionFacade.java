package edu.sda.grcy.patterns2.structural.facade.example2;

public class EncryptionFacade implements Encryptors{
    private final BCryptEncryptor bCryptEncryptor;
    private final SCryptEncryptor sCryptEncryptor;
    private final NoOpEncryptor noOpEncryptor;

    public EncryptionFacade(final BCryptEncryptor bCryptEncryptor,
                            final SCryptEncryptor sCryptEncryptor,
                            final NoOpEncryptor noOpEncryptor) {
        this.bCryptEncryptor = bCryptEncryptor;
        this.sCryptEncryptor = sCryptEncryptor;
        this.noOpEncryptor = noOpEncryptor;
    }

    @Override
    public String encryptWithoutModification(String toEncrypt) {
        return noOpEncryptor.encrypt(toEncrypt);
    }

    @Override
    public String encryptWithBCrypt(String toEncrypt) {
        return bCryptEncryptor.encrypt(toEncrypt);
    }

    @Override
    public String encryptWithSCrypt(String toEncrypt) {
        return sCryptEncryptor.encrypt(toEncrypt);
    }
}
