/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class KucingDemo {
    public static void main (String [] args ) {
        Kucing meong = new Kucing ();
        meong.kasihNama("Meong");
        meong.getBerat(2);
        meong.getJenis("kucing oren");
        meong.kucingKepo();
        
        Kucing miaw = new Kucing ();
        miaw.kasihNama("miaw");
        miaw.getBerat(5);
        miaw.getJenis("kucing item");
        miaw.kucingKepo();
    }
}
