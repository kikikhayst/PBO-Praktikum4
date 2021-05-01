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
public class Array1Dimensi_1 {

    public static void main(String[] args) {
        int bilangan[] = new int[5];

        bilangan[0] = 1;
        bilangan[1] = 2;
        bilangan[2] = 3;
        bilangan[3] = 4;
        bilangan[4] = 5;
        for (int a = 0; a < 5; a++) {
            System.out.println("Bilangan ke-" + a + " adalah " + bilangan[a]);
        }
    }
}
