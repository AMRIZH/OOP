/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author amriz
 */
public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;
    
    public void kali(){
        int d = a*b*c;
        System.out.println("hasil perkalian adalah : " + d);
    }
    public void tambah(){
        int d = a+b+c;
        System.out.println("hasil pertambahan adalah : " + d);
    }
    public void kurangi(){
        int d = a-b-c;
        System.out.println("hasil pengurangan adalah : " + d);
    }
    public void dibagi(){
        int d = a/b/c;
        System.out.println("hasil pembagian adalah : " + d);
    }
    public void rata(){
        int d = (a+b+c)/3;
        System.out.println("hasil rata-rata adalah : " + d);
    }
}
