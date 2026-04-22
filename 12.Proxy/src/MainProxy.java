import java.util.Scanner;

public class MainProxy{

    public static void main(String[] args){

        // creamos el proxy y lo usamos para conectarnos a diferentes sitios
        ConexionInternet redOficina = new ProxyInternet();
        Scanner teclado = new Scanner(System.in);
        String entradaUsuario = "";

        System.out.println("=== SISTEMA DE RED DE LA EMPRESA ===");
        System.out.println("Escriba 'salir' para apagar la computadora");

        // creamos un bucle que se repite hasta que el usuario escriba salir
        while(!entradaUsuario.equalsIgnoreCase("salir")){
            System.out.print("\nIngrese la URL a la que desea entrar: ");
            entradaUsuario= teclado.nextLine(); // leemos lo que escribió el usuario

            if(!entradaUsuario.equalsIgnoreCase("salir")){
                // le pasamos al proxy exactamente lo que el usuario escribió
                redOficina.conectarA(entradaUsuario);
            }

        }
        System.out.println("Apagando sistema...");
        teclado.close();
    }

}