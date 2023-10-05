/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class Employee {
    String name;
    String adderess;
    String job;
    double gaji;
    
    void showName(String employeename){
        name = employeename;
        System.out.println("My name is " + name);
    }
    
    void showJob(String employeeJob){
        job = employeeJob;
        System.out.println("My job is " + job);
    }
    void showAddress(String address){
        adderess = address;
        System.out.println("I live in " + adderess);
    }
    
    void showGaji(int earning){
        gaji = earning;
        System.out.println("I got wage " + gaji + "dollar per month");
    }
    
    public static void main(String [] args){
        Employee Yahudd = new Employee();
        Yahudd.showName("Yahudd");
        Yahudd.showAddress("Dunia Lain");
        Yahudd.showJob("Ghost Buster");
        Yahudd.showGaji(50);
    }
}
