package org.example;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {


        System.out.println("Numbers of elements in the array :" + NameRepository.getSize());


        String[] initialNames = {"Simon Sten", "Anna Karenina", "John Doe"};
        NameRepository.setNames(initialNames);
        for(String name :initialNames){
        System.out.println("Initial names of array :" + name);
        }


        System.out.println("\nClearing the repository...");
        NameRepository.clear();
        System.out.println("Number of names after clearing: " + NameRepository.getSize());


        String[] newNames = {"Marry Poppins", "Pippi Longstrump" , "Kalle Anka"};
        NameRepository.setNames(newNames);
        System.out.println("Names array replaced successfully");


        String[] allNames = NameRepository.findAll();
        for (String name : allNames) {
            System.out.println("First name + Last name :" + name);
        }

        String fullNameToFind = "Alice Wonderland";
        String foundName = NameRepository.find(fullNameToFind);
        if (foundName !=null){
            System.out.println("Name found :" + foundName);
        }else{
            System.out.println("Name not found");
        }

        String newName = "Alice Wonderland";
        boolean added = NameRepository.add(newName);
        if (added){
            System.out.println("Named added ." + newName);
        }else {
            System.out.println("Name already exist!");
        }


        String[] newArray = NameRepository.findByFirstName("Marry");
        assert newArray != null;
        if(newArray.length> 0){
            System.out.println("Names found");
            for(String name : newArray) {
                System.out.println(name);
            }
        }else{
            System.out.println("No found");
        }

        String[] newArray1 = NameRepository.findByLastName("Poppins");
        assert newArray1 != null;
        if(newArray1.length> 0){
            System.out.println("Names found");
            for(String name : newArray1) {
                System.out.println(name);
            }
        }else{
            System.out.println("No found");
        }

        boolean update = NameRepository.update("Erik Sten","John Doe");
        if(update){
            System.out.println("Name updated successfully.");
        }else{
            System.out.println("Name failed to update.");
        }


        boolean remove = NameRepository.remove ("John Doe");
        if (remove){
            System.out.println("Name removed successfully.");
            for (String name : newNames){
                if(name != null){
                    System.out.println(name);
                }
            }
        }else{
            System.out.println("Name not found.");
        }

    }
}