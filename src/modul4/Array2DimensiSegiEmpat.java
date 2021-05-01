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
public class Array2DimensiSegiEmpat {

    public static void main(String[] args) {
        int bilangan[][] = new int[5][3];
        bilangan[0][1] = 70;
        bilangan[1][1] = 18;
        bilangan[1][2] = 45;
        bilangan[2][1] = 75;
        bilangan[3][1] = 66;
        bilangan[4][0] = 89;

        int i, j;
        for (i = 1; i < 5; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(bilangan[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
