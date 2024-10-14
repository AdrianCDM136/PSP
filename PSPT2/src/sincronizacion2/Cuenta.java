/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacion2;

/**
 *
 * @author FP
 */
public class Cuenta {
    private int saldo;
    
    Cuenta(int s){
        saldo = s;
    }

    public int getSaldo() {
        return saldo;
    }
    
    private void restar (int cantidad){
        saldo = saldo - cantidad;
    }
    
    public void RetirarDinero(int cant, String nom){
        if (getSaldo() >= cant) {
            System.out.println(nom + ": SE VA A RETIRAR SALDO (ACTUAL ES:" +getSaldo()+" )");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                
            }
            
            restar(cant);
            
            System.out.println("\t"+ nom+ " retira =>"+ cant + " ACTUAL(" + getSaldo() + ")");
        }else{
            System.out.println(nom+ " No se puede sacar dinero, NO HAY SALDO MOROSO (" + getSaldo() + ")");
        }
        if (getSaldo()<0) {
            System.out.println("SALDO NEGATIVO => "+getSaldo());
        }
    }
}
