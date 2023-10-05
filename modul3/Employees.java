/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class Employees {
    String name;
    int NIP;
    double salary;
    
    public String setName (String nama) {
        return this.name = nama;
    }
    
    public int setNIP (int NoNIP) {
        return this.NIP = NoNIP;
    }
    
    public double setSalary (double earning) {
        return this.salary = earning;
    }
    
    public static void main (String [] args) {
        Employees naruto = new Employees();
        naruto.setName("Naruto");
        naruto.setNIP(45);
        naruto.setSalary(5000);
        
        Employees sasuke = new Employees();
        sasuke.setName("Sasuke");
        sasuke.setNIP(50);
        sasuke.setSalary(3000);
        
        Employees madara = new Employees();
        madara.setName("Madara");
        madara.setNIP(35);
        madara.setSalary(3500);
        
        System.out.println(naruto.name + "\n" + naruto.NIP + "\n" + naruto.salary);
        System.out.println(sasuke.name + "\n" + sasuke.NIP + "\n" + sasuke.salary);
        System.out.println(madara.name + "\n" + madara.NIP + "\n" + madara.salary);
    }
}
