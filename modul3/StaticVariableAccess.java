/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class StaticVariableAccess {
    public static void main (String [] args) {
        StaticVariable.akreditasi = 'B';
        
        StaticVariable sv = new StaticVariable();
        sv.firstMethod();
        sv.secondMethod();
    }
}
