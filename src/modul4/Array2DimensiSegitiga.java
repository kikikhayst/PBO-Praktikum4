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
public class Array2DimensiSegitiga {

    public static void main(String args[]) {
        int sel[][] = new int[4][];
        int i, j;
        for (i = 0; i < sel.length; i++) {
            sel[i] = new int[i + 1];
        }
        for (i = 0; i < sel.length; i++) {
            for (j = 0; j < sel[i].length; j++) {
                sel[i][j] = i + j;
            }
        }
        for (i = 0; i < sel.length; i++) {
            for (j = 0; j < sel[i].length; j++) {
                System.out.print(sel[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
