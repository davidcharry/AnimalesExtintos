/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalextinto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author mono-
 */
public class AnimalExtinto extends Datos implements Comparable<AnimalExtinto> {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<AnimalExtinto> animales = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] dato = sc.nextLine().split("&");
            animales.add(new AnimalExtinto(dato[0], Integer.parseInt(dato[1])));
        }
        Collections.sort(animales);
        System.out.println("after sort: " + animales);
    }

    public AnimalExtinto(String libros, int fechas) {
        super(libros, fechas);
    }
    
    @Override
    public int compareTo(AnimalExtinto o) {
        int res = this.fechas - o.fechas;
        if (res == 0) {
            return this.libros.compareTo(o.libros);
        }
        return res;
    }
}
