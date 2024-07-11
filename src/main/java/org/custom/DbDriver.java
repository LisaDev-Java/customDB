package org.custom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DbDriver {

    public static List<String[]> readAllFileData(String tableName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(tableName));
        List<String> lines = reader.lines().toList();
        reader.close();

        List<String[]> fileData = new ArrayList<>();
        for (String line : lines) {
            fileData.add(line.split(","));
        }
        return fileData;
    }

}
