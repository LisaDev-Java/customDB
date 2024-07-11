package org.custom;

import java.io.IOException;
import java.time.LocalDate;

public class Starter {

    public static void main(String[] args) throws IOException {
        Human lisa = new Human("Lisa", Sex.FEMALE,
                "HR", LocalDate.of(2001, 10, 6), 1234567L, "Pshenichnaya", "Andreevna", 789, 4545);
        Human vova = new Human("Vladimir", Sex.MALE,
                "Java-dev", LocalDate.of(2000, 2, 14), 96321L, "Arzymanow", "Vladimirovich", 45454, 54545);

        Dao.saveHuman(lisa.prepareDataForSave());
        Dao.saveHuman(vova.prepareDataForSave());
        Dao.getHumanById();
    }
}