public class Portatil extends Computador{
    // Atributos
    private boolean tarjeraDeVideo = false;
    //Getter
    public boolean isTarjeraDeVideo() {
        return tarjeraDeVideo;
    }
    //Setter
    public void setTarjeraDeVideo(boolean tarjeraDeVideo) {
        this.tarjeraDeVideo = tarjeraDeVideo;
    }
    
    //Constructores
    public Portatil(double precioBase, boolean tarjetaDeVideo){
        this.setPrecioBase(precioBase);
        this.setTarjeraDeVideo(tarjeraDeVideo);
        }
    public Portatil(double pantalla, double precioBase, boolean tarjetaDeVideo){
        this.setPantalla(pantalla);
        this.setPrecioBase(precioBase);
        this.setTarjeraDeVideo(tarjeraDeVideo);
        }
    public Portatil(double ano, double pantalla, double precioBase, boolean tarjetaDeVideo){
        this.setAno(ano);
        this.setPantalla(pantalla);
        this.setPrecioBase(precioBase);
        this.setTarjeraDeVideo(tarjeraDeVideo);
        }

    // Métodos
    public double calcularPrecio(){
        double factor;
        if (this.isTarjeraDeVideo()){
            factor = 1.2;
        } else {
            factor = 1;
        }
        double precioFinal = this.getPrecioBase() * (this.getAno()/2021) * (this.getPantalla()/16) * factor; 
        return precioFinal;
    }
}
