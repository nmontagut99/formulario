/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.formulario;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author MontagutN
 */
@Named(value = "indexController")
@RequestScoped
public class IndexController {

    private String nombre;
    private String apellido;
    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
    }

    public void click (){
        System.out.println("Nombre :"+ this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
