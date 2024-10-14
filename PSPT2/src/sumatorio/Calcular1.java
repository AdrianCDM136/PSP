/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumatorio;

/**
 *
 * @author FP
 */
public class Calcular1 extends Thread{
    public double num;

    public Calcular1(String n,double num) {
        super(n);
        this.num = num;
    }
    public void run(double num){
        double suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
    }
    
    
}
