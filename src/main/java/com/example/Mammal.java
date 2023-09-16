package com.example;

public interface Mammal extends Animal {

    default int getKids() {
        return getKids(1);
    }

    default int getKids(int kidsCount) {
        return kidsCount;
    }

}
