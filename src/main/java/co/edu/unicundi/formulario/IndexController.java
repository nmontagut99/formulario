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
    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
    }

    public void click (){
        System.out.println("Nombre :"+ this.nombre);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
