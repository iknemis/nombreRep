public class Portatil extends Computador{
    // Con extends se heredan los métodos y atributos de
    // Atributos
    private boolean tarjetaDeVideo = false;
    //Getter
    public boolean isTarjetaDeVideo() {
        return tarjetaDeVideo;
    }
    //Setter
    public void setTarjetaDeVideo(boolean tarjetaDeVideo) {
        this.tarjetaDeVideo = tarjetaDeVideo;
    }
    
    //Constructores
    public Portatil(double precioBase, boolean tarjetaDeVideo){
        this.setPrecioBase(precioBase);
        this.setTarjetaDeVideo(tarjetaDeVideo);
        }
    public Portatil(double pantalla, double precioBase, boolean tarjetaDeVideo){
        this.setPantalla(pantalla);
        this.setPrecioBase(precioBase);
        this.setTarjetaDeVideo(tarjetaDeVideo);
        }
    public Portatil(double ano, double pantalla, double precioBase, boolean tarjetaDeVideo){
        this.setAno(ano);
        this.setPantalla(pantalla);
        this.setPrecioBase(precioBase);
        this.setTarjetaDeVideo(tarjetaDeVideo);
        }

    // Métodos
    // Método para calcular precio de un computador Portatil 
    public double calcularPrecio(){
        double factor; // El precio varia en función de si tiene o no tarjeta de video
        if (this.isTarjetaDeVideo()){
            factor = 1.2;
        } else {
            factor = 1;
        }
        double precioFinal = this.getPrecioBase() * (this.getAno()/2021) * (this.getPantalla()/16) * factor; 
        return precioFinal;
    }
}
