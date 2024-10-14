/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacion;

/**
 *
 * @author FP
 */
public class RecursoJardin {
    private int cuenta;
    
    public RecursoJardin(){
        cuenta = 100;
    }
    public synchronized void incremetarCuenta(){
        //metodo que incrementa en uno la varieble cuenta
        System.out.println("hilo "+ Thread.currentThread().getName()
        + "------ Entra en el Jardín");
        //muestra el hilo
        cuenta++;
        
        System.out.println(cuenta+ " en jardín");
    }
    public synchronized void decremetarCuenta(){
        //metodo que decrementa en uno la varieble cuenta
        System.out.println("hilo "+ Thread.currentThread().getName()
        + "------ Sale en el Jardín");
        
        cuenta--;
        
        System.out.println(cuenta+ " en jardín");
    }
}
