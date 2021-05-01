/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author ASUS
 */
public class Array1Dimensi_3 {

    public static void main(String[] args) {
        double total, nilaiRata, bilangan[] = {1, 2, 3, 4, 5};
        int a;
        for (a = 0; a < bilangan.length; a++) {
            System.out.println("Elemen ke-" + a + " adalah " + bilangan[a]);
        }
        total = 0;
        for (a = 0; a < bilangan.length; a++) {
            total += bilangan[a];
        }
        nilaiRata = total / bilangan.length;
        System.out.println("Nilai rata-rata = " + " " + nilaiRata);
    }
}
