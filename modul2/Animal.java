/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class Animal {
    String name;
    int leg;
    String food;
    String type;
    
    void getName(String animalName){
        name = animalName;
    }
    void getLeg(int numberLeg) {
        leg = numberLeg;
    }
    void getFood(String diet) {
        food = diet;
    }
    void getType(String animalDiet){
        type = animalDiet;
    }
    void AnimalInpoo(){
        System.out.println(
            "Animal's name : " + name + "\n" + 
            "Number of legs : " + leg + "\n" +
            "Food : " + food + "\n" +
            "Animal type : " + type + "\n");
    }
    public static void main(String [] args) {
        Animal Harimau = new Animal();
        Harimau.getName("Harimau");
        Harimau.getFood("Meat");
        Harimau.getLeg(4);
        Harimau.getType("Karnipor");
        Harimau.AnimalInpoo();
        
        Animal Kebo = new Animal();
        Kebo.getName("Kebo");
        Kebo.getFood("Bayam");
        Kebo.getLeg(4);
        Kebo.getType("herbipor");
        Kebo.AnimalInpoo();
        
        Animal gajah = new Animal();
        gajah.getName("gajah");
        gajah.getFood("brokoli");
        gajah.getLeg(8);
        gajah.getType("herbipor");
        gajah.AnimalInpoo();
        
        Animal ular = new Animal();
        ular.getName("ular");
        ular.getLeg(0);
        ular.getFood("tikus");
        ular.getType("karnipor");
        ular.AnimalInpoo();
    }
}
