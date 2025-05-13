package p2_p2_conversor;

import BYTE.Bbyte;
import java.util.Scanner;

public class P2_P2_Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cantidad:");
        double cantidad = scanner.nextDouble();

        System.out.println("Seleccione la unidad:");
        System.out.println("1. BIT");
        System.out.println("2. BYTE");
        System.out.println("3. GIGABIT");
        System.out.println("4. GIGABYTE");
        System.out.println("5. MEBIBYTE");
        int opcion = scanner.nextInt();

        Bbyte.Unit unidadSeleccionada;

        switch (opcion) {
            case 1:
                unidadSeleccionada = Bbyte.Unit.BIT;
                break;
            case 2:
                unidadSeleccionada = Bbyte.Unit.BYTE;
                break;
            case 3:
                unidadSeleccionada = Bbyte.Unit.GIGABIT;
                break;
            case 4:
                unidadSeleccionada = Bbyte.Unit.GIGABYTE;
                break;
            case 5:
                unidadSeleccionada = Bbyte.Unit.MEBIBYTE;
                break;
            default:
                System.out.println("Opción inválida.");
                scanner.close();
                return;
        }

        Bbyte conversor = new Bbyte(cantidad, unidadSeleccionada);

        System.out.println("\nResultado de la conversión:");
        switch (opcion) {
            case 1:
                System.out.println("Bits: " + conversor.getBits());
                break;
            case 2:
                System.out.println("Bytes: " + conversor.getBytes());
                break;
            case 3:
                System.out.println("Gigabits: " + conversor.getGb());
                break;
            case 4:
                System.out.println("Gigabytes (GB): " + conversor.getMB());
                break;
            case 5:
                System.out.println("Mebibytes (MiB): " + conversor.getMiB());
                break;
        }

    }
}
