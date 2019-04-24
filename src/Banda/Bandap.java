/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banda;

import BandaLogica.Banda;

/**
 *
 * @author Estudiantes
 */
public class Bandap {

    public static void main(String[] args) {
        Banda b = new Banda();
        System.out.println("Creando la banda");
        b.crearBanda();
        System.out.println("");
        System.out.println("Afinando la banda");
        System.out.println("");
        b.afinarBanda();
        System.out.println("");
        System.out.println("Tocando Banda");
        System.out.println("");
        b.tocarBanda();
    }
}
