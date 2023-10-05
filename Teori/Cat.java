/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class Cat {
    String name;
    String color;
    int age;
    
    void getName(String catName){
        name = catName;
    }
    void getColor(String catcolor){
        color = catcolor;
    }
    void getAge(int catAge){
        age = catAge;
    }
    void ulangTahun(){
        age = age +1;
        System.out.println("Aku ulang tahun, umurku skarang " +age);
    }
    void catInpoo(){
        System.out.println("The cat's name is " + name + 
                " its " + age + " years old and " + color + " colored");
    }
    void meoong(){
        System.out.println("Meooooong meooong aing maung");
    }
    public static void main(String [] args){
        Cat catsiji = new Cat ();
        catsiji.getAge(15);
        catsiji.getColor("Oren");
        catsiji.getName("neko");
        catsiji.catInpoo();
        catsiji.meoong();
        catsiji.ulangTahun();
    }
}
