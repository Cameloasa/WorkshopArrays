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

    //Receiving an Arrays of names as parameters and replacing the initial name
    public static void setNames(String[] newNames) {
        names = newNames;

    }

    //Resetting the array to en empty array
    public static void clear() {
        names = new String[0];

    }

    //Return all names into Array
    public static String[] findAll() {
        return Arrays.copyOf(names, names.length);

    }


    //Part 2
    //Return name is found or return null is not found
    public static String find(final String fullName) {
        for (String name : names) {
            if (fullName.equalsIgnoreCase(name)) {
                return name; // Name found
            }
        }
        return null; // Name not found
    }


    //Return a name into array if is added
    public static boolean add(final String fullName) {
        //Check if the name already exists
        for (String name: names) {
            if (fullName.equalsIgnoreCase(name)) {
                return false; // Name already exists, return false
            }
        }
        //Extend the Array by one and add the new name
        names = Arrays.copyOf(names,names.length + 1);
        names[names.length - 1] = fullName;
        return true;


    }
    // Find a
    public static String [] findByFirstName(final String firstName) {
        String [] newArray = new String[names.length]; // 0

        for (String fullName : names) { // fullName = Marry Poppins
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
        String [] newArray1 = new String[names.length]; // 0

        for (String fullName : names) { // fullName = "Erik Sten"
            String extractedLastName = fullName.split( " ")[1];
            if (lastName.equalsIgnoreCase(extractedLastName)) {
                newArray1 = Arrays.copyOf(newArray1, newArray1.length + 1 );
                newArray1[newArray1.length -1 ] = fullName;
                return newArray1;
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
        for(int i = 0; i < names.length; i++){
            if(names[i].equalsIgnoreCase(fullName)){
              for(int j = i; j < names.length - 1 ; j++){
                  names[j] = names [ j+1];
              }
              names[names.length -1] = null;
              return true;
            }
        }

        return false;
    }

}







