/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class BreadDemo {
    public static void main(String[] args) {
        Bread brd = new Bread ();
        brd.setColor("Blue");
        brd.setTaste("Glazzy Bluberry");
        brd.getWeight(50);
        brd.setPrice(5000);
        brd.BreadInfo();
        
        Bread brda = new Bread ();
        brda.setColor("Bed");
        brda.setTaste("fanta oren");
        brda.getWeight(100);
        brda.setPrice(10000);
        brda.BreadInfo();
        
        Bread brdd = new Bread ();
        brdd.setColor("Yellow");
        brdd.setTaste("Fun paradise");
        brdd.getWeight(400);
        brdd.setPrice(15000);
        brdd.BreadInfo();
        
        Bread brdb = new Bread ();
        brdb.setColor("Pink");
        brdb.setTaste("Heart punch");
        brdb.getWeight(500);
        brdb.setPrice(2000);
        brdb.BreadInfo();
    }
}
