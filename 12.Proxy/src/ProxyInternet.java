import java.util.ArrayList; // Importamos listas para guardar los sitios bloqueados
import java.util.List;

// EL PROXY: El intermediario que la empresa pone para filtrar las páginas
public class ProxyInternet implements ConexionInternet {
    
    // El proxy necesita tener el objeto real para dejarte pasar si está todo bien
    private InternetReal internetReal = new InternetReal(); 
    
    // Una lista interna donde guardamos las paginas prohibidas
    private static List<String> sitiosBloqueados; 

    // Constructor: Aca definimos que paginas no se pueden ver
    public ProxyInternet() {
        sitiosBloqueados = new ArrayList<>(); // Inicializamos la lista
        sitiosBloqueados.add("facebook.com"); // Bloqueamos Facebook
        sitiosBloqueados.add("juegos.com");   // Bloqueamos juegos
    }

    // LA LÓGICA DEL PROXY: Se intercepta el pedido antes de ir al Internet Real
    @Override
    public void conectarA(String url) {
        // veo si la pagina que pide el usuario está en la lista negra
        if (sitiosBloqueados.contains(url.toLowerCase())) {
            // Si esta bloqueada frenamos el acceso y mostramos un error
            System.out.println("ACCESO DENEGADO: El sitio " + url + " esta bloqueado en esta red");
        } else {
            // Si NO está bloqueada el Proxy delega el trabajo al Internet Real
            internetReal.conectarA(url); 
        }
    }
}