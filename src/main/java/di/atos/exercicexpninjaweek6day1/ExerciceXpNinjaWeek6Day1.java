/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercicexpninjaweek6day1;

import di.atos.exercicexpninjaweek6day1.exercice1.Person;

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
    }
}
