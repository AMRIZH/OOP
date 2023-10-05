/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class VoidMethod {
    int hour, minute, second;
    
    public void duration(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void info() {
        System.out.println("Total waktu \n" + hour + " jam " + minute + " menit " + second + " detik.");
    }
    
    public static void main(String [] args) {
        VoidMethod vm = new VoidMethod();
        vm.duration(1, 30, 15);
        vm.info();
    }
}
