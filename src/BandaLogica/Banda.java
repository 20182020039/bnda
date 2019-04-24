/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BandaLogica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Banda {

    ArrayList<Musico> musicos = new ArrayList<Musico>();

    public void crearBanda() {
        Random r = new Random();
        int cantidad = r.nextInt(20);
        System.out.println("La banda tiene " + cantidad + " musicos");
        for (int i = 0; i < cantidad; i++) {
            musicos.add(new Musico());

        }
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.asignarInstrumento(this.generarInstrumento(r.nextInt(3)));

        }
    }

    public void afinarBanda() {
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.afinarInstrumento();

        }

    }

    public void tocarBanda() {
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.tocarInstrumento();

        }
    }

    private static Instrumento generarInstrumento(int aleatorio) {
        switch (aleatorio) {
            case 1:
                return new Guacharaca();
            case 2:
                return new Guitarra();
            case 3 :
                return new Bajo();
                default:
                    return new Violin();
        }
    }
}
