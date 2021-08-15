public class PrecioTotal {
    // Atributos
    private double      totalComputadores;
    private double      totalPortatiles;
    private double      totalDeMesa;
    private Computador[]  listaComputadores;

    // Constructor 
    public PrecioTotal(Computador[] arreglo){
        this.listaComputadores = arreglo;
    }
    // Métodos
    public void mostrarTotales(){
        
        for (int x = 0; x < listaComputadores.length; x++){
            
            if (this.listaComputadores[x] instanceof Computador){
                this.totalComputadores = this.totalComputadores + this.listaComputadores[x].calcularPrecio();
            }

            if(this.listaComputadores[x] instanceof Portatil){
                this.totalPortatiles = this.totalPortatiles + this.listaComputadores[x].calcularPrecio();
            }

            if(this.listaComputadores[x] instanceof DeMesa){
                this.totalDeMesa = this.totalDeMesa + this.listaComputadores[x].calcularPrecio();
            }
        }

        System.out.println("La suma del precio de los computadores es de "+this.totalComputadores);
        System.out.println("La suma del precio de los portatiles es de "+totalPortatiles);
        System.out.println("La suma del precio de los de mesa es de "+totalDeMesa);

    }
}


  
 