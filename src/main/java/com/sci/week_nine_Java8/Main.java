package com.sci.week_nine_Java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

import static com.sun.javafx.util.Utils.split;

public class Main {


    public static void main(String[] args) throws IOException {

        choosePeopleByMonth("week_nine_Java8/resources/namesDB.txt", "11", "week_nine_Java8/resources/out.txt");
    }

    public static void choosePeopleByMonth(String inputFilePath, String targetMonth, String outputFilePath) throws IOException {

        String tm = "-" + targetMonth + "-";
        String emptyOutputFile = "";
        Path outputPath = Paths.get(outputFilePath);

        if (Files.exists(outputPath)){
            Files.write(outputPath, emptyOutputFile.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
        }
        else
            Files.createFile(outputPath);

        try (Stream<String> stream = Files.lines(Paths.get(inputFilePath))) {

            stream
                    .filter(s -> s.contains(tm))
                    .sorted()
                    .forEach(x -> {

                        String[] tokens = split(x.toString(), ",");
                        String outputString = tokens[0] +", " +tokens[1] + "\n";

                        try {
                            Files.write(outputPath, outputString.getBytes(), StandardOpenOption.APPEND);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}