/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CenaDeFilosofos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author FP
 */
public class Filósofo extends Thread{
    private Semaphore leftFork, rightFork;
    private int id;

    public Filósofo(Semaphore leftFork, Semaphore rightFork, int id) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.id = id;
    }

    @Override
    public void run() {
        try{
            while(true){
                System.out.println("Filosofo "+id+"esta pensando");
                
                leftFork.acquire();
                System.out.println("Filosofo "+id+" ha cogido el tenedor de la izquierda");
                
                rightFork.acquire();
                System.out.println("Filosofo "+id+" ha cogido el tenedor de la derecha");
                
                System.out.println("Filosofo "+id+" esta comiendo");
                
                leftFork.release();
                System.out.println("Filosofo "+id+" ha soltado el tenedor de la izquierda");
                
                rightFork.release();
                System.out.println("Filosofo "+id+" ha soltado el tenedor de la derecha");
            }
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
    
    
    
}
