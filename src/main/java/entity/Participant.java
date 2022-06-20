/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author Yassine
 * Participant Bean
 */
public class Participant {
    public int ID,age;
    public String Nom,Prenom,Email,Profession,Civilite;
    
    public static LinkedList<Participant> listeParticipant = new LinkedList<Participant>(); 

    public Participant(int ID,String Nom, String Prénom,int age, String Email, String Profession, String Civilite) {
        this.ID = ID;
        this.Nom = Nom;
        this.Prenom = Prénom;
        this.age = age;
        this.Email = Email;
        this.Profession = Profession;
        this.Civilite = Civilite;
        
    }

    @Override
    public String toString() {
        return "Participant{" + "ID=" + ID +  ", Nom=" + Nom + ", Prenom=" + Prenom + ", age=" + age +", Email=" + Email + ", Profession=" + Profession + ", Civilite=" + Civilite + '}';
    }
 
}
