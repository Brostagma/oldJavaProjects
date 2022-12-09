package com.brostagma.builderdesignpatter;

public class ObjectBuilder {

    public String name;
    public int age;
    public boolean active;
    //Empty Constructor
    public ObjectBuilder() {

    }

    //Builder Constructor
    public ObjectBuilder(Builder builder) {
        name = builder.name;
        age = builder.age;
        active = builder.active;
    }

    public static class Builder {

        public String name;
        public int age;
        public boolean active;

        public Builder(String name) {
            this.name = name;
        }

        public Builder inputAge(int age) {
            this.age = age;
            return this;
        }

        public Builder inputActive(boolean active) {
            this.active = active;
            return this;
        }

        public ObjectBuilder input() {
            return new ObjectBuilder(this);
        }
    }
}
