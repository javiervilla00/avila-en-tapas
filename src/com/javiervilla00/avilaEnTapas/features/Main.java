package com.javiervilla00.avilaEnTapas.features;

import com.javiervilla00.avilaEnTapas.features.tapas.data.TapaDataRepository;
import com.javiervilla00.avilaEnTapas.features.tapas.domain.Tapa;
import com.javiervilla00.avilaEnTapas.features.tapas.presentation.MainTapa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a Ávila en tapas! \n¿Eres un usuario particular(1) o un establecimiento(2)?");
        Scanner sc = new Scanner(System.in);
        int usuario = sc.nextInt();

        while (usuario < 1 || usuario > 2) {
            System.out.println("Opción incorrecta, si eres particular ingresa 1 y si eres un establecimiento ingresa 2.");
            usuario = sc.nextInt();
        }
        switch (usuario) {
            case (1):
                System.out.println("¿Qué acción te gustaría realizar? \n(1)Ver lista de tapas \n(2) Salir");
                int accionUsuario = sc.nextInt();
                switch (accionUsuario) {
                    case (1):
                        MainTapa.printTapas();
                        System.out.println("¿Te gustaría votar por alguna tapa? (si o no)");
                        String siNo = sc.next().toLowerCase();
                        if (siNo.equals("si")) {
                            System.out.println("Escribe el id de la tapa:");
                            String idVote = sc.next();

                            double puntuacion;
                            do {
                                System.out.println("Escribe la puntuación para " + MainTapa.obtainNameTapa(idVote) + " (puntuacion entre 0 y 5)");
                                puntuacion = sc.nextDouble();
                            } while (puntuacion < 0 && puntuacion > 5);
                            MainTapa.voteTapa(idVote, puntuacion);
                        }
                        break;
                    case (2):
                        System.out.println("Muchas gracias por utilizar Ávila en Tapas. \n¡Esperamos volver a verte pronto!");
                        break;
                }
                break;
            case (2):
                String siNo = "si";
                do {
                    System.out.println("Elige una de las siguientes opciones: \n(1) Consultar tapas. \n(2) Consultar una tapa. \n(3) Crear nueva tapa. \n(4) Modificar tapa. \n(5) Eliminar tapa. \n(6) Salir.");
                    int accionEmpresa = sc.nextInt();
                    switch (accionEmpresa) {
                        case (1):
                            MainTapa.printTapas();
                            System.out.println("¿Te gustaría realizar otra acción? (si o no)");
                            siNo = sc.next().toLowerCase();
                            break;
                        case (2):
                            System.out.println("Ingresa el id de la tapa a consultar: ");
                            String id = sc.next();
                            MainTapa.printTapa(id);
                            System.out.println("¿Te gustaría realizar otra acción? (si o no)");
                            siNo = sc.next().toLowerCase();
                            break;
                        case (3):
                            System.out.println("Ingresa el nombre de la tapa:");
                            String nombre = sc.next();
                            System.out.println("Ingresa el establecimiento de la tapa:");
                            String establecimiento = sc.next();
                            System.out.println("Ingresa el ingredientes de la tapa:");
                            String ingredientes = sc.next();
                            Tapa newTapa = new Tapa(MainTapa.newIdTapa(), nombre, establecimiento, "0", "0.0", "28", "0", ingredientes);
                            MainTapa.createTapa(newTapa);
                            System.out.println("¿Te gustaría realizar otra acción? (si o no)");
                            siNo = sc.next().toLowerCase();
                            break;
                        case (4):
                            MainTapa.printTapas();
                            System.out.println("Ingresa el id de la tapa a modificar:");
                            String updateId = sc.next();
                            System.out.println("Ingresa el nombre de la tapa:");
                            String nombreUpdate = sc.next();
                            System.out.println("Ingresa el establecimiento de la tapa:");
                            String establecimientoUpdate = sc.next();
                            System.out.println("Ingresa el ingredientes de la tapa:");
                            String ingredientesUpdate = sc.next();
                            Tapa tapaUpdate = new Tapa(updateId, nombreUpdate, establecimientoUpdate, ingredientesUpdate);
                            MainTapa.updateTapa(tapaUpdate);
                            System.out.println("¿Te gustaría realizar otra acción? (si o no)");
                            siNo = sc.next().toLowerCase();
                            break;
                        case (5):
                            MainTapa.printTapas();
                            System.out.println("Ingresa el id de la tapa a eliminar:");
                            String idEliminar = sc.next();
                            MainTapa.deleteTapa(idEliminar);
                            System.out.println("¿Te gustaría realizar otra acción? (si o no)");
                            siNo = sc.next().toLowerCase();
                            break;
                        case (6):
                            siNo = "no";
                            break;
                    }
                } while (!siNo.equals("no"));
                break;
        }
    }
}
