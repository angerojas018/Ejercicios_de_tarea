package condicionales;
import java.util.Scanner;
/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS  % DESCUENTO
0 - 2                         0%
2.01 - 5                      10%
5.01 - 10                     15%
10.01 en adelante             20%
Determinar cuánto pagara una persona que compre manzanas en la frutería.*/
public class Algoritmo4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Bienvendidos a la Fruteria,¿Cuantos Kilos de Manzana desea comprar?");
        
double kilos = scanner.nextDouble();
double precioTotal = kilos * 1000; 
double descuento = 0;
        
if (kilos >= 0 && kilos <= 2){
descuento = (precioTotal * 0);
}
if (kilos >= 2.01 && kilos <= 5){
descuento = (precioTotal * 0.10);
} 
if (kilos >= 5.01 && kilos <= 10){
descuento = (precioTotal * 0.15);
}             
if (kilos >= 10.1){
descuento = (precioTotal * 0.20);
}
double precioConDescuento = precioTotal - (precioTotal - descuento);
System.out.println("El precio a pagar sin descuento es: $" + precioTotal);
System.out.println("El precio a pagar con descuento es: $" + precioConDescuento);
    }
}
/*Angela Maria Pizo Rojas u20232217752*/
                        
        
                 


         
         

