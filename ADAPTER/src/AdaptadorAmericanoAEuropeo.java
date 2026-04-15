// Adapter: Hace que un enchufe americano parezca un enchufe europeo.

// Creamos la clase Adaptador que implementa a Enchufe Europeo, es decir
// Obliga a esta clase a tener el método conectar220V
// En otras palabras, el adaptador se hace pasar por un enchufe europeo.
public class AdaptadorAmericanoAEuropeo implements EnchufeEuropeo {
    private EnchufeAmericano enchufeAmericano; // Declaramos el atributo privado que hace referencia a un objeto tipo EnchufeAmericano
                                                // Sirve para que el adaptador pueda trabajar internamente con el enchufe americano real.

    // Constructor del adaptador que recibe como parámetro un objeto EnchufeAmericano
    public AdaptadorAmericanoAEuropeo(EnchufeAmericano enchufeAmericano) {
        this.enchufeAmericano = enchufeAmericano;
    }

    @Override // Sobreescribimos el método de la interfaz.
    public void conectar220V() {
        System.out.println("Adaptando de 220V a 110V");
        enchufeAmericano.conectar110V(); // Cuando alguien llama a este método, el adaptador por dentro llama al método del enchufe americano.
        // Afuera parece europeo pero adentro usa el enchufe americano.
    }
}
