public class App {
    public static void main(String[] args) throws Exception {
        Profesional carlos = new Profesional("carlos", Profesional.Especialidad.Generalista);
        Profesional marcos = new Profesional("marcos", Profesional.Especialidad.Cardiologo);
        Profesional juan = new Profesional("juan", Profesional.Especialidad.Traumatologo);
        Area urgencias = new Area("urgencias");
        urgencias.agregarElemento(carlos);
        urgencias.agregarElemento(marcos);
        Area hospital = new Area("hospital");
        /*agrego a hospital elementos de dos tipos diferentes para demostrar que en esta lista entran 
        elementos de distintos tipos
        Hospital
        |- urgencias - Profesionales 1, 2, 3
        |- profesionales 1, 2, 3
        */
        hospital.agregarElemento(urgencias);
        hospital.agregarElemento(juan);

        hospital.mostrarInformacion();
    }
}
