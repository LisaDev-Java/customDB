package org.custom;

import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

public class Starter {

    public static void main(String[] args) throws IOException {
        Human lisa = new Human("Lisa", Sex.FEMALE,
                "HR", LocalDate.of(2001, 10, 6), 1234567L, "Pshenichnaya", "Andreevna", 789, 4545);
        Human vova = new Human("Vladimir", Sex.MALE,
                "Java-dev", LocalDate.of(2000, 2, 14), 96321L, "Arzymanow", "Vladimirovich", 45454, 54545);

        Dao.saveHuman(lisa.prepareDataForSave());
        Dao.saveHuman(vova.prepareDataForSave());


        Human human = Dao.getHumanById(UUID.fromString("9a6f2b85-89f5-473d-9efe-a192f31cee16"));

        Human human1 = Dao.getHumanBySNILS(1234567L);

        System.out.println(human1.getSex());

        System.out.println(human.getJob());
    }
}