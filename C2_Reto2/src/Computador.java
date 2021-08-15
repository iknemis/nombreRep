public class Computador {
    // Atributos
    private double  ano         = 2019;
    private double  pantalla    = 16;
    private double  precioBase  = 1570500;

    // getters
    public double getAno(){
        return ano;
    }
    public double getPantalla(){
        return pantalla;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    // setters
    public void setAno(double ano){
        this.ano =ano;
    }
    public void setPantalla(double pantalla){
        this.pantalla = pantalla;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
  
    
    // Constructores
    public  Computador (){/* Líneas de código */}
    public  Computador (double precioBaseInput){
        setPrecioBase(precioBaseInput);
        //precioBase = precioBaseInput;
    }
    public  Computador (double pantallaInput, double precioBaseInput){
        setPantalla(pantallaInput);
        setPrecioBase(precioBaseInput);
        //pantalla = pantallaInput;
        //precioBase = precioBaseInput;
    }
    public  Computador (double anoInput, double pantallaInput, double precioBaseInput){
        setAno(anoInput);
        setPantalla(pantallaInput);
        setPrecioBase(precioBaseInput);
        //ano = anoInput;
        //pantalla = pantallaInput;
        //precioBase = precioBaseInput;
    }
    
    // Métodos
    //método para calcular precio para cada computador
    public double calcularPrecio(){
        //factor = 1  para cualquier computador
        float factor = 1; 
        double precioFinal = this.getPrecioBase() * (this.getAno()/2021) * (this.getPantalla()/16) * factor;
        return precioFinal;
    }
}
