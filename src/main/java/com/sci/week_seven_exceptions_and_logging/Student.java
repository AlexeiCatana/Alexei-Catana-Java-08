package com.sci.week_seven_exceptions_and_logging;

import java.time.LocalDate;
import java.time.Period;

public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private int cnp;
    private Period age;

    Student(String firstName, String lastName, LocalDate dateOfBirth, String gender, int cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender must be M (male) or F (female).");
        }
        this.cnp = cnp;
        this.age = Period.between(dateOfBirth, now);
    }

    boolean validateNames() {
        return firstName.length() >= 1 && lastName.length() >= 1;
    }

    boolean validateBirthDate() {
        return (dateOfBirth.isAfter(LocalDate.parse("1900-01-01")) || (dateOfBirth.isBefore(LocalDate.parse("2021-10-25"))));
    }

    LocalDate now = LocalDate.now();

    public void calculateStudentAge() {
        Period age = Period.between(dateOfBirth, now);
        System.out.println("The age is " + age.getYears() + " years," + age.getMonths() + " months and " + age.getDays() + " days");
    }

    public void listStudentBySpecificAge() {
        System.out.println("The students with age " + age + " are: " + firstName + " " + lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "first name='" + firstName + '\'' +
                ", last name='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", cnp=" + cnp +
                '}';
    }

}
