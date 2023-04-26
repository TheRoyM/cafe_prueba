package co.edu.unac.poo1.cafeteria.unidad1;

import co.edu.unac.poo1.cafeteria.unidad2.Unidad2;

import java.util.*;

public class Unidad1 {
    private static final int MAXIMA_OPCION_MENU = 7;
    public static void MenuPrincipal() {
        int opcionesMenu;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nPor favor digite una opción:");
            System.out.println("-------UNIDAD 2 Cafeteria 7w7------");
            System.out.println("1: Tamaño bean");
            System.out.println("2: LinkdList de Café");
            System.out.println("3: ArrayList de Café");
            System.out.println("4: Lista de Café Ascendente");
            System.out.println("5: Orden Café Descendente");
            System.out.println("6: Fusion de 2 listas");
            //    _
            //   (_)
            //   | |
            //  _| |_
            // (_)_(_)
            System.out.println(MAXIMA_OPCION_MENU + ". Salir de la aplicacion");

            opcionesMenu = entrada.nextInt();
            entrada.nextLine();

            switch (opcionesMenu) {
                case 1 -> Unidad2.calcularMedida();
                case 2 -> Unidad2.linkdList();
                case 3 -> Unidad2.cafeArrayList();
                case 4 -> Unidad2.listaCafeOrdenada();
                case 5 -> Unidad2.ordenDescendenteCafe();
                case 6 -> Unidad2.Fusionar2listas();
                case MAXIMA_OPCION_MENU -> System.out.println("Hasta pronto");
                default -> System.err.println("Error, opcion invalida");
            }
        } while (opcionesMenu != MAXIMA_OPCION_MENU);

    }
}
