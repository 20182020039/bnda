/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BandaLogica;

/**
 *
 * @author Estudiantes
 */
public class Musico {

    private Instrumento Instrumento;

    public void asignarInstrumento(Instrumento i) {
        this.Instrumento = i;

    }

    public void afinarInstrumento() {
        this.Instrumento.afinar();
    }

    public void tocarInstrumento() {
        this.Instrumento.tocar();
    }
}
