Pasos para implementar el patrón State:

1. Definir la Interfaz de Estado (EstadoReproductor): Declarar los métodos que representan las acciones que cambian según el estado (ej. presionarBoton()).
2. Crear los Estados Concretos (EstadoPausado, EstadoReproduciendo): Implementar la interfaz en diferentes clases, definiendo el comportamiento específico para ese estado exacto.
3. Crear el Contexto (Reproductor): Crear la clase principal que mantendrá una referencia al estado actual (estadoActual).
4. Delegar y Transicionar: Hacer que el Contexto delegue el trabajo a su estadoActual. Permitir que los Estados Concretos puedan cambiar el estado interno del Contexto.
