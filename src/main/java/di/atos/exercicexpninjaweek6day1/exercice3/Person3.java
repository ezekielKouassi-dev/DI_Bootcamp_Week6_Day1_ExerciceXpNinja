/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpninjaweek6day1.exercice3;

/**
 *
 * @author ezekielkouassi
 */
public class Person3 {
    String name;
    int age;
    char gender;
  
    //Constructeur par défaut
    public Person3() {
        this.name = "Inconnu";
        this.age = 0;
        this.gender = 'U';
    }
  
    //Deuxième constructeur
    public Person3(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
  
    //Troisième constructeur
    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'U';
    }
  
    //Méthode displayInfo
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender);
    }
}
