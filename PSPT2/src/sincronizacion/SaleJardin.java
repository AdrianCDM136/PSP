/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacion;

/**
 *
 * @author FP
 */
public class SaleJardin extends Thread {
    //clase derivada de Thread que define un hilo
    
    private RecursoJardin jardin;
    
    public SaleJardin(String nombre, RecursoJardin j){
        this.setName(nombre);
        this.jardin = j;
    }
    @Override
    public void run(){
        jardin.decremetarCuenta();
        //Decrementa la cuenta de accesos al jardin
    }
}
