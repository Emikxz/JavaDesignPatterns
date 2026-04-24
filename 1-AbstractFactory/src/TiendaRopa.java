public class TiendaRopa {
    /*creamos esta clase con el objetivo que tienda de ropa no sepa que  esta creando es para desacoplar
    delega la responsabilidad a factory que es el encargado de crear*/
    private OutfitFactory factory;
    public TiendaRopa(OutfitFactory factory) {
        this.factory = factory;
    }

    /*pedimos que cree un jean y una remera,esto seria como hcaer new pero no lo hacemos porque creamos
    prestablecitos*/
    public void mostrarOutfit() {
        Jean jean = factory.crearJean();
        Remera remera = factory.crearRemera();

        jean.descripcion();
        remera.descripcion();
    }
}
