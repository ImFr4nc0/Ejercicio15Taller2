/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class App {

    public static void main(String[] args) {
        double a,b,c,d;
        Scanner ent=new Scanner(System.in);
        System.out.print("ingrese el peso de a");
        a=ent.nextDouble();
        System.out.print("ingrese el peso de b");
        b=ent.nextDouble();
        System.out.print("ingrese el peso de c");
        c=ent.nextDouble();
        System.out.print("ingrese el peso de d");
        d=ent.nextDouble();
        if(a==b && a==c){
            if(d>a){
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO");
            }
            else{
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        }
        else if(a==d && a==c){
            if(b>a){
                System.out.println("LA ESFERA B ES LA DIFERENTE Y ES DE MAYOR PESO");
            }
            else{
                System.out.println("LA ESFERA B ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        }
        else if(a==b && a==d){
            if(c>a){
                System.out.println("LA ESFERA C ES LA DIFERENTE Y ES DE MAYOR PESO");
            }
            else{
                System.out.println("LA ESFERA C ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        }
        else{
            if(a>b){
                System.out.println("LA ESFERA A ES LA DIFERENTE Y ES DE MAYOR PESO");
            }
            else{
                System.out.println("LA ESFERA A ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        }
    }
}
