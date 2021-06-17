/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_cuadrilateros_HERENCIA;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Main {
    //aqui se hacen las pruebas de la clase
    public static void main(String[] args) {
        int area=0;
        //primero creamos una instancia de la clase rectangulo
        Rectangulo recta=new Rectangulo();
        //con los metodos setter les asignamos el valor a cada variable segun se requiere
        recta.setX1(6);
        recta.setY1(3);

        recta.setX2(3);
        recta.setY2(3);

        recta.setX3(9);
        recta.setY3(3);

        recta.setX4(9);
        recta.setY4(6);

        recta.setAltura(3);
        recta.setBase(5);
        
        //y con los getter recuperamos dicho valor
        area=recta.getAltura()*recta.getBase();
        JOptionPane.showMessageDialog(null,"el area es de "+area+"CM^2\nlas primeras coordenadas fueron en ("+recta.getX1()+","+recta.getY1()+")");
        
    }
    
    
}
