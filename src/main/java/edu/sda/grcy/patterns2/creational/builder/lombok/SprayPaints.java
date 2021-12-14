package edu.sda.grcy.patterns2.creational.builder.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SprayPaints {
    private String brand;
    private String color;
    private Integer capacity;
    private Integer price;

    // dedykowana metoda do uzyskania informacji zamiast toString
    // - poniewaz toString nie powinien sluzyc klientowi
    // tylko programiscie, np. do uzyskiwania logow
    public String getPaintInfo(){
        return "\nSpray Paint: \n\tBrand - " + brand +
                "\n\tcolor - " + color +
                "\n\tcapacity - " + capacity +
                "\n\tprice - " + price;
    }
}
