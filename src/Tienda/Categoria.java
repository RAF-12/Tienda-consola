
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
    
    //Agrega un producto a la lista
    public void agregarProducto(Producto producto){
        this.producto.add(producto);  
    }
    
    //mostrar la info de categoria y productos que tiene 
    public void mostrarInformacion(){
        System.out.println("============CATEGORIA============= ");
        System.out.println("Nombre categoria: " + nombre);
        System.out.println("Codigo categoria: " + codigo);
        System.out.println(" ");
        System.out.println("===Lista de Productos===");
        for (int i = 0; i < producto.size(); i++) {
            System.out.println((i+1) + " ");
            producto.get(i).mostrarInformacion();         
        }
         
    }

    public String getNombre() {
        return nombre;
    }
    
}
