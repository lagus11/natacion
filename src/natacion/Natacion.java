/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package natacion;

import Model.client.Client;
import Model.config.Conexion;

/**
 *
 * @author lagus11
 */
public class Natacion extends Conexion{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.getConexion();
        
        
        // prueba de los modelos
        Client client = new Client();
        client.setId(1);
        client.setName("Adalberta");
        client.setLastName("Martinez");
        
        System.out.println(client.getId()+ " - " + client.getName() + " - " + client.getLastName());
    }
    
}
