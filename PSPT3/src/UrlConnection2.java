
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FP
 */
public class UrlConnection2 {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String cadena;
        URL url = new URL("https://www.marca.com/robots.txt");
        URLConnection conexion = url.openConnection();
        
        System.out.println("Direccion [getURL()]: "+conexion.getURL());
        Date fecha = new Date(conexion.getLastModified());
        System.out.println("Fecha última modificación [getLastModified()] "+fecha);
        System.out.println("Tipo de contenido [getContentType()]: "+ conexion.getContentType());
        System.out.println("=======================================");
        System.out.println("CAMPOS 1 Y 4 DE CABEZERA");
        System.out.println("getHeaderField(1) --> "+conexion.getHeaderField(1));
        System.out.println("getHeaderField(4) --> "+conexion.getHeaderField(4));
        System.out.println("=======================================");
        System.out.println("TODOS LOS CAMPOS DE LA CABECERA CON getHeaderFields(): ");
        //recuperamos las cabeceras
        Map camposCabecera = conexion.getHeaderFields();
        Iterator it = camposCabecera.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
            System.out.println(map.getKey() + " : "+map.getValue());
            String prueba = (String) map.getKey();
            if ((String)map.getKey()==null) {
                System.out.println(map.getValue());
               
            }else if(prueba.equals("Server")){
                System.out.println(map.getValue());
            }
        }
        System.out.println("=======================================");
        System.out.println("CONTENIDO DE [url.getFile()]: "+url.getFile());
        BufferedReader pagina = new BufferedReader(new InputStreamReader(url.openStream()));
        while((cadena = pagina.readLine()) != null){
            System.out.println(cadena);
        }
        
    }
}
