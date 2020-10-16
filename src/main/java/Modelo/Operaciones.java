/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Nicolas Peralta
 * @author Brayan Suarez
 * @since 16/10/2020
 */
public class Operaciones {
    /**
     * Se defines las dos entradas de números
     */
    private int numero1;
    private int numero2;

    public Operaciones() {
        
    }
    /**
     * se devuelve el valor del numero 1
     * @return 
     */

    public int getNumero1() {
        return numero1;
    }
    /**
     * se establece el valor del numero 1
     * @param numero1 
     */
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    
    /**
     * Se devuelve el valor de numero 2
     * @return 
     */
    public int getNumero2() {
        return numero2;
    }
    
    /**
     * Se establece el valor del numero 2
     * @param numero2 
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    /**
     * Constructor para Operaciones
     * @param numero1
     * @param numero2 
     */
    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    /**
     * Se realalza la funcion de resta
     * @return 
     */
    public String Resta(){
        int suma = this.numero1 - this.numero2;
        return String.valueOf(suma);
    }
    
}
