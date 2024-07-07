package org.custom;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        /*Human lisa = new Human("Lisa", Sex.FEMALE,
                "HR", LocalDate.of(2001, 10, 6));
        Human vova = new Human("Vladimir", Sex.MALE,
                "Java-dev", LocalDate.of(2000, 2, 14));

        lisa.goToWork();
        vova.goToWork();

        Thread.sleep(3000);

        lisa.goToSleep();
        vova.goToSleep();*/

        Dao.createTable();

    }
}