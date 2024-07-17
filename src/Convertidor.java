import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Bienvenido al convertidor de divisas");
            System.out.println("1. Convertir de Dólar a Peso Argentino");
            System.out.println("2. Convertir de Peso Argentino a Dólar");
            System.out.println("3. Convertir de Dólar a Real Brasileño");
            System.out.println("4. Convertir de Dólar a Peso Colombiano");
            System.out.println("5. Convertir de Peso Colombiano a Dólar");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertUsdToArs(scanner);
                    break;
                case 2:
                    convertArsToUsd(scanner);
                    break;
                case 3:
                    convertUsdToBrl(scanner);
                    break;
                case 4:
                    convertUsdToCop(scanner);
                    break;
                case 5:
                    convertCopToUsd(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del convertidor de divisas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void convertUsdToArs(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Dólares (USD): ");
        double usd = scanner.nextDouble();
        double ars = usd * 270.0; // Tasa de conversión ficticia
        System.out.printf("USD %.2f equivalen a ARS %.2f%n", usd, ars);
    }

    private static void convertArsToUsd(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Pesos Argentinos (ARS): ");
        double ars = scanner.nextDouble();
        double usd = ars * 0.0037; // Tasa de conversión ficticia
        System.out.printf("ARS %.2f equivalen a USD %.2f%n", ars, usd);
    }

    private static void convertUsdToBrl(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Dólares (USD): ");
        double usd = scanner.nextDouble();
        double brl = usd * 4.8; // Tasa de conversión ficticia
        System.out.printf("USD %.2f equivalen a BRL %.2f%n", usd, brl);
    }

    private static void convertUsdToCop(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Dólares (USD): ");
        double usd = scanner.nextDouble();
        double cop = usd * 3900.0; // Tasa de conversión ficticia
        System.out.printf("USD %.2f equivalen a COP %.2f%n", usd, cop);
    }

    private static void convertCopToUsd(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Pesos Colombianos (COP): ");
        double cop = scanner.nextDouble();
        double usd = cop * 0.00026; // Tasa de conversión ficticia
        System.out.printf("COP %.2f equivalen a USD %.2f%n", cop, usd);
    }
}



