/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercicexpninjaweek6day1;

import di.atos.exercicexpninjaweek6day1.exercice1.Person;
import di.atos.exercicexpninjaweek6day1.exercice3.Person3;

/**
 *
 * @author ezekielkouassi
 */
public class ExerciceXpNinjaWeek6Day1 {

    public static void main(String[] args) {
        
        System.out.println("========= Début exercice 1 ========");
        
        Person person = new Person();
        Person person2 = new Person("Cisse charlène", 21, 85, 'F', true);
        person.displayInfo();
        person2.displayInfo();
        
        System.out.println("========= Fin exercice 1 ========");
        
        System.out.println("======= Début Exercice 2 =========");
        
         // Déclarez et initialisez les variables
        int age = 25;
        double weight = 70.5;
        char gender = 'M';
        boolean isStudent = false;
        String name = "Ezekiel kouassi";
        
        // Afficher les valeurs des variables
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("IsStudent: " + isStudent);
        System.out.println("Name: " + name);
        
        // Modifiez les valeurs des variables
        age = 30;
        weight = 75.0;
        gender = 'M';
        isStudent = true;
        name = "konan emmanuel";
        
        // Imprimez les nouvelles valeurs des variables
        System.out.println("\nNew Values:");
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("IsStudent: " + isStudent);
        System.out.println("Name: " + name);
    
        // Conversion de type
        int weightInKg = (int) (weight / 2.2);
        System.out.println("\nWeight in kilograms: " + weightInKg + " kg");
    
        // Opération mathématique
        double sum = weight + age;
        System.out.println("\nSum of weight and age: " + sum);
    
        // Opérateur de comparaison
        if (age > 20) {
            System.out.println("\nAge is greater than 20");
        }else {
            System.out.println("\nAge is less than or equal to 20");
        }
    
        // Instruction de flux de contrôle
        switch (gender) {
        case 'M':
            System.out.println("\nGender is Male");
            break;
        case 'F':
            System.out.println("\nGender is Female");
            break;
        default:
            System.out.println("\nInvalid gender");
            break;
        }
        
        System.out.println("======== Fin Exercice 2 ========");
        
        System.out.println("======== Début Exercice 3 ========");
        
        
        Person3 personA = new Person3();
        Person3 personB = new Person3(name, age);
        Person3 personC = new Person3();
        personA.displayInfo();
        personB.displayInfo();
        personC.displayInfo();
        
        System.out.println("======== Fin Exercice 3 =========");
    }
}
