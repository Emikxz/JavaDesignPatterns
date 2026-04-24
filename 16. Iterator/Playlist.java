public class Playlist {
    private String[] canciones;
    private int cantidad = 0;

    public Playlist(int tamaño) {
        canciones = new String[tamaño];
    }

    public void agregarCancion(String nombre) {
        if (cantidad < canciones.length) {
            canciones[cantidad] = nombre;
            cantidad++;
        }
    }

    // Método clave: Crea el guía para recorrer esta lista específica
    public Iterador obtenerIterador() {
        return new IteradorPlaylist(canciones);
    }
}