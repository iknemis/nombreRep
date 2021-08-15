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

