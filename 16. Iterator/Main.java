public class Main {
    public static void main(String[] args) {
        Playlist miMusica = new Playlist(5);
        miMusica.agregarCancion("Ameba - Soda Stereo");
        miMusica.agregarCancion("Habana - Fito Paez");
        miMusica.agregarCancion("Loco - Andrés Calamaro");

        // Obtenemos el iterador (el guía)
        Iterador guia = miMusica.obtenerIterador();

        System.out.println("Reproduciendo Playlist:");
        
        // Mientras el guía diga que hay más...
        while (guia.tieneSiguiente()) {
            System.out.println("Escuchando: " + guia.siguiente());
        }
    }
}
