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
public class Array2DimensiString {

    public static void main(String args[]) {
        String ibukota[][] = {
            {"Indonesia", "Jakarta"},
            {"Finlandia", "Helsinki"}
        };
        for (int i = 0; i < ibukota.length; i++) {
            System.out.println((i+1)+". Ibukota " + ibukota[i][0] + " yaitu " + ibukota[i][1]);
        }
    }
}
