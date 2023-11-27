import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Ventas> ventas = new ArrayList<>();

        String menu = """
                1 - Introducir venta
                2 - Mostrar todas las ventas
                """;
        System.out.println(menu);
        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                crearVenta(Scanner input, ArrayList ventas);
                break;
            case 2:

                break;
            default:


        }

        Ventas venta1 = new Ventas("Portátil",
                2,
                500, 300,
                "Bill Gates");
        Ventas venta2 = new Ventas("Monitor",
                5, 250, 180, "Elon Musk");



/*
        for (int i = 0; i < nuestras_ventas.size(); i++) {
            System.out.println(nuestras_ventas.get(i));
            System.out.println("El beneficio fue de " + nuestras_ventas.get(i).getBeneficio_venta() + "€");
        }
*/


        // System.out.println(venta1);
        // float beneficio_venta1 = venta1.beneficio_unitario()* venta1.getCantidad_unidades();
        // System.out.println("Beneficio venta #1: " + beneficio_venta1+ "€");
    }

    public static void crearVenta(Scanner input, ArrayList ventas) {
        System.out.println("Nombre del producto:");
        String nombre_producto = input.next();
        System.out.println("Cantidad de unidades:");
        int unidades = input.nextInt();
        System.out.println("Precio de venta:");
        float precio_venta = input.nextFloat();
        System.out.println("Precio de coste:");
        float precio_coste = input.nextFloat();
        String vendedor = input.next();

        Ventas venta = new Ventas(
                nombre_producto,
                unidades,
                precio_venta,
                precio_coste,
                vendedor
                );

        ventas.add(venta);

    }

}