package org.example;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //Repository.getSize(); done
        //Repository.add(); done
        //Repository.setNames(); done


        System.out.println("Numbers of elements in the array :" + NameRepository.getSize());


        String[] initialNames = {"Simon Sten", "Anna Karenina", "John Doe"};
        NameRepository.setNames(initialNames);
        for(String name :initialNames){
        System.out.println("First initial names of array :" + name);
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



        System.out.println("\nFinding name: Mehrdad Javan");

        String foundName = NameRepository.find("Mehrdad Javan");
        System.out.println("Find result: " + foundName);

        System.out.println("Adding new name: Erik Brink");
        boolean addResult = NameRepository.add("Erik Brink");
        System.out.println("Add result: " + addResult);
        allNames = NameRepository.findAll();
        System.out.println("Current names:");
        for (String name : allNames) {
            System.out.println(name);
        }


        System.out.println("First name : " + Arrays.toString(NameRepository.findByFirstName("Erik")));

        System.out.println("Last name : " + Arrays.toString(NameRepository.findByLastName("Erik")));



    }
}