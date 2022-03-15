package pract4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);
        boolean salir = false;
        int op;


        while (!salir) {
            System.out.println("Eliga una Opción: ");
            System.out.println("1: Curp");
            System.out.println("2: RFC");
            System.out.println("3: Salir");
            try {
                op = tec.nextInt();
                switch (op) {
                    case 1: {
                        Mexicano curp = new Mexicano(captura.captura2("Ingrese su nombre: "), 
                        		captura.captura2("Ingrese su primer apellido: "),
                                captura.captura2("Ingrese su segundo apellido: "),
                                captura.captura2("Ingrese su fecha de nacimiento AAAA/MM/DD: "),
                                captura.captura2("Ingrese su genero H/M: "),
                                captura.captura2("Ingrese el estado de nacimiento: \n")
                        );
                        curp.setCURP();
                        System.out.println("Su CURP es: " + curp.getCURP());
                        break;
                    }
                    case 2: {
                        Mexicano rfc = new Mexicano(captura.captura2("Ingrese su nombre: "), 
                        		captura.captura2("Ingrese su primer apellido: "),
                                captura.captura2("Ingrese su segundo apellido: "),
                                captura.captura2("Ingrese su fecha de nacimiento AAAA/MM/DD: "),
                                captura.captura2("Ingrese su genero H/M: "),
                                captura.captura2("Ingrese el estado de nacimiento: \n")
                        );

                        rfc.setRFC();
                        System.out.println("Su RFC es: " + rfc.getRFC());
                        break;
                    }
                    case 3: salir = true; break;
                    default: System.out.println("Escoga una opción valida\n"); break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nIngresa un número valido");
                tec.next();
            }
        }
    }
}

class captura{
    public static String captura2(String cap){
        Scanner tec= new Scanner(System.in);
        System.out.print(cap);
        return (tec.nextLine());
    }
}