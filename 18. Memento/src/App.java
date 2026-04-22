public class App {
    public static void main(String[] args) throws Exception {
       Partida partida = new Partida(5, 200, 150, 100, "Edad Oscura");
        HistorialPartidas historial = new HistorialPartidas();

        System.out.println("Estado inicial:");
        partida.mostrarEstado();

        historial.agregarGuardado(partida.guardarPartida());

        partida.setAldeanos(10);
        partida.setComida(500);
        partida.setMadera(300);
        partida.setOro(250);
        partida.setEdad("Edad Feudal");

        System.out.println("Estado después de avanzar:");
        partida.mostrarEstado();

        partida.restaurarPartida(historial.obtenerGuardado(0));

        System.out.println("Estado restaurado:");
        partida.mostrarEstado();
    }    
}
