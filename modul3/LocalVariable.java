/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class LocalVariable {
    
    int usia = 20;
    //int beratBadan;
    
    public void countUsia() {
        int usia = 0;
        int tahunSekarang = 2023;
        int tahunLahir = 2003;
        
        usia = tahunSekarang - tahunLahir;
        
        System.out.println("My age is " + usia + " Years old.");
    }
    //*
    public void bodyWeight() {
        int beratLahir = 15;
        int beratBadan = 0;
        
        beratBadan = beratLahir + (usia/2);
        System.out.println("My body weight is " + beratBadan + " kg.");
        
    }
    public static void main(String [] args) {
        LocalVariable Rizki = new LocalVariable();
        Rizki.countUsia();
        Rizki.bodyWeight();
    }
    
    //*/
}
