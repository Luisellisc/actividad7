import java.util.Scanner;
import act.calcpotencia;

import static act.calcpotencia.calcularPotencia;

public class act7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] areas = new double[10];
        int contadorAreas = 0;

        boolean deseaSalir = false;

        while (!deseaSalir) {
            System.out.println("Calculadora de área de figuras geométricas");
            System.out.println("Elige una figura/Potencia:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Potencia");

            System.out.print("Introduce el número correspondiente a la figura: ");
            int opcion = 0;

            boolean entradaValida = false;

            while (!entradaValida) {
                try {
                    opcion = Integer.parseInt(scanner.nextLine());
                    entradaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes ingresar un número entero.");
                }
            }

            double area = 0.0;

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Introduce el radio del círculo: ");
                        double radio = Double.parseDouble(scanner.nextLine());
                        area = Math.PI * radio * radio;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debes ingresar un número para el radio del círculo.");
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Introduce el lado del cuadrado: ");
                        double lado = Double.parseDouble(scanner.nextLine());
                        area = lado * lado;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debes ingresar un número para el lado del cuadrado.");
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Introduce la base del triángulo: ");
                        double base = Double.parseDouble(scanner.nextLine());
                        System.out.print("Introduce la altura del triángulo: ");
                        double altura = Double.parseDouble(scanner.nextLine());
                        area = (base * altura) / 2;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debes ingresar un número para la base o la altura del triángulo.");
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Introduce la base del rectángulo: ");
                        double baseRectangulo = Double.parseDouble(scanner.nextLine());
                        System.out.print("Introduce la altura del rectángulo: ");
                        double alturaRectangulo = Double.parseDouble(scanner.nextLine());
                        area = baseRectangulo * alturaRectangulo;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debes ingresar un número para la base o la altura del rectángulo.");
                    }
                    break;
                case 5:
                    try {
                        System.out.print("Introduce el lado del pentágono: ");
                        double ladoPentagono = Double.parseDouble(scanner.nextLine());
                        System.out.print("Introduce la apotema del pentágono: ");
                        double apotemaPentagono = Double.parseDouble(scanner.nextLine());
                        area = (5.0 / 2) * ladoPentagono * apotemaPentagono;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debes ingresar un número para el lado o la apotema del pentágono.");
                    }
                    break;
                case 6:
                    System.out.print("Introduce la base: ");
                    double base = Double.parseDouble(scanner.nextLine());
                    System.out.print("Introduce el exponente: ");
                    int exponente = Integer.parseInt(scanner.nextLine());
                    double resultado = calcularPotencia(base, exponente);
                    System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una figura válida.");
                    break;
            }

            if (opcion >= 1 && opcion <= 5) {
                areas[contadorAreas] = area;
                contadorAreas++;
                System.out.println("El área de la figura seleccionada es: " + area);
            }


            System.out.print("¿Deseas salir? (si/no). Si quieres seguir calculando ingresa no: ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                deseaSalir = true;
            }
        }

        // Imprimir todas las áreas calculadas
        System.out.println("Áreas calculadas:");
        for (int i = 0; i < contadorAreas; i++) {
            System.out.println("Área " + (i + 1) + ": " + areas[i]);
        }

        scanner.close();
    }
}

