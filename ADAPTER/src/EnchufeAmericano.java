// Clase existente que quiero reutilizar.
public class EnchufeAmericano {     // Creo la clase Enchufe Americano, que es una clase que ya existe, pero que
                                    // tiene el problema que no usa la interfaz que mi sistema espera.
    public void conectar110V() {    // Defino un método público para usar por otras clases que no devuelve nada,
                                    // solo representa el comportamiento del enchufe americano.
        System.out.println("Enchufe americano conectado a 110 Volts.");
    }
}
