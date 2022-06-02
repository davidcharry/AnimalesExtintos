/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalextinto;

/**
 *
 * @author mono-
 */
public class Datos{

    public String libros;
    public int fechas;

    public Datos(String libros, int fechas) {
        this.libros = libros;
        this.fechas = fechas;
    }

    @Override
    public String toString() {
        return libros + "," + fechas;
    }
}
