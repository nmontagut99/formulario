/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.formulario.controllers;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
//import javax.faces.bean.ViewScoped;

/**
 * Versión 2.0.0
 * @author Montagut Nicolás / Trejos Joseph
 */

@Named(value = "indexController")
@RequestScoped
public class IndexController {
    
    private String nombre;
    private String apellido;
    private String estudios;
    private int cedula;
    private int dias;
    private int sueldobase; //Cantidad de dinero base que será pagada
    private int salario;    //Cantidad de dinero teniendo en cuenta extras
    private int cont;       //Cantidad de idiomas
    private String [] listaIdiomas;
    //private List<String> idiomasSeleccionados;
    //private int nacimiento;
    
    //private List<SelectItem> listaEstudios;
     /**
      * Constructor inicializando variables
      */
    public IndexController() {
        cedula = 0;
        dias = 0;
        sueldobase = 30000;
    }

    /**
     * Pruebas de resultados en pantalla
     */
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
   
    /**
     * Método para calcular el salario total de la persona
     */
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
    
    /**
     * Método para imprimir la lista de idiomas que habla
     */
    public void language(){
        for(String idioma: listaIdiomas){
            System.out.println(idioma);
        }
    }
    
    /**
     * Método de prueba para mostrar salario por consola
     * @param salario 
     */
    private void imprimeSalario(int salario) {
        System.out.println(salario);
    }
    
    /**
     * Obtener la cédula
     * @return 
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Asignar valor a cedula
     * @param cedula 
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    /**
     * Obtener el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asignar nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener el apellido
     * @return 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Asignar el apellido
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtener nivel de estudio
     * @return 
     */
    public String getEstudios() {
        return estudios;
    }

    /**
     * Asignar nivel de estudio
     * @param estudios 
     */
    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    /**
     * Obtener número de días trabajados
     * @return 
     */
    public int getDias() {
        return dias;
    }

    /**
     * Asignar dias trabajados
     * @param dias 
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * Obtener lista que almacena los idiomas
     * @return 
     */
    public String[] getListaIdiomas() {
        return listaIdiomas;
    }

    /**
     * Devuelve lista de idiomas
     * @param listaIdiomas 
     */
    public void setListaIdiomas(String[] listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }
    
    /**
     * Obtiene el sueldo
     * @return 
     */
    public int getSueldobase() {
        return sueldobase;
    }

    /**
     * Devuelve el sueldo base
     * @param sueldobase 
     */
    public void setSueldobase(int sueldobase) {
        this.sueldobase = sueldobase;
    }
    
    

    /*public List<String> getIdiomasSeleccionados() {
        return idiomasSeleccionados;
    }

    public void setIdiomasSeleccionados(List<String> idiomasSeleccionados) {
        this.idiomasSeleccionados = idiomasSeleccionados;
    }*/

    /**
     * Obtiene salario final
     * @return 
     */
    public int getSalario() {
        return salario;
    }

    /**
     * Asigna salario final
     * @param salario 
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }
   
}
