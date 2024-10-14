/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Hilo;

import java.util.Scanner;

/**
 *
 * @author FP
 */
public class Principal {
    public void ejecutar(String ruta2, String ruta1, String ruta3){
        ProcessBuilder pb1;
        ProcessBuilder pb2;
        ProcessBuilder pb3;
        try {
            pb1= new ProcessBuilder(ruta1);
            pb1.start();
            pb2= new ProcessBuilder(ruta2);
            pb2.start();
            Thread.sleep(3000);
            pb3= new ProcessBuilder(ruta3);
            pb3.start();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ruta1="C:\\Program Files (x86)\\Google\\Chrome\\Application\\CHROME.EXE";
        String ruta2="C:\\Program Files\\Microsoft Office\\root\\Office16\\POWERPNT.EXE";
        
        Principal lp = new Principal();
        
        System.out.println("Hola gilipollas");
        String ruta3 = teclado.next();
        
        lp.ejecutar(ruta1,ruta2,ruta3);
        System.out.println("Finalizado");
    }
}
