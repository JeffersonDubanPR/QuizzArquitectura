package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Auto> listaAutos = new ArrayList<>();

            while (true) {
                System.out.println("\n Menú");
                System.out.println("1 Crear auto");
                System.out.println("2 Buscar placa");
                System.out.println("3 Mostrar autos");
                System.out.println("4 Salir");
                System.out.print("Elige una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        Auto nuevoAuto = new Auto();

                        System.out.print("Marca ");
                        nuevoAuto.setMarca(scanner.nextLine());
                        System.out.print("Modelo ");
                        nuevoAuto.setModelo(scanner.nextLine());
                        System.out.print("Año ");
                        nuevoAuto.setAnio(scanner.nextInt());
                        System.out.print("Kilometraje ");
                        nuevoAuto.setKilometraje(scanner.nextDouble());
                        scanner.nextLine();
                        System.out.print("Estado: ");
                        nuevoAuto.setEstado(scanner.nextLine());
                        System.out.print("Placa: ");
                        nuevoAuto.setPlaca(scanner.nextLine());

                        listaAutos.add(nuevoAuto);
                        System.out.println("Auto Registrado");
                        break;

                    case 2:
                        System.out.print("Ingrese la placa a buscar");
                        String placaBuscar = scanner.nextLine();
                        boolean encontrado = false;

                        for (Auto auto : listaAutos) {
                            if (auto.getPlaca().equalsIgnoreCase(placaBuscar)) {
                                auto.mostrarDetalle();
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró un auto con esa placa");
                        }
                        break;

                    case 3:
                        if (listaAutos.isEmpty()) {
                            System.out.println("No hay autos registrados.");
                        } else {
                            System.out.println("\nLista de autos");
                            for (Auto auto : listaAutos) {
                                System.out.println(auto);
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Salir");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Intenta de nuevo");

                    // case 5:
                }
            }
        }
    }




