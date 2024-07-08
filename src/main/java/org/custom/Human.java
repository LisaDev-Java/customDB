package org.custom;

import java.time.LocalDate;
import java.time.Period;


/**
 * Entity
 * Класс - описывающий сущность из реального мира
 * */
public class Human {

    private String name;
    private Sex sex;
    private Integer age;
    private String job;
    private LocalDate birthdayDate;

    public Human(String name, Sex sex, String job, LocalDate birthdayDate) {
        this.name = name;
        this.sex = sex;
        this.job = job;
        this.birthdayDate = birthdayDate;

        this.age = Period.between(birthdayDate, LocalDate.now()).getYears();
    }

    public String getDataForSave() {
        return this.name + ","
                + this.sex + ","
                + this.age + ","
                + this.job + ","
                + this.birthdayDate;
    }

    public void goToWork() {
        System.out.println(this.name + " go to " + this.job + " job");
    }

    public void goToSleep() {
        System.out.println(this.name + " go to sleep");
    }

    public Integer getAge() {
        return this.age;
    }

}
