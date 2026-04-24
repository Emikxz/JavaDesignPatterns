import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    //clase encargada de contener los tipos de arboles
    //usamos map para mejorar la optimizacion a la hora de buscar si ese tipo ya esta creado
    Map<String, TipoDeArbol>arboles= new HashMap<>();

    //metodo que busca si existe
    public TipoDeArbol obtenerArbol(String tipoDeArbol, String color, String textura) {
        //armamos la clave para aprovechar map y no usar un for
        String clave = tipoDeArbol + "-" + color + "-" + textura;
        //revisamos si ya existe esta clave en el map
        if (arboles.containsKey(clave)) {
            //retorna el objeto que esta guardado con esa clave
            return arboles.get(clave);
        }
        //si no existe creamos el nuevo arbol
        TipoDeArbol nuevo = new TipoDeArbol(tipoDeArbol, color, textura);
        //lo guardamos en arboles asi despues lo podemos reutilizar pasa a ser un nuevo tipo
        arboles.put(clave, nuevo);
        return nuevo;
    }
}
