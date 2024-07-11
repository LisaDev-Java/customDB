package org.custom;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

    public static Human getHumanById( Integer id) {
        //TODO add a system ID to Human Entity
        return null;
    }

    public static Human getHumanByPassNum() {
        //TODO add a business ID to Human Entity
        return null;
    }
}
