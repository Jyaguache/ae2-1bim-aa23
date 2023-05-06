/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases3C;

/**
 *
 * @author Jimmy
 */
public class Carreras {
    public String tipo;
    public String nombre;
    public String alumnos;
    
    
//Constructor
    public Carreras(String tipo, String nombre, String alumnos){
        this.tipo = tipo;
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    public void mostrarDatos() {
        System.out.println("El tipo de carrera es: " +tipo);
        System.out.println("El nombre de la carrera es: " +nombre);
        System.out.println("La cantidad de alumnos es: " +alumnos);
    }
      
    
}
