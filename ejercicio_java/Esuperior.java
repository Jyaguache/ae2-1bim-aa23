/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases3C;

/**
 *
 * @author Jimmy
 */
public class Esuperior {
    public String institucion;
    public String tutores;
    public String facultades;
    
    
//Constructor
    public Esuperior(String institucion, String tutores, String facultades) {
        this.institucion = institucion;
        this.tutores = tutores;
        this.facultades = facultades;
    }

    public void mostrarDatos(){
        System.out.println("La Institución universitaria es: " +institucion);
        System.out.println("La cantidad de tutores es: " +tutores);
        System.out.println("La cantidad de facultades es: " +facultades);
    }
      
    
}
