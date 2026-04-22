// LA INTERFAZ COMÚN: Ambos el internet real y el proxy deben conectarse a una web
public interface ConexionInternet {
    // Metodo que recibe la pagina a la que queremos entrar
    void conectarA(String url); 
}