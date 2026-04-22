Pasos para implementar el patrón Command:

1. Definir la Interfaz Comando (Comando): Declarar un único método universal para ejecutar acciones (ej. ejecutar()).
2. Crear el Receptor (FocoInteligente): Programar la clase que contiene la lógica real y el trabajo físico (encender(), apagar()).
3. Implementar Comandos Concretos (ComandoEncenderFoco, ComandoApagarFoco): Crear clases que implementen la interfaz Comando. Deben guardar una referencia al Receptor y llamar a sus métodos específicos dentro de ejecutar().
4. Crear el Invocador (ControlRemoto): Construir la clase que almacenará un Comando y llamará a su método ejecutar() cuando sea necesario, sin saber qué hace internamente.
