import java.util.Scanner;
public class Cafeteria {

    static void main(String[] args) {
        // Ejercicio 1
        String productName = "Tinto";
        double productPrice = 1500.50;
        int cantidadInventario = 3;
        boolean availableToday = true;
        char categoria = 'f';

        System.out.printf("Producto: %s%nPrecio: %f%nCantidad: %d%nDisponible: %b%nCategoria: %c%n%n ", productName
                , productPrice, cantidadInventario,
                availableToday, categoria);


        // Ejercicio 2
        double descuento;
        double totalPago;
        boolean applyDescuento;
        if (productPrice > 30000){
            descuento = (productPrice * 15) / 100;
            totalPago = (productPrice * cantidadInventario) - descuento;
            applyDescuento = true;
        } else {
            descuento = 0;
            totalPago = productPrice * cantidadInventario;
            applyDescuento = false;
        }
        System.out.printf("Decuento: %f%n Total a pagar: %f%nSe aplicó descuento: %b%n%n", descuento, totalPago, applyDescuento);

        // Ejercicio 3
        final double IVA = switch (categoria){
            case 'B', 'b' -> 0.0;
            case 'F', 'f' -> 0.05;
            case 'C', 'c' -> 0.08;
            case 'P', 'p' -> 0.08;
            default -> 0.0;
        };
        System.out.printf("CATEGORIA: %c%nIVA: %f%n%n", categoria, IVA*100);

        // Ejercicio 4
        int inventario = 50;
        int consumo = 2;
        int numPedidos = 1;
        while (inventario >= 10){
            inventario -= consumo;
            System.out.println("Pedido #" + numPedidos + ": Se consumieron " + consumo + " unidades. Inventario restante: " + inventario);
            numPedidos ++;
        };
        System.out.println("\nEl inventario bajó de 10 unidades (Quedan: " + inventario + ").");

        // Ejercicio 5
        Scanner sc = new Scanner(System.in);
        double montoApertura;
        do {
            System.out.println("Ingrese el monto de apertura de caja:");
            montoApertura = sc.nextDouble();

            if (montoApertura <= 0){
                System.out.print("Error: El número que has ingresado es inválido, ingresa uno denuevo: " + "\n");
            }
        } while (montoApertura <= 0);
        System.out.print("CAJA ABIERTA  |  Monto registrado: $" + montoApertura + "\n");

        // Ejercicio 6
        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        double sumaPrecios = 0;

        for (int i = 0; i < precios.length; i++){
            sumaPrecios += precios[i];
        }

        for (int i = 0; i < productos.length; i++){
            System.out.println("\n" + (i + 1) + ". " + productos[i] + " | Precio: $" + precios[i]);
        }

        double promedio = sumaPrecios / precios.length;

        System.out.print("\nEl precio promedio del menú de la cafeteria es: $"+ promedio + "\n");
    }
}
