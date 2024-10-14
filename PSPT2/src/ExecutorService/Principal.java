/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExecutorService;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //Declaramos e instanciamos el executor
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        //preparamos una coleccion de objetos callables
        //que cada uno haran una cosa
        Set<Callable<String>>callables = new HashSet<Callable<String>>();
        //añadimos los objetos
        //cada uno hara lo que se le pida
        callables.add(new Callable<String>(){
            public String call() throws Exception{
                return "Tarea 1";
            }
        });
        callables.add(new Callable<String>(){
            public String call() throws Exception{
                return "Tarea 2";
            }
        });
        callables.add(new Callable<String>(){
            public String call() throws Exception{
                return "Tarea 3";
            }
        });
        
        //declaramos los objetos future
        //y usamos el metodo para llamarlos a todos
        java.util.List<Future<String>> futures = executorService.invokeAll(callables);
        
        //recogemos el resultadode cada objeto
        for (Future<String> future : futures) {
            System.out.println("future.get = "+future.get());
        }
        //hay que terminar el proceso
        executorService.shutdown();
    }
}
