package com.sci.week_seven_exceptions_and_logging;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger log = Logger.getLogger("Log");

    public static void main(String[] args) {

        log.info("Started app");

        Student student1 = new Student("Mihai", "Popescu", LocalDate.parse("1990-04-05"), "m", 123455334);

        if (!student1.validateNames()) {
            log.log(Level.SEVERE, "Invalid first name or last name");
            throw new IllegalArgumentException("first name and last name can't be empty");
        }

        try {
            if (!student1.validateBirthDate()) {
                throw new Exception("Birth date is not valid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            log.log(Level.SEVERE, "Invalid birth date supplied", e);
        }
        System.out.println(student1);

        log.info("Finished app");
    }
}
