/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.princetonjava;

/**
 *
 * @author x1869
 */
public class PrincetonJava {

    public static void main(String[] args) {
        System.out.println("Variables Declarartions!");
        
        
        int a = 1869;
        int b = 91;
        
        int exchange_vals = a;
        
        a = b;
        b  = exchange_vals ; 
        
        System.out.println(a); 
        System.out.println(b); 
        
        
        System.out.println("-----------");
        
        
        String c = "Details\n";
        String d = "Information\n";
        
       c = d;
        
        String swap_word = c;
         d= swap_word ;
        
        System.out.print(c);
        System.out.println(d);
                
                
    }
}
