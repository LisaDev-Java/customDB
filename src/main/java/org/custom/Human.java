package org.custom;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;


/**
 * Entity
 * Класс - описывающий сущность из реального мира
 */
public class Human {

    private UUID id;
    private Long SNILS;
    private String name;
    private String surname;
    private String patronymic;
    private Sex sex;
    private Integer age;
    private Integer passportSeries;
    private Integer passportID;
    private String job;
    private LocalDate birthdayDate;

    public Human(String name, Sex sex, String job, LocalDate birthdayDate, Long SNILS, String surname,
                 String patronymic, Integer passportID, Integer passportSeries) {
        this.id = UUID.randomUUID();
        this.age = Period.between(birthdayDate, LocalDate.now()).getYears();

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
        this.job = job;
        this.birthdayDate = birthdayDate;
        this.SNILS = SNILS;
        this.passportID = passportID;
        this.passportSeries = passportSeries;

    }

    public Human() {
    }

    public String prepareDataForSave() {
        return this.id + ","
                + this.name + ","
                + this.surname + ","
                + this.patronymic + ","
                + this.sex + ","
                + this.age + ","
                + this.job + ","
                + this.birthdayDate + ","
                + this.SNILS + ","
                + this.passportID + ","
                + this.passportSeries + ",";
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getSNILS() {
        return SNILS;
    }

    public void setSNILS(Long SNILS) {
        this.SNILS = SNILS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(Integer passportSeries) {
        this.passportSeries = passportSeries;
    }

    public Integer getPassportID() {
        return passportID;
    }

    public void setPassportID(Integer passportID) {
        this.passportID = passportID;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }
}
