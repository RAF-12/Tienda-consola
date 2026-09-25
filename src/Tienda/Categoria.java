
package Tienda;

import java.util.ArrayList;

public class Categoria {
    private String nombre;
    private String codigo;
    private ArrayList<Producto> producto = new ArrayList<>();

    public Categoria(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public void agregarProducto(Producto producto){
        //this.producto = producto;
    
    }
    
    public void mostrarInformacion(){
         
    }
}
