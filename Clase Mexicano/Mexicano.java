package pract4;

public class Mexicano{
    String nombre, apellido1, apellido2,genero, estado, fecha,CURP, RFC;
    char ch;
    String mayus;

    public Mexicano(String nombre,String apellido1,String apellido2,String fecha,String genero,String estado){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha = fecha;
        this.genero = genero;
        this.estado = estado;
    }

    public void setCURP(){
        CURP = Character.toString(apellido1.charAt(0));
        for (int i = apellido1.length()-1; i >= 0; i--) {
            if (apellido1.charAt(i) == 'A'  || apellido1.charAt(i) == 'E'  ||apellido1.charAt(i) == 'I' || apellido1.charAt(i) == 'O' || apellido1.charAt(i) == 'U') {
                ch = apellido1.charAt(i);
            }
            if(apellido1.charAt(i) == 'a'  || apellido1.charAt(i) == 'e'  ||apellido1.charAt(i) == 'i' || apellido1.charAt(i) == 'o' || apellido1.charAt(i) == 'u') {
            	String mayus = apellido1.toUpperCase();
            	ch = mayus.charAt(i);
            }
            /*
            if(apellido1.charAt(i) == 'b'  || apellido1.charAt(i) == 'c'  ||apellido1.charAt(i) == 'd' || apellido1.charAt(i) == 'f' || apellido1.charAt(i) == 'g'|| apellido1.charAt(i) == 'h'|| apellido1.charAt(i) == 'j'|| apellido1.charAt(i) == 'k'|| apellido1.charAt(i) == 'l'|| apellido1.charAt(i) == 'm'|| apellido1.charAt(i) == 'n'|| apellido1.charAt(i) == 'p'|| apellido1.charAt(i) == 'q'|| apellido1.charAt(i) == 'r'|| apellido1.charAt(i) == 's'|| apellido1.charAt(i) == 't'|| apellido1.charAt(i) == 'v'|| apellido1.charAt(i) == 'w'|| apellido1.charAt(i) == 'x'|| apellido1.charAt(i) == 'y'|| apellido1.charAt(i) == 'z') {
            	String mayus = apellido1.toUpperCase();
            	ch = mayus.charAt(i);
            }
            if(apellido1.charAt(i) == 'B'  || apellido1.charAt(i) == 'C'  ||apellido1.charAt(i) == 'D' || apellido1.charAt(i) == 'F' || apellido1.charAt(i) == 'G'|| apellido1.charAt(i) == 'H'|| apellido1.charAt(i) == 'J'|| apellido1.charAt(i) == 'K'|| apellido1.charAt(i) == 'L'|| apellido1.charAt(i) == 'M'|| apellido1.charAt(i) == 'N'|| apellido1.charAt(i) == 'P'|| apellido1.charAt(i) == 'Q'|| apellido1.charAt(i) == 'R'|| apellido1.charAt(i) == 'S'|| apellido1.charAt(i) == 'T'|| apellido1.charAt(i) == 'V'|| apellido1.charAt(i) == 'W'|| apellido1.charAt(i) == 'X'|| apellido1.charAt(i) == 'Y'|| apellido1.charAt(i) == 'Z') {
            	String mayus = apellido1.toUpperCase();
            	ch = mayus.charAt(i);
            }
            */
        }
        CURP += ch;
        CURP += Character.toString(apellido2.charAt(0));
        CURP += Character.toString(nombre.charAt(0));
        for (int i = 2; i < fecha.length(); i++) {
            if (fecha.charAt(i) != '/') {
                CURP += Character.toString(fecha.charAt(i));
            }
        }
        CURP += Character.toString(genero.charAt(0));
        CURP += Character.toString(estado.charAt(0));
        for (int i = 0; i < estado.length(); i++) {
            if (estado.charAt(i) == ' ') {
                CURP += Character.toString(estado.charAt(i+1));
            }
        }
        for (int i = apellido1.length()-1; i >= 1; i--) {
            if (apellido1.charAt(i) != 'A' && apellido1.charAt(i) != 'E' && apellido1.charAt(i) != 'I' && apellido1.charAt(i) != 'O' && apellido1.charAt(i) != 'U') {
                ch = apellido1.charAt(i);
            }
            if(apellido1.charAt(i) == 'a'  || apellido1.charAt(i) == 'e'  ||apellido1.charAt(i) == 'i' || apellido1.charAt(i) == 'o' || apellido1.charAt(i) == 'u') {
            	String mayus = apellido1.toUpperCase();
            	ch = mayus.charAt(i);
            }
            if(apellido1.charAt(i) == 'b'  || apellido1.charAt(i) == 'c'  ||apellido1.charAt(i) == 'd' || apellido1.charAt(i) == 'f' || apellido1.charAt(i) == 'g'|| apellido1.charAt(i) == 'h'|| apellido1.charAt(i) == 'j'|| apellido1.charAt(i) == 'k'|| apellido1.charAt(i) == 'l'|| apellido1.charAt(i) == 'm'|| apellido1.charAt(i) == 'n'|| apellido1.charAt(i) == 'p'|| apellido1.charAt(i) == 'q'|| apellido1.charAt(i) == 'r'|| apellido1.charAt(i) == 's'|| apellido1.charAt(i) == 't'|| apellido1.charAt(i) == 'v'|| apellido1.charAt(i) == 'w'|| apellido1.charAt(i) == 'x'|| apellido1.charAt(i) == 'y'|| apellido1.charAt(i) == 'z') {
            	String mayus = apellido1.toUpperCase();
            	ch = mayus.charAt(i);
            }
            if(apellido1.charAt(i) == 'B'  || apellido1.charAt(i) == 'C'  ||apellido1.charAt(i) == 'D' || apellido1.charAt(i) == 'F' || apellido1.charAt(i) == 'G'|| apellido1.charAt(i) == 'H'|| apellido1.charAt(i) == 'J'|| apellido1.charAt(i) == 'K'|| apellido1.charAt(i) == 'L'|| apellido1.charAt(i) == 'M'|| apellido1.charAt(i) == 'N'|| apellido1.charAt(i) == 'P'|| apellido1.charAt(i) == 'Q'|| apellido1.charAt(i) == 'R'|| apellido1.charAt(i) == 'S'|| apellido1.charAt(i) == 'T'|| apellido1.charAt(i) == 'V'|| apellido1.charAt(i) == 'W'|| apellido1.charAt(i) == 'X'|| apellido1.charAt(i) == 'Y'|| apellido1.charAt(i) == 'Z') {
            	String mayus = apellido1.toUpperCase();
            	ch = mayus.charAt(i);
            }
        }
        CURP += ch;
        for (int i = apellido2.length()-1; i >= 1; i--) {
            if (apellido2.charAt(i) != 'A' && apellido2.charAt(i) != 'E' && apellido2.charAt(i) != 'I' && apellido2.charAt(i) != 'O' && apellido2.charAt(i) != 'U') {
                ch = apellido2.charAt(i);
            }
            if(apellido2.charAt(i) == 'a'  || apellido2.charAt(i) == 'e'  ||apellido2.charAt(i) == 'i' || apellido2.charAt(i) == 'o' || apellido2.charAt(i) == 'u') {
            	String mayus = apellido2.toUpperCase();
            	ch = mayus.charAt(i);
            }
            if(apellido2.charAt(i) == 'b'  || apellido2.charAt(i) == 'c'  ||apellido2.charAt(i) == 'd' || apellido2.charAt(i) == 'f' || apellido2.charAt(i) == 'g'|| apellido2.charAt(i) == 'h'|| apellido2.charAt(i) == 'j'|| apellido2.charAt(i) == 'k'|| apellido2.charAt(i) == 'l'|| apellido2.charAt(i) == 'm'|| apellido2.charAt(i) == 'n'|| apellido2.charAt(i) == 'p'|| apellido2.charAt(i) == 'q'|| apellido2.charAt(i) == 'r'|| apellido2.charAt(i) == 's'|| apellido2.charAt(i) == 't'|| apellido2.charAt(i) == 'v'|| apellido2.charAt(i) == 'w'|| apellido2.charAt(i) == 'x'|| apellido2.charAt(i) == 'y'|| apellido2.charAt(i) == 'z') {
            	String mayus = apellido2.toUpperCase();
            	ch = mayus.charAt(i);
            }
            if(apellido2.charAt(i) == 'B'  || apellido2.charAt(i) == 'C'  ||apellido2.charAt(i) == 'D' || apellido2.charAt(i) == 'F' || apellido2.charAt(i) == 'G'|| apellido2.charAt(i) == 'H'|| apellido2.charAt(i) == 'J'|| apellido2.charAt(i) == 'K'|| apellido2.charAt(i) == 'L'|| apellido2.charAt(i) == 'M'|| apellido2.charAt(i) == 'N'|| apellido2.charAt(i) == 'P'|| apellido2.charAt(i) == 'Q'|| apellido2.charAt(i) == 'R'|| apellido2.charAt(i) == 'S'|| apellido2.charAt(i) == 'T'|| apellido2.charAt(i) == 'V'|| apellido2.charAt(i) == 'W'|| apellido2.charAt(i) == 'X'|| apellido2.charAt(i) == 'Y'|| apellido2.charAt(i) == 'Z') {
            	String mayus = apellido2.toUpperCase();
            	ch = mayus.charAt(i);
            }
        }
        CURP += ch;
        for (int i = nombre.length()-1; i >= 1; i--) {
            if (nombre.charAt(i) != 'A' && nombre.charAt(i) != 'E' && nombre.charAt(i) != 'I' && nombre.charAt(i) != 'O' && nombre.charAt(i) != 'U') {
                ch = nombre.charAt(i);
            }
            if(nombre.charAt(i) == 'a'  || nombre.charAt(i) == 'e'  ||nombre.charAt(i) == 'i' || nombre.charAt(i) == 'o' || nombre.charAt(i) == 'u') {
            	String mayus = nombre.toUpperCase();
            	ch = mayus.charAt(i);
            }
            if(nombre.charAt(i) == 'b'  || nombre.charAt(i) == 'c'  ||nombre.charAt(i) == 'd' || nombre.charAt(i) == 'f' || nombre.charAt(i) == 'g'|| nombre.charAt(i) == 'h'|| nombre.charAt(i) == 'j'|| nombre.charAt(i) == 'k'|| nombre.charAt(i) == 'l'|| nombre.charAt(i) == 'm'|| nombre.charAt(i) == 'n'|| nombre.charAt(i) == 'p'|| nombre.charAt(i) == 'q'|| nombre.charAt(i) == 'r'|| nombre.charAt(i) == 's'|| nombre.charAt(i) == 't'|| nombre.charAt(i) == 'v'|| nombre.charAt(i) == 'w'|| nombre.charAt(i) == 'x'|| nombre.charAt(i) == 'y'|| nombre.charAt(i) == 'z') {
            	String mayus = nombre.toUpperCase();
            	ch = mayus.charAt(i);
            }
            if(nombre.charAt(i) == 'B'  || nombre.charAt(i) == 'C'  ||nombre.charAt(i) == 'D' || nombre.charAt(i) == 'F' || nombre.charAt(i) == 'G'|| nombre.charAt(i) == 'H'|| nombre.charAt(i) == 'J'|| nombre.charAt(i) == 'K'|| nombre.charAt(i) == 'L'|| nombre.charAt(i) == 'M'|| nombre.charAt(i) == 'N'|| nombre.charAt(i) == 'P'|| nombre.charAt(i) == 'Q'|| nombre.charAt(i) == 'R'|| nombre.charAt(i) == 'S'|| nombre.charAt(i) == 'T'|| nombre.charAt(i) == 'V'|| nombre.charAt(i) == 'W'|| nombre.charAt(i) == 'X'|| nombre.charAt(i) == 'Y'|| nombre.charAt(i) == 'Z') {
            	String mayus = nombre.toUpperCase();
            	ch = mayus.charAt(i);
            }
        }
        CURP += ch;
    }

    public String getCURP(){
        return CURP;
    }

    public void setRFC(){
    	String mayus1 = apellido1.toUpperCase();
        RFC = Character.toString(mayus1.charAt(0));
        String mayus2 = apellido1.toUpperCase();
        RFC += Character.toString(mayus2.charAt(1));
        String mayus3 = apellido2.toUpperCase();
        RFC += Character.toString(mayus3.charAt(0));
        String mayus4 = nombre.toUpperCase();
        RFC += Character.toString(mayus4.charAt(0));
        for (int i = 2; i < fecha.length(); i++) {
            if (fecha.charAt(i) != '/') {
                RFC += Character.toString(fecha.charAt(i));
            }
        }
    }
    public String getRFC(){
        return RFC;
    }
}