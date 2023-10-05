/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class Car {
    int speed;
    int cadence;
    int gear;
    
    void speedUp(int CarSpeed) {
        speed = CarSpeed;
    }
    
    void changeCadence(int CarCadence) {
        cadence = CarCadence;
    }
    
    void changeGear(int CarGear) {
        gear = CarGear;
    }
    
    void printInfo() {
        System.out.println ("The car has cadence " + cadence + 
                " and running at " + speed + " MpH on gear " + gear +
                "\n its looks shining shimmering splendid");
    }
}



