/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Collage_of_Six_Cats-02.jpg/603px-Collage_of_Six_Cats-02.jpg");
        URLConnection conexion = url.openConnection();
        
       //FileOutputStream escritura = new FileOutputStream();
        
        Map camposCabecera = conexion.getHeaderFields();
        Iterator it = camposCabecera.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
            System.out.println(map.getValue());
            FileOutputStream fichero = new FileOutputStream(new File("ficheroGato.txt"));
        }
    }
}
