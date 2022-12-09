package com.brostagma.builderdesignpatter;

public class Main {

    public static void main(String[] args) {
        //Builder Constructor
        ObjectBuilder objectBuilder = new ObjectBuilder.Builder("Jack").inputAge(27).input();
        ObjectBuilder objectBuilder1 = new ObjectBuilder.Builder("Cor").inputAge(21).inputActive(true).input();
        //Standard Constructor
        ObjectBuilder objectBuilder2 = new ObjectBuilder();
    }
}
