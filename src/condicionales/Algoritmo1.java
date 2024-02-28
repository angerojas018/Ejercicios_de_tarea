package condicionales;
import java.util.Scanner;
 /*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
   del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
   10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
   a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
   40% de descuento. El precio de cada computadora es de U$500. */
 public class Algoritmo1 { 
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buen día,¿Cuantas computadoras desea comprar?");
        
        int computadoras = sc.nextInt();
        sc.nextLine();
        
        int precio = 0;
        int descuento = 0;
        int tt = 0;
        
        if (computadoras < 5){
            precio = computadoras * 500;
            descuento = (int)(precio * 0.10);
            tt = precio - descuento;           
        }else if (computadoras >= 5 && computadoras < 10){
            precio = computadoras * 500;
            descuento = (int)(precio * 0.20);
            tt = precio - descuento; 
        }else if (computadoras >= 10){
            precio = computadoras * 500;
            descuento = (int)(precio * 0.40);
            tt = precio - descuento; 
        }
        System.out.println("El precio total de las computadoras,sin el descuento es de:" + precio);
        System.out.println("El descuento debido a la cantidad es de:" + descuento);
        System.out.println("El precio total de las computadoras con el descuento aplicado,es de:" + tt);
    }
}
/*Angela Maria Pizo Rojas u20232217752*/

