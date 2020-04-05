/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgFVMA005;

import java.util.Scanner;

/**
 *
 * @author BINNILIDXI
 */
public class ProgFVMA005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingresa el valor del eje x: ");
        int x = datos.nextInt();
        System.out.print("\nIngresa el numero del eje y: ");
        int y = datos.nextInt();

        char[][] mat = new char[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j == 0 || i == y - 1 || i == 0 || j == x - 1) {
                    mat[i][j] = '1';
                } else {
                    mat[i][j] = '*';
                }

            }
        }
        System.out.println("\n\nMatriz No.1: \n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println(" ");

        }

        System.out.println("\nMatriz No.2: \n");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i <= x || j <= x || i <= x || j <= x) {
                    mat[i][j] = '0';
                    {
                        if (i <= j) {
                            mat[i][j] = '1';
                            {
                                if (i >= j) {
                                    mat[i][j] = ' ';
                                } else {
                                }
                            }
                        }
                    }
                } else {
                    mat[j][i] = ' ';
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println(" ");
        }

        System.out.println("\nMatriz No.3: \n");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ((i == j) || (i + j == (y - 1))) {
                    mat[i][j] = ' ';
                } else {
                    mat[i][j] = '1';
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println(" ");
        }

    }
}
