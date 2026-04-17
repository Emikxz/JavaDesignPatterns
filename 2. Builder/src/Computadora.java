//Objeto complejo que se va a construir 
public class Computadora {
    private String cpu_;
    private String ram_;
    private String storage_;

    public void setCpu(String cpu) {
        this.cpu_ = cpu;
    }
    public void setRam(String ram) {
        this.ram_ = ram;
    }
    public void setStorage(String storage) {
        this.storage_ = storage;
    }

    public void showSpecs() {
        System.out.println("CPU: " + cpu_);
        System.out.println("RAM: " + ram_);
        System.out.println("Storage: " + storage_);
    }
}
