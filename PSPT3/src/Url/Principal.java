/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author FP
 */
public class Principal {
    private static void Visualizar(URL url){
        System.out.println("\tURL completa: "+url.toString());
        System.out.println("\tgetProtocol(): "+url.getProtocol());
        System.out.println("\tgetHost(): "+url.getHost());
        System.out.println("\tgetPort(): "+url.getPort());
        System.out.println("\tgetFile(): "+url.getFile());
        System.out.println("\tgetUserInfo(): "+url.getUserInfo());
        System.out.println("\tgetPath(): "+url.getPath());
        System.out.println("\tgetAuthority(): "+url.getAuthority());
        System.out.println("\tgetQuery(): "+url.getQuery());
    }
    public static void main(String[] args) {
        URL url;
        try{
            System.out.println("Constructor simple para una URL: ");
            url=new URL("http://docs.oracle.com/");
            Visualizar(url);
            
            System.out.println("Otro cnstructor simple para una URL: ");
            url=new URL("https://aulavirtual.grupocdm.es/index.cgi?id_curso=45");
            Visualizar(url);
            
            System.out.println("Constructor para protocolo + URL + directorio: ");
            url=new URL("http","docs.oracle.com","/javase/10");
            Visualizar(url);
            
            System.out.println("Constructor para protocolo + URL + puerto + directorio: ");
            url=new URL("http","localhost",8080,"/docs/appdev/instalation.html");
            Visualizar(url);
            
            System.out.println("Constructor para un objeto URL en un contexto: ");
            URL urlBase=new URL("https://docs.oracle.com/");
            url=new URL("/javase/10/docs/api/java/net/URL.html");
            Visualizar(url);

            
        }catch(MalformedURLException e){
            e.printStackTrace();
        }
    }
}
