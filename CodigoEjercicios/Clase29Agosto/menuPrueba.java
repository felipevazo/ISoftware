/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebapuente;

/**
 *
 * @author dci
 */
public class menuPrueba {

    public static void main(String[] args) {
       Tv tv=new Tv();
       ControlRemotoBasico cb1=new ControlRemotoBasico(tv);
       cb1.power();
       ControlRemotoAvanzado ca1=new ControlRemotoAvanzado(tv);
       ca1.power();
    }
    
}
