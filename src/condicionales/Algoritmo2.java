package condicionales;
import java.util.Scanner;
/*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra. */
    public class Algoritmo2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Bienvenido!! ¿Cuantas llantas desea comprar?");
         
    int llantas = sc.nextInt();
    sc.nextLine();
         
    int preciocu = 0;
         
    if (llantas < 5){
        preciocu = 100;    
    }
    else if (llantas >= 5 && llantas <= 10){
        preciocu = 75;  
    }
    else if (llantas > 10){
        preciocu = 50;    
    }
    int preciott = preciocu * llantas;
         
    System.out.println("El precio de cada llanta,es de:$" + preciocu);
    System.out.println("El precio total de las llantas,es de:$" + preciott);
    }
 }
/*Angela Maria Pizo Rojas u20232217752*/

