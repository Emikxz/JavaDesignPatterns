class Almacen {
    public boolean HayStock(String producto) {
       System.out.println("Consultando stock de " + producto);
       return true;
    }
    public void Reservar(String producto) {
       System.out.println("Reservando " + producto);
    }
}