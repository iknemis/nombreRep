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

            System.out.println("clase de "+x+" : "+listaComputadores[x].getClass()+" y su Precio Total es " +this.listaComputadores[x].calcularPrecio());
        }

        System.out.println("El precio total de los Computadores es de "+totalComputadores);
        System.out.println("La suma del precio de los Portatiles es de "+totalPortatiles);
        System.out.println("La suma del precio de los Computadores de Mesa es de "+totalDeMesa);
    }
}


  
 