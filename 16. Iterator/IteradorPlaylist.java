
public class IteradorPlaylist implements Iterador {
    private String[] canciones;
    private int posicion = 0;

    public IteradorPlaylist(String[] canciones) {
        this.canciones = canciones;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < canciones.length && canciones[posicion] != null;
    }

    @Override
    public String siguiente() {
        return canciones[posicion++];
    }
 
    
 }
