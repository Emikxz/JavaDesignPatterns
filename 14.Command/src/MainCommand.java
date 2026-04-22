import java.util.Scanner;

public class MainCommand {
    public static void main(String[] args) {
        FocoInteligente miFocoLuz = new FocoInteligente(); 
        Comando ordenPrender = new ComandoEncenderFoco(miFocoLuz);
        Comando ordenApagar = new ComandoApagarFoco(miFocoLuz);
        ControlRemoto control = new ControlRemoto(); 
        
        Scanner teclado = new Scanner(System.in);
        String opcion = "";

        System.out.println("=== APP SMART HOME ===");
        System.out.println("1. Tocar boton para PRENDER luz");
        System.out.println("2. Tocar boton para APAGAR luz");
        System.out.println("0. Salir de la app");

        while (!opcion.equals("0")) {
            System.out.print("\nElija una opción (0, 1, 2): ");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    control.setComando(ordenPrender); // Configuramos el botón
                    control.presionarBoton();         // Lo apretamos
                    break;
                case "2":
                    control.setComando(ordenApagar);  // Configuramos el botón
                    control.presionarBoton();         // Lo apretamos
                    break;
                case "0":
                    System.out.println("Cerrando app...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        
        teclado.close();
    }
}