package org.example;

import java.util.Arrays;
import java.lang.*;


public class NameRepository {
    //Part 1
    //Create an array of strings names

    private static String[] names = {"Simon Sten", "Anna Karenina", " John Doe"};

    //
    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] newNames) {
        names = newNames.clone();

    }

    public static void clear() {
        names = new String[0];

    }

    public static String[] findAll() {
        return names.clone();

    }
    //Part 2

    public static String find(final String fullName) {
        for (String element : names) {
            if (fullName.equalsIgnoreCase(element)) {
                return element;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        //  implement  the add logic

        if (find(fullName) != null) {
            return false; // Name already exists, return false
        }
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = fullName;


        return true;
    }


    public static String [] findByFirstName(final String firstName) {
        String [] newArray = new String[0]; // 0

        for (String fullName : names) { // fullName = "Erik Svensson"
            String extractedFirstName = fullName.split(" ")[0];
            if (firstName.equalsIgnoreCase(extractedFirstName)) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1 );
                newArray[newArray.length -1 ] = fullName;
                return newArray;
            }
        }
        return null;
    }
}





