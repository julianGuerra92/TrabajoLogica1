package org.example;

import static org.example.Main.*;

public class SeedData {
    public SeedData() {
        addData();
    }

    public void addData() {
        sellerList.add(new Vendedor("1", "Margarita Arboleda", 'F', 3500000));
        sellerList.add(new Vendedor("2", "Jhon Hurtado", 'M', 5500000));
        sellerList.add(new Vendedor("3", "Miguel Villamil", 'M', 2500000));
    }

}
