/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Scanner;

/**
 *
 * @author CSE9
 */
public class BubbleSort {

    Scanner s = new Scanner(System.in);

    public void bubble_sort() {
        System.out.print("Enter the number of input you want >:");
        int n = s.nextInt();
        System.out.println("Enter the numbers: ");
        int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("index{"+i+"}= ");
            list[i] = s.nextInt();
        }
        
        System.out.println("Sorted Output:");
        for(int i = 0; i< n; i++){
            System.out.print(list[i]+" ");
        }

    }

}
