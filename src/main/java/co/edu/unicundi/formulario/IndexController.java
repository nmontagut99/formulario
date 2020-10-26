/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.formulario;

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
    private int cedula;
    
    //private int nacimiento;
    private String estudios;
    private List<SelectItem> listaEstudios;
    private String idiomas;
    private List<SelectItem> listaIdiomas;
    private byte dias;
    private byte sueldobase;
    
    public IndexController() {
        // aca se inicializan las variables 
        //ej: arriba se declara private int cedula;
        //aca se inicializa this.cedula=0;
        this.cedula=0;
        this.dias=0;
        this.sueldobase=(byte) 30000;
    }

    public void click (){
        System.out.println("Cedula:"+ this.cedula);
        /*System.out.println("Nombre:"+ this.nombre);
        System.out.println("Apellido:" + this.apellido);
        
        //System.out.println("fecha nacimiento:"+nacimiento); falta declarar, implementar, asignar valor, get y set
        System.out.println("estudios: "+this.estudios);
        System.out.println("Idiomas: "+this.idiomas);
        System.out.println("Dias trabajados: "+this.dias);*/
        
    }
    
    public void listaestudios(){
        listaEstudios = new ArrayList<SelectItem>();
	listaEstudios.add(new SelectItem(1, "Primaria"));
	listaEstudios.add(new SelectItem(2, "Secundaria"));
	listaEstudios.add(new SelectItem(3, "Tecnico"));
	listaEstudios.add(new SelectItem(4, "Tecnologo"));
	listaEstudios.add(new SelectItem(5, "Profsional"));
        listaEstudios.add(new SelectItem(6, "Magister"));
    }
    
    public void listaidiomas(){
        listaIdiomas = new ArrayList<SelectItem>();
	listaIdiomas.add(new SelectItem(2, "Ingles"));
	listaIdiomas.add(new SelectItem(3, "Frances"));
	listaIdiomas.add(new SelectItem(4, "Chino"));
        listaIdiomas.add(new SelectItem(5, "Ruso"));
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

    public List<SelectItem> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(List<SelectItem> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public List<SelectItem> getListaIdiomas() {
        return listaIdiomas;
    }

    public void setListaIdiomas(List<SelectItem> listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }

    public byte getDias() {
        return dias;
    }

    public void setDias(byte dias) {
        this.dias = dias;
    }
    
    
}
