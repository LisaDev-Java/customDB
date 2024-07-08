package org.custom;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;


/**
 * Entity
 * Класс - описывающий сущность из реального мира
 * */
public class Human {

    private UUID id;
    private Long SNILS;
    private String name;
    private Sex sex;
    private Integer age;
    private String job;
    private LocalDate birthdayDate;

    public Human(String name, Sex sex, String job, LocalDate birthdayDate, Long SNILS) {
        this.id = UUID.randomUUID();
        this.age = Period.between(birthdayDate, LocalDate.now()).getYears();

        this.name = name;
        this.sex = sex;
        this.job = job;
        this.birthdayDate = birthdayDate;
        this.SNILS = SNILS;

    }

    public String getDataForSave() {
        return this.id + ","
                + this.name + ","
                + this.sex + ","
                + this.age + ","
                + this.job + ","
                + this.birthdayDate + ","
                + this.SNILS;
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
