Pasos para implementar el patrón Proxy:

1. Definir la Interfaz Común (ConexionInternet): Crear una interfaz que declare las operaciones que tanto el objeto real como el proxy deben cumplir (ej. conectarA()).
2. Crear el Objeto Real (InternetReal): Implementar la clase que hace el trabajo pesado y sin restricciones.
3. Crear la Clase Proxy (ProxyInternet): Implementar la interfaz común y agregarle un atributo para guardar una referencia al Objeto Real.
4. Implementar el Control: Escribir la lógica en el Proxy para interceptar las llamadas (ej. verificar la lista negra) y, solo si se cumplen las reglas, delegar la ejecución al Objeto Real.
