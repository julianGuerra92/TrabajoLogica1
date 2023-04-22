package org.example;

import java.util.*;

public class Main {
    public static ListaDoblementeLigada sellerList = new ListaDoblementeLigada();

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char opcion;
        String code, code1, name;
        char sex, order;
        float totalSales;
        Vendedor actualSeller;
        NodoDobleVendedor actualNodeSeller;

        do
        {
            opcion = menu();
            switch (opcion)
            {
                case '1':
                    System.out.println("---> Ingrese información del vendedor: ");
                    System.out.print("\t\t Código: ");
                    code = lector.nextLine();
                    if(sellerList.findByCode(code) == null){
                        System.out.print("\t\t Nombre: ");
                        name = lector.nextLine();
                        System.out.print("\t\t Sexo (f o m): ");
                        sex = lector.next().charAt(0);
                        System.out.print("\t\t Ventas totales: ");
                        totalSales = lector.nextFloat();
                        lector.nextLine();
                        System.out.println(sellerList.add(new Vendedor(code, name, sex, totalSales)));
                    }
                    else {
                        System.out.println("EL vendedor con el código "+code+" ya está creado.");
                    }

                    break;
                case '2':
                    System.out.print("---> Ingrese el código del vendedor: ");
                    code1 = lector.nextLine();
                    if(sellerList.findByCode(code1) == null){
                        System.out.println("El vendedor que deseas eliminar no existe");
                        break;
                    }
                    System.out.println(sellerList.removeByCode(code1));
                    break;
                case '3':
                    System.out.println("El promedio de ventas de la empresa es: $"+sellerList.averageSales());
                    break;
                case '4':
                    actualSeller = sellerList.topSellingByGender('f');
                    System.out.println("La vendedora "+actualSeller.getName()+" tiene las ventas totales de mayor valor entre las Vendedoras con $"+actualSeller.getTotalSales());
                    break;
                case '5':
                    actualSeller = sellerList.lessSellingByGender('m');
                    System.out.println("EL vendedor "+actualSeller.getName()+" tiene las ventas totales de menor valor entre los Vendedores con $"+actualSeller.getTotalSales());
                    break;
                case'6':
                    System.out.print("Ingrese el sexo: ");
                    sex = lector.next().charAt(0);
                    System.out.println(sellerList.totalSellersByGender(sex));
                    break;
                case '7':
                    System.out.print("De primero a último (p) o de último a primero (u): ");
                    order = lector.next().charAt(0);
                    if(order == 'p'){
                        printInfoRight();
                    }
                    else if(order == 'u'){
                        printInfoLeft();
                    }
                    else{
                        System.out.println("Esa opción no es válida");
                    }
                    break;
                case '8':
                    System.out.println("Usted ha escogido salir.");
            }
        }
        while(opcion != '8');
    }

    static char menu() {
        char menu;
        Scanner lector = new Scanner(System.in);
        System.out.println("\n\n\t    MENÚ DE OPCIONES  ");
        System.out.println("\t1. Ingresar un nuevo vendedor.");
        System.out.println("\t2. Retirar un vendedor.(Ingrese el código): ");
        System.out.println("\t3. Promedio de ventas de la empresa.");
        System.out.println("\t4. Mayor venta total de mujeres.");
        System.out.println("\t5. Menor venta total de hombres. ");
        System.out.println("\t6. Total vendedores hombres o mujeres. ");
        System.out.println("\t7. Mostrar todos los datos de la lista. (Ingrese el sentido): ");
        System.out.println("\t8. Salir.");
        do {
            System.out.println("");
            System.out.print("\t Ingrese la opción deseada: ");
            menu = lector.next().charAt(0);
            lector.nextLine();
        }
        while (menu < '1' || menu > '8');
        return menu;
    }

    static void printInfoLeft() {
        Vendedor seller = sellerList.traverseLeft();
        while (seller != null) {
            System.out.println(seller);
            seller = sellerList.traverseLeft();
        }
    }

    static void printInfoRight() {
        Vendedor seller = sellerList.traverseRight();
        while (seller != null) {
            System.out.println(seller);
            seller = sellerList.traverseRight();
        }
    }

}