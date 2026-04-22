public class App {
    public static void main(String[] args) throws Exception {
        Enfermero carlos = new Enfermero();
        Medico juan = new Medico();
        Especialista martin = new Especialista();
        carlos.setSiguiente(juan);
        juan.setSiguiente(martin);

        Solicitud s1 = new Solicitud("accidente", 3);
        Solicitud s2 = new Solicitud("picadura", 1);
        Solicitud s3 = new Solicitud("fiebre", 2);

        carlos.manejarSolicitud(s1);
        carlos.manejarSolicitud(s2);
        carlos.manejarSolicitud(s3);
    }
}

/*instrucciones para terminal
javac -d bin src\*.java
java -cp bin App
 */