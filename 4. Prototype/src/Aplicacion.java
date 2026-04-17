package src;
import java.util.ArrayList;
import java.util.List;

// 4. Aplicacion.java (Clase Cliente)
// Demuestra cómo clonar una lista de formas sin saber qué tipo de forma es cada una.

public class Aplicacion {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        List<Forma> formasCopiadas = new ArrayList<>();

        // Creamos un círculo original.
        Circulo circulo = new Circulo();
        circulo.x = 10;
        circulo.y = 20;
        circulo.radio = 15;
        circulo.color = "Rojo";
        formas.add(circulo);

        // Clonamos el círculo individualmente.
        Forma otroCirculo = circulo.clonar();
        formas.add(otroCirculo);

        // Creamos un rectángulo.
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.ancho = 10;
        rectangulo.alto = 20;
        rectangulo.color = "Azul";
        formas.add(rectangulo);

        // PROCESO DE CLONACIÓN MASIVA:
        // Aquí está la magia: no importa si es Círculo o Rectángulo, todos saben cómo clonarse a sí mismos.
        for (Forma forma : formas) {
            formasCopiadas.add(forma.clonar());
        }

        // Validación de resultados.
        compararFormas(formas, formasCopiadas);
    }

    private static void compararFormas(List<Forma> lista1, List<Forma> lista2) {
        for (int i = 0; i < lista1.size(); i++) {
            // 1. Verificación de Identidad (Memoria)
            if (lista1.get(i) != lista2.get(i)) {
                System.out.println(i + ": Son objetos distintos en memoria (¡Bien!)");
                
                // 2. Verificación de Igualdad (Contenido)
                if (lista1.get(i).equals(lista2.get(i))) {
                    System.out.println(i + ": Y son idénticos en contenido (¡Clonación exitosa!)");
                } else {
                    // Este caso ocurriría si clonamos el objeto pero olvidamos copiar algún atributo
                    System.out.println(i + ": Pero NO son idénticos en contenido (¡Algo falló!)");
                }
            } else {
                // Este caso ocurriría si el método clonar() devuelve 'this' en lugar de un 'new' objeto
                System.out.println(i + ": Los objetos son la misma instancia (¡Error, no es un clon!)");
            }
        }
    }
}