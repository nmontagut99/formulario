/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.formulario.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author MontagutN
 */

@Named(value = "indexController")
@RequestScoped
public class IndexController {
    
    private String nombre;//cada variable debe tener un metodo get y set
    private String apellido;
    private String estudios;
    private String idiomas;
    private int cedula;
    private int dias;
    private int sueldobase;
    private List<String> listaIdiomas;
    private List<String> idiomasSeleccionados;
    //private int nacimiento;
    
    //private List<SelectItem> listaEstudios;
    
    
    
    public IndexController() {
        idiomasSeleccionados = new ArrayList<String>();
        idiomasSeleccionados.add("Ingles");
        idiomasSeleccionados.add("Francés");
        idiomasSeleccionados.add("Alemán");
        this.cedula=0;
        this.dias=0;
        this.sueldobase= 30000;
    }

    public void click (){
        System.out.println("Cedula:"+ this.cedula);
        System.out.println("Nombre:"+ this.nombre);
        System.out.println("Apellido:" + this.apellido);
        
        //System.out.println("fecha nacimiento:"+nacimiento); falta declarar, implementar, asignar valor, get y set
        System.out.println("Estudios: "+this.estudios);
        System.out.println("Idiomas: "+this.idiomas);
        System.out.println("Dias trabajados: "+this.dias);
        
    }
   
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public List<String> getListaIdiomas() {
        return listaIdiomas;
    }

    public void setListaIdiomas(List<String> listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }

    public int getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(int sueldobase) {
        this.sueldobase = sueldobase;
    }

    public List<String> getIdiomasSeleccionados() {
        return idiomasSeleccionados;
    }

    public void setIdiomasSeleccionados(List<String> idiomasSeleccionados) {
        this.idiomasSeleccionados = idiomasSeleccionados;
    }
    
}
