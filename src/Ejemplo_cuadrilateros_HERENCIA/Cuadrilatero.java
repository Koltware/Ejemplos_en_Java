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
public class Cuadrilatero {
    //declaramos los atributos del obejeto "cuadrilatero"
    //en este caso los lados las medidas de los lados
    private int x1,y1;
    private int x2,y2;
    private int x3,y3;
    private int x4,y4;
    
    //ecapsulamos cada parametro y escribimos un get(obtener) y set(poner) para cada objeto
    //depende del IDE que estes usando el comando de teclas es diferente 
    //netbeans ALT+Insert y selecciona getter and setter
    //eclipse  ALT + MAYÚS + S y selecciona getter and setter
    //-----------------------------------------------------------------------------------------------
    public int getX1() {//con este metodo obtenemos el valor de la variable x1
        return x1;
    }

    public void setX1(int x1) {//con este metodo le asignamos el valor a la variable x1
        this.x1 = x1;
    }
    //-----------------------------------------------------------------------------------------------

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
    //-----------------------------------------------------------------------------------------------

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }
    //-----------------------------------------------------------------------------------------------

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    //-----------------------------------------------------------------------------------------------

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }
    //-----------------------------------------------------------------------------------------------

    public int getY3() {
        return y3;
    }
    //-----------------------------------------------------------------------------------------------

    public void setY3(int y3) {
        this.y3 = y3;
    }
    //-----------------------------------------------------------------------------------------------
    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }
    //-----------------------------------------------------------------------------------------------

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }
    
}
