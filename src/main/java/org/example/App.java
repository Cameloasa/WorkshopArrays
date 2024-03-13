package org.example;


public class App {
    public static void main(String[] args) {
        //Repository.getSize(); done
        //Repository.add(); done
        //Repository.setNames(); done
        String[] initialNames = {"Simon Sten", "Anna Karenina","John Doe"};

        Repository.setNames(initialNames);
        System.out.println("Numbers of names :" + Repository.getSize());

        String[] allNames = Repository.findAll();
        for (String name : allNames) {
            System.out.println("Initial names:" +name);
        }

        System.out.println("\nClearing the repository...");
        Repository.clear();
        System.out.println("Number of names after clearing: " + Repository.getSize());

        System.out.println("\nFinding name: Mehrdad Javan");
        String foundName = Repository.find("Mehrdad Javan");
        System.out.println("Find result: " + foundName);

        System.out.println("Adding new name: Erik Brink");
        boolean addResult = Repository.add("Erik Brink");
        System.out.println("Add result: " + addResult);
        allNames = Repository.findAll();
        System.out.println("Current names:");
        for (String name : allNames) {
            System.out.println(name);
        }



    }
}
