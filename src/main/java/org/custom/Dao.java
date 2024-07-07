package org.custom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Dao {

    public static void createTable() throws IOException {

        Path humanTablePath = Path.of("/home/vladimir/dev/lisa/customDB/HumanTable.csv");

        if (!Files.exists(humanTablePath)) {
            Files.createFile(humanTablePath);
        }
    }

}
