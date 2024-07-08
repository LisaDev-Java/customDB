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

    public static String humanTableName = "HumanTable.csv";

    public static void saveHuman(String data) throws IOException {
        File humanTable = new File(humanTableName);
        PrintWriter out = new PrintWriter(new FileWriter(humanTable, true));
        out.append(data + "\n");
        out.close();
    }

}
