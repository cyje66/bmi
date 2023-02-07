package com.example.eddie.bmi.test;

public class Person {
    float height, weight;
    public float bmi(float height, float weight){
        float bmi = weight / (height * height);
        return bmi;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
