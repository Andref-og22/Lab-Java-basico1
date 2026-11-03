public class Cafeteria {

    static void main(String[] args) {
        String productName = "Tinto";
        double productPrice = 1500.50;
        int cantidadInventario = 3;
        boolean availableToday = true;
        char categoria = 'f';

        System.out.printf("Producto: %s%nPrecio: %f%nCantidad: %d%nDisponible: %b%nCategoria: %c%n%n ", productName
                , productPrice, cantidadInventario,
                availableToday, categoria);

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

        final double IVA = switch (categoria){
            case 'B', 'b' -> 0.0;
            case 'F', 'f' -> 0.05;
            case 'C', 'c' -> 0.08;
            case 'P', 'p' -> 0.08;
            default -> 0.0;
        };
        System.out.printf("CATEGORIA: %c%nIVA: %f%n%n", categoria, IVA*100);

    }
}
