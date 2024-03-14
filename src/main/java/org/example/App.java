package org.example;


public class App {
    public static void main(String[] args) {
        //Repository.getSize(); done
        //Repository.add(); done
        //Repository.setNames(); done
        String[] initialNames = {"Simon Sten", "Anna Karenina","John Doe"};

        NameRepository.setNames(initialNames);
        System.out.println("Numbers of names :" + NameRepository.getSize());

        String[] allNames = NameRepository.findAll();
        for (String name : allNames) {
            System.out.println("Initial names:" +name);
        }

        System.out.println("\nClearing the repository...");
        NameRepository.clear();
        System.out.println("Number of names after clearing: " + NameRepository.getSize());

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



    }
}
