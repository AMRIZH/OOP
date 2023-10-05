/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class Bread {
    String color;
    String taste;
    int weight;
    double price;
    
    void setColor(String BreadColor) {
        color = BreadColor;
    }
    void setTaste(String BreadTaste) {
        taste = BreadTaste;
    }
    void getWeight(int BreadWeight) {
        weight = BreadWeight;
    }
    void setPrice(double BreadPrice) {
        price = BreadPrice;
    }
    void BreadInfo() {
        System.out.println(
        "The Bread color : " + color + "\n" +
        "The Bread taste : " + taste + "\n" +
        "The Bread weight : " + weight + " gram \n" +
        "The Bread Price : " + price + " rupiah \n");
    }
}
