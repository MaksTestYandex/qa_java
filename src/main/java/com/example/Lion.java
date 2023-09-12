package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Mammal mammal;

    public Lion(String sex, Mammal mammal) throws Exception {
        this.mammal = mammal;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return mammal.getKids();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return mammal.getFood("Хищник");
    }
}
