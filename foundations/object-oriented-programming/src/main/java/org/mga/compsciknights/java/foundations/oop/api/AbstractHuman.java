package org.mga.compsciknights.java.foundations.oop.api;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public abstract class AbstractHuman implements Mammal {

    Logger log = LoggerFactory.getLogger(AbstractHuman.class);

    protected int age;
    protected double height;
    protected double weight;
    protected String sex;
    protected String ethnicity;
    protected String name;

    @Override
    public double eat(Meal meal) {
        return 0;
    }

    @Override
    public double move(double mph) {
        return 0;
    }

    @Override
    public void communicate(String whatToSay) {
        log.info("{} says: {}", name, whatToSay);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("can't be less than 0");
        }
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
