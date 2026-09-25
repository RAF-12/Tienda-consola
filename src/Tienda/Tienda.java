package Tienda;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Categoria> categoria = new ArrayList<>();
    
    
    //cosntuctor
    public Tienda(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            System.out.println("Tienda "+ this.nombre + " agregada");
        } else {
            this.nombre = "SIN NOMBRE";
            System.out.println("Tienda "+ this.nombre + " agregada");
        }
        
    }
    
    //agregar categoria
    public void agregarCategoria(Categoria categoria ){
        for (int i = 0; i < this.categoria.size(); i++) {
            System.out.println("El tamalo es " +this.categoria.size() );  
        }
        
         for (Categoria c : this.categoria) {
            if (!c.equals(categoria)|| !c.equals("")) {
                c = categoria;
            } else {
                System.out.println("nOM PUEDE ESTA VACIO");
            }
        }
        
    }
    // mostrar informacion de la tienda
    public void mostrarInformacion(){
        System.out.println("La tienda se llama" + nombre);


    }
    
}
