/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacion;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        RecursoJardin jardin = new RecursoJardin();
        
        for (int i = 1; i <= 10; i++) {
            (new EntraJardin("Entra el "+i, jardin)).start();
        }
        
        for (int i = 1; i <= 15; i++) {
            (new EntraJardin("Sale el "+i, jardin)).start();
        }
    }
}
