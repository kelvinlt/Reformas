/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reformas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author DAM
 */
public class Reformas {

    private static ArrayList<Cliente> clientes;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clientes = new ArrayList<>();
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = pedirEntero("Ecoge una opcion:");
            System.out.println("============================");
            switch (opcion) {
                case 1:
                    System.out.println("Has escogido:");
                    System.out.println("1.Alta cliente");
                    addCliente();
                    break;

                case 2:
                    System.out.println("Has escogido:");
                    System.out.println("2.Nuevo presupuesto");
                    break;

                case 3:
                    System.out.println("Has escogido:");
                    System.out.println("3.Presupuestos pendientes");
                    break;

                case 4:
                    System.out.println("Has escogido:");
                    System.out.println("4.Listado de presupuestos de un cliente determinado");
                    break;

                case 5:
                    System.out.println("Has escogido:");
                    System.out.println("5.Listado de presupuestos rechazados");
                    break;

                case 6:
                    System.out.println("Has escogido:");
                    System.out.println("6.Listado de clientes con total presupuesto de cada");
                    break;

                case 7:
                    System.out.println("Has escogido:");
                    System.out.println("7.Cambiar estado presupuesto");
                    break;

                case 8:
                    System.out.println("Has escogido:");

                    System.out.println("8.Salir");
                    break;
            }
        } while (opcion != 8);
    }

    public static void mostrarMenu() {
        System.out.println("=====Menu Principal=====");
        System.out.println("1.Alta cliente");
        System.out.println("2.Nuevo presupuesto");
        System.out.println("3.Presupuestos pendientes");
        System.out.println("4.Listado de presupuestos de un cliente determinado");
        System.out.println("5.Listado de presupuestos rechazados");
        System.out.println("6.Listado de clientes con total presupuesto de cada");
        System.out.println("7.Cambiar estado presupuesto");
        System.out.println("8.Salir");
    }

    public static void addCliente() {
        int telefono = pedirEntero("Telefono:");
        if (clientes.contains(new Cliente(telefono))) {
            System.out.println("Ya existe un cliente con este numero de telefono");
        }else{
            String nombre = pedirCadena("Nombre");
            String apellido = pedirCadena("Apellido");
            String vip = pedirCadena("Es Vip? Y/N");
            if(vip.equals("Y")){
                Boolean vipB00oolean = true;
            }
            
        }

    }

    public static int pedirEntero(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        boolean error = true;
        do {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error entrada y salida!");
                //Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException ex) {
                System.out.println("Debes escribir un numero!");
            }
        } while (error);
        return numero;
    }

    public static String pedirCadena(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = "";
        boolean error = true;
        do {
            System.out.println(mensaje);
            try {
                texto = br.readLine();
                if (texto.equals("")) {
                    System.out.println("No puedes dejar en blanco los datos");

                } else {
                    error = false;
                }
            } catch (IOException ex) {
                System.out.println("Error de entrada y salida");
            }
        } while (error);
        return texto;
    }

    public static double pedirDouble(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean error = true;
        do {
            System.out.println(mensaje);
            try {
                numero = Double.parseDouble(br.readLine());
                error = false;
            } catch (IOException e) {
                System.out.println("Error de entrada y salida");
            } catch (NumberFormatException ex) {
                System.out.println("Debes escribir un numero!");
            }
        } while (error);
        return numero;
    }

    public static int pedirMayorCero(String mensaje) {
        int numero;
        do {
            numero = pedirEntero(mensaje);
            if (numero <= 0) {
                System.out.println("Debes introducir un numero mayor a 0");
            }
        } while (numero <= 0);
        return numero;
    }

}
