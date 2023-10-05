/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class ParameterMethod {
    String nama;
    
    public String setNama (String nama) {
        return this.nama = nama;
    }
    
    public static void main (String [] args) {
        ParameterMethod mp = new ParameterMethod();
        mp.setNama("Naruto");
        System.out.println(mp.nama);
    }
}
