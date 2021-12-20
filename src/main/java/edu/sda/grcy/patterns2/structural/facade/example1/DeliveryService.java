package edu.sda.grcy.patterns2.structural.facade.example1;

public interface DeliveryService {
    void deliverProduct(Long productsId, int amount, String recipient);
}
