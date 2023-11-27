import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Ventas> ventas = new ArrayList<>();
        ArrayList<String> beneficiosProducto = new ArrayList<>();
        boolean continuar_programa = true;

        do {
            System.out.println("\n");
            String menu = """                    
                    1 - Introducir venta
                    2 - Mostrar todas las ventas
                    3 - Mostrar beneficio actual
                    4 - Producto con mayor beneficio
                    """;
            System.out.println(menu);
            String opcion = input.next();

            switch (opcion) {
                case "1":
                    crearVenta(input, ventas);
                    break;
                case "2":
                    for (int i = 0; i < ventas.size(); i++) {
                        System.out.println(ventas.get(i));
                    }
                    break;
                case "3":
                    float total = 0;
                    for (int i = 0; i < ventas.size(); i++) {
                        total += ventas.get(i).getBeneficio_venta();
                    }
                    System.out.println("Beneficio actual : " + total + "€");
                    break;
                case "4":
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Operación no reconocida");
                    continuar_programa = false;
            }
        } while (continuar_programa);

 }

    public static void crearVenta(Scanner input,
                                  ArrayList ventas) {
        System.out.println("Nombre del producto:");
        String nombre_producto = input.next();
        System.out.println("Cantidad de unidades:");
        int unidades = input.nextInt();
        System.out.println("Precio de venta:");
        float precio_venta = input.nextFloat();
        System.out.println("Precio de coste:");
        float precio_coste = input.nextFloat();
        System.out.println("Vendedor:");
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