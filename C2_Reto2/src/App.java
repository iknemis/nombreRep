//import jdk.nashorn.internal.objects.annotations.Getter;

public class App {
    public static void main(String[] args) throws Exception {
           
        //Inicializacion de la lista de computadores
        Computador[] arregloComputadores = new Computador[5]; 
        //Definicion de cada componente de la lista 
        arregloComputadores[0] = new Computador(1200000); 
        arregloComputadores[1] = new Computador(19,1600000); 
        arregloComputadores[2] = new DeMesa(1300000,8); 
        arregloComputadores[3] = new Portatil(2016,21,1650000,true); 
        arregloComputadores[4] = new Portatil(1900000,false); 
        //Inicializacion de la solucion (Clase PrecioTotal) 
        PrecioTotal solucion = new PrecioTotal(arregloComputadores); 
        //Mostrar Totales 
        solucion.mostrarTotales();

        //Inicializacion de la lista de computadores 
        Computador[] arregloComputadores2 = new Computador[5]; 
        //Definicion de cada componente de la lista 
        arregloComputadores2[0] = new Computador(1200000); 
        arregloComputadores2[1] = new Computador(19,1600000); 
        arregloComputadores2[2] = new DeMesa(1300000,8); 
        arregloComputadores2[3] = new DeMesa(1650000,16); 
        arregloComputadores2[4] = new DeMesa(21,1659000); 
        //Inicializacion de la solucion (Clase PrecioTotal) 
        PrecioTotal solucion2 = new PrecioTotal(arregloComputadores2); 
        //Mostrar Totales
         solucion2.mostrarTotales();
    }
}


// Clase computador
class Computador {
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
