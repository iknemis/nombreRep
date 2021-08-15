public class DeMesa extends Computador{
    //Atributos
    private double ram = 4;
    //Getter
    public double getRam() {
        return ram;
    }
    //Setter
    public void setRam(double ram) {
        this.ram = ram;
    }

    //Cosntructores
    public DeMesa(double precioBase, double ram){
        this.setPrecioBase(precioBase);
        this.setRam(ram);
        }
    public DeMesa(double pantalla, double precioBase, double ram){
        this.setPantalla(pantalla);
        this.setPrecioBase(precioBase);
        this.setRam(ram);
        }
    public DeMesa(double ano, double pantalla, double precioBase, double ram){
        this.setAno(ano);
        this.setPantalla(pantalla);
        this.setPrecioBase(precioBase);
        this.setRam(ram);
        }
 
    //Métodos    
    public double calcularPrecio(){
        double factor;
        // factor = 0.9 si class DeMesa y ram < 4
        // factor = 1.3 si class DeMesa y ram > 12
        // factor = 1.1 si class DeMesa y 4<=ram<=12 
        if (this.getRam() < 4 ){
            factor = 0.9;
        } else if (this.getRam() > 12 ){
            factor = 1.3;
        } else {
            factor = 1.1;
        }
        double precioFinal = this.getPrecioBase() * (this.getAno()/2021) * (this.getPantalla()/16) * factor; 
        return precioFinal;
    } 
}

        