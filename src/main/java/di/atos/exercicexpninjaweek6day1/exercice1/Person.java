/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpninjaweek6day1.exercice1;

/**
 *
 * @author ezekielkouassi
 */
public class Person {
    
    private String name;
    private int age;
    private double weight;
    private char gender;
    private boolean isStudent;
    
    public Person() {
        this.name = "ezekiel kouassi";
        this.age = 20;
        this.weight = 65;
        this.gender = 'M';
        this.isStudent = false;
    }
    
    public Person(String name, int age, double weight, char gender, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.isStudent = isStudent;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + this.name +
                " Age: " + this.age + 
                " Weight: " + this.weight +
                " Gender: " + this.gender +
                " isStudent: " + this.isStudent);
    }
}
