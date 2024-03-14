package org.example;

import java.util.Arrays;
import java.lang.*;


public class NameRepository {
    //Part 1
    //Create an array of strings names

    private static String[] names = {"Simon Sten", "Anna Karenina", " John Doe"};

    //Return the numbers of element in the Array
    public static int getSize() {

        return names.length;
    }

    //
    public static void setNames(String[] newNames) {
        names = newNames;

    }
    //Resetting the array to en empty array
    public static void clear() {
        names = new String[0];

    }
    //Return all names into Array
    public static String[] findAll() {
        return Arrays.copyOf(names,names.length);

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

        for (String fullName : names) { // fullName = "Erik Sten"
            String extractedFirstName = fullName.split(" ")[0];
            if (firstName.equalsIgnoreCase(extractedFirstName)) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1 );
                newArray[newArray.length -1 ] = fullName;
                return newArray;
            }
        }
        return null;
    }

    public static String [] findByLastName(final String lastName) {
        String [] newArray = new String[0]; // 0

        for (String fullName : names) { // fullName = "Erik Sten"
            String extractedLastName = fullName.split( " ")[0];
            if (lastName.equalsIgnoreCase(extractedLastName)) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1 );
                newArray[newArray.length -1 ] = fullName;
                return newArray;
            }
        }
        return null;
    }

    public static boolean update(final String original, final String updatedName){

        if (find(updatedName) != null) {
            return false; // Name already exists, return false
        }
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = updatedName;


        return true;


    }


    public static boolean remove(final String fullName){


        return true;
    }

}







