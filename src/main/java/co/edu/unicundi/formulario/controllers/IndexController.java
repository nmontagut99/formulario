/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.formulario.controllers;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
/**
 * Versión 2.0.0
 * @author Montagut Nicolás / Trejos Joseph
 */

@Named(value = "indexController")
@RequestScoped
public class IndexController {
    
    private String nombre;//cada variable debe tener un metodo get y set
    private String apellido;
    private String estudios;
    private int cedula;
    private int dias;
    private int sueldobase;
    private int salario;
    private int cont;
    private String [] listaIdiomas;
    //private List<String> idiomasSeleccionados;
    //private int nacimiento;
    
    //private List<SelectItem> listaEstudios;
    
    public IndexController() {
        cedula = 0;
        dias = 0;
        sueldobase = 30000;
    }

    public void click (){
        System.out.println("Cedula: "+ cedula + " ");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Idiomas: ");
        
        //System.out.println("fecha nacimiento:"+nacimiento); falta declarar, implementar, asignar valor, get y set
        language();
        System.out.println("Estudios: "+this.estudios);
        System.out.println("Dias trabajados: "+this.dias);
    }
   
    public void calcular(){
        salario = sueldobase *dias;
        cont = listaIdiomas.length;
        for (byte i = 0; i < cont; i++) {
            salario = salario + 3000;
        }
        
        switch(estudios){
            case "Tecnico":
                salario = salario + 1000;
                break;
            case "Tecnologo":
                salario = salario + 2000;
                break;
            case "Profesional":
                salario = salario + 3000;
                break;
            case "Master":
                salario = salario + 4000;
                break;                
            default:
                break;
        }
        
        imprimeSalario(salario);
    }
    
    public void language(){
        for(String idioma: listaIdiomas){
            System.out.println(idioma);
        }
    }
    
    private void imprimeSalario(int salario) {
        System.out.println(salario);
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String[] getListaIdiomas() {
        return listaIdiomas;
    }

    public void setListaIdiomas(String[] listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }
    
    public int getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(int sueldobase) {
        this.sueldobase = sueldobase;
    }
    
    

    /*public List<String> getIdiomasSeleccionados() {
        return idiomasSeleccionados;
    }

    public void setIdiomasSeleccionados(List<String> idiomasSeleccionados) {
        this.idiomasSeleccionados = idiomasSeleccionados;
    }*/

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
   
}
