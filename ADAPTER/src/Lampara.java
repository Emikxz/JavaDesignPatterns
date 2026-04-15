// Clase cliente: solo sabe trabajar con enchufe europeo
public class Lampara {
    private EnchufeEuropeo enchufe; // La lámpara guarda un atributo llamado enchufe del tipo EnchufeEuropeo
    // Esto significa que la lámpara no conoce a EnchufeAmericano sino que solo sabe trabajar con algo que cumpla
    // con la interfaz enchufe europeo.

    // Constructor de la lámpara que recibe por parámetro un objeto de tipo Enchufe Europeo.
    public Lampara(EnchufeEuropeo enchufe) {
        this.enchufe = enchufe;
    }

    // Defino un método para que la lámpara intente prenderse.
    public void prender() {
        System.out.println("Intentando prender la lámpara...");
        enchufe.conectar220V(); // Acá es donde entra en juego el adapter, porque la lámpara cree que está usando un enchufe europeo
                                // pero en realidad le pasamos un adaptador, el adaptador traduce esa llamada al enchufe americano.
        System.out.println("La lámpara quedó prendida.");
    }
}
