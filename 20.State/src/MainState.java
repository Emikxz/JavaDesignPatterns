import java.util.Scanner;

public class MainState {
    public MainState() {
    }

    public static void main(String[] args) {
        Reproductor miApp = new Reproductor(); 
        Scanner teclado = new Scanner(System.in);
        String tecla = "";

        System.out.println("=== REPRODUCTOR DE VIDEO ===");
        System.out.println("Presione 'P' + Enter para Play/Pause.");
        System.out.println("Escriba 'salir' para cerrar la app.");

        while (!tecla.equalsIgnoreCase("salir")) {
            System.out.print("\nAccion: ");
            tecla = teclado.nextLine(); 

            // Si el usuario apretó la P, disparamos el evento del reproductor
            if (tecla.equalsIgnoreCase("p")) {
                miApp.clickEnPlayPause(); 
            } else if (!tecla.equalsIgnoreCase("salir")) {
                System.out.println("Tecla no reconocida. Use 'P' o 'salir'.");
            }
        }

        System.out.println("Cerrando reproductor...");
        teclado.close();
    }
}