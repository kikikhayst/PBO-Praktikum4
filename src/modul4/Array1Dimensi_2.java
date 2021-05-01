/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Array1Dimensi_2 {

    public static void main(String[] args) {
        int bilangan[] = new int[5];
        for (int a = 0; a < 5; a++) {
            String angka = JOptionPane.showInputDialog("Masukkan bilangan:");
            bilangan[a] = Integer.parseInt(angka);
        }
        for (int a = 0; a < 5; a++) {
            System.out.println("Elemen ke-" + a + " adalah " + bilangan[a]);
        }
    }
}
