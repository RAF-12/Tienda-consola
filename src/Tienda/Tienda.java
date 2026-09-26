package Tienda;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Categoria> categoria = new ArrayList<>();
    
    
    //cosntuctor
    public Tienda(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
            System.out.println("La tienda "+ this.nombre + "a sido creada");
        } else {
            this.nombre = "SIN NOMBRE";
            System.out.println("La tienda se agrego como "+ this.nombre);
        }
        
    }
    
    //agregar categoria
    public void agregarCategoria(Categoria categoria ){
        if (categoria == null) {
            throw  new  IllegalArgumentException("La categoria no puede ser null");
        }
        
        for (Categoria c : this.categoria) {
            if (categoria != null && c.getNombre().equalsIgnoreCase(categoria.getNombre())) {
                throw new IllegalArgumentException(categoria + "Ya existe dentro de la Tienda " + nombre );
            }
        }
        this.categoria.add(categoria);
        
    }
    // mostrar informacion de la tienda
    public void mostrarInformacion(){
        System.out.println("La tienda se llama " + nombre);
        for (int i = 0; i < categoria.size(); i++) {
            System.out.println((i+1) + " ");
            categoria.get(i).mostrarInformacion();         
        }


    }
    
}
