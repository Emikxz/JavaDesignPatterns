/**
 * ¿Qué es el patrón Adapter?
 * Es un patrón estructural que sirve para que dos clases con interfaces incompatibles puedan trabajar juntas
 * a través de una clase intermedia que traduce una interfaz a otra.
 *
 * ¿Qué ventaja tiene?
 * La principal es que puede reutilizar una clase existente sin modificarla (útil cuando viene de una librería externa,
 * ya está hecha y no la queremos tocar, o cuando un sistema ya trabaja con cierta interfaz y no queremos romper todo).
 *
 **/

public class Main {
    public static void main(String[] args) {
        EnchufeAmericano enchufeViejo = new EnchufeAmericano();

        EnchufeEuropeo adaptador = new AdaptadorAmericanoAEuropeo(enchufeViejo);

        Lampara lampara = new Lampara(adaptador);
        lampara.prender();
    }
}