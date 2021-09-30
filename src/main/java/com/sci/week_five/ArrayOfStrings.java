package com.sci.week_five;

public class ArrayOfStrings {

    public static void main(String[] args) {
        String[] allStrings = new String[]{"George", "Mihai", "Raducanu"};

        for (String element : allStrings) {
            String oneString = "George" + " Mihai" + " Raducanu";
            System.out.println(oneString);
            return;
        }

    }
}