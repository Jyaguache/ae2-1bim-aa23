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
    public int facultades;
    
    
//Constructor
    public Esuperior(String institucion, String tutores, int facultades) {
        this.institucion = institucion;
        this.tutores = tutores;
        this.facultades = facultades;
    }

    public void mostrarDatos(){
        System.out.println("La Institución universitaria es: " +institucion);
        System.out.println("La cantidad de tutores es: " +tutores);
        System.out.println("La cantidad de facultades es: " +facultades);
    }

    void mostrarDatosln() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      
    
}
