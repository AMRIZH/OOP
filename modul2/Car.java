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

    public static void main (String [] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        
        car1.changeCadence(50);
        car1.speedUp(20);
        car1.changeGear(2);
        car1.printInfo();
        
        car2.changeCadence(30);
        car2.speedUp(10);
        car2.changeGear(1);
        car2.printInfo();
    }
}



