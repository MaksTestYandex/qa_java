package com.example;

import java.util.List;

public class Feline implements Predator, Mammal {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

}
