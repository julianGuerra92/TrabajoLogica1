package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    static char menu ()
    {

        char menu;
        Scanner lector = new Scanner(System.in);
        System.out.println("\n\n\t    MENÚ DE OPCIONES  ");
        System.out.println("\t1. Ingresar un nuevo vendedor.");
        System.out.println("\t2. Retirar un vendedor.(Ingrese el código): ");
        System.out.println("\t3. Promedio de ventas de la empresa.");
        System.out.println("\t4. Mayor venta total de mujeres.");
        System.out.println("\t5. Menor venta total de hombres. ");
        System.out.println("\t6. Total vendedores hombres o mujeres. (Ingrese el sexo): ");
        System.out.println("\t7. Mostrar todos los datos de la lista. (Ingrese el sentido): ");
        System.out.println("\t8. Salir.");
        do
        {
            System.out.println("");
            System.out.print("\t Ingrese la opción deseada: ");
            menu = lector.next().charAt(0);
            lector.nextLine();
        }
        while (menu <'1' || menu >'8');
        return menu;
    }
}