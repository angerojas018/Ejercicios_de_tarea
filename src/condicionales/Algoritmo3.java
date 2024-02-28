package condicionales;
import java.util.Scanner;
/* Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA
de algún aparato, si este cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19% */
public class Algoritmo3 {
public static void main(String[] args) { 
    Scanner scanner = new Scanner (System.in);
    System.out.print("Buen día, que precio tiene el reporductor sin IVA que desea?:");
    double precio = Double.parseDouble(scanner.nextLine());
    System.out.print("Alguna marca en especifico de la que quiera el reproductor?:");
    String marca = scanner.nextLine();
              
    if (precio >= 500){
    double porcentajeDescuento = 0.10;
    double descuento = precio * porcentajeDescuento;
    precio = precio - descuento;
    }
    if (marca.equals("NOSY")){
    double descuentoMarca = precio * 0.05;
    precio = precio - descuentoMarca;
    }
    double impuesto = precio * 0.19;
    precio = precio + impuesto;
    
    System.out.println("Al reproductor se le incluira IVA, por tanto tendra que pagar:" + precio);
    }
}
/*Angela Maria Pizo Rojas u20232217752*/


              



