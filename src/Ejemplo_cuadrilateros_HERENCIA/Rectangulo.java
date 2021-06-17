/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_cuadrilateros_HERENCIA;

/**
 *
 * @author DELL
 */
public class Rectangulo extends Cuadrilatero {
    //declaramos los atributos unicos de un rectangulo 
    private int base,altura;
    
    //encapsulamos los atributos propios de un rectangulo

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
