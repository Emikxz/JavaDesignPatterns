// EL OBJETO REAL: El acceso a Internet directo sin restricciones
public class InternetReal implements ConexionInternet {
    
    // Implementamos el metodo. Este objeto simplemente se conecta
    @Override
    public void conectarA(String url) {
        // Imprime que se conecto exitosamente a la pagina
        System.out.println("Conectando exitosamente a: " + url); 
    }
}