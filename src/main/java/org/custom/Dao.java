package org.custom;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * DAO - Data Access Object
 * Объект доступа к данным
 */
public class Dao {

    public static final String humanTableName = "HumanTable.csv";

    public Dao() {
    }

    public static void saveHuman(String data) throws IOException {
        File humanTable = new File(humanTableName);
        PrintWriter out = new PrintWriter(new FileWriter(humanTable, true));
        out.append(data + "\n");
        out.close();
    }

    public static Human getHumanById(UUID id) throws IOException {
        List<Human> humanList = getHumanListFromDb();
        for (Human human : humanList) {
            if (human.getId().equals(id)) {
                return human;
            }
        }
        return null;
    }

    public static Human getHumanBySNILS(Long SNILS) throws IOException {
        List<Human> humanList = getHumanListFromDb();
        for (Human human : humanList) {
            if (human.getSNILS().equals(SNILS)) {
                return human;
            }
        }
        return null;
    }

    private static List<Human> getHumanListFromDb() throws IOException {
        List<String[]> fileData = DbDriver.readAllFileData(humanTableName);
        List<Human> humanList = new ArrayList<>();

        for (String[] array : fileData) {
            Human human = new Human();
            human.setId(UUID.fromString(array[0]));
            human.setName(array[1]);
            human.setSurname(array[2]);
            human.setPatronymic(array[3]);
            human.setSex(Sex.valueOf(array[4]));
            human.setAge(Integer.valueOf(array[5]));
            human.setJob(array[6]);
            human.setBirthdayDate(LocalDate.parse(array[7]));
            human.setSNILS(Long.valueOf(array[8]));
            human.setPassportID(Integer.valueOf(array[9]));
            human.setPassportSeries(Integer.valueOf(array[10]));

            humanList.add(human);
        }
        return humanList;
    }
}
