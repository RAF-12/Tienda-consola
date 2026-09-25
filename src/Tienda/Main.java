
package Tienda;

import java.util.Scanner;
import Tienda.Tienda;
// este es un cambio de prueba par github1
public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        Tienda tienda = null;
        Categoria categoria;
        Producto producto;
        
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Bienvenido al sistema de administracion  de Teendas");
        
        while (!salir) {            
            System.out.println("Seleccione una opcion digitando el numero correspondiente");
            System.out.println("1. Agregar Tienda ");
            System.out.println("2. Agregar Categoria ");
            System.out.println("3. Agregar Producto ");
            System.out.println("4. Mostrar Informacion de la Tienda");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la tienda");
                    scanner = new Scanner(System.in);
                    tienda = new  Tienda(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la categoria");
                    scanner = new Scanner(System.in);
                    String nombre = scanner.nextLine();
                    
                    System.out.println("Ingrese el codigo de la categoria");
                    String codigo = scanner.nextLine();
                    categoria = new  Categoria(nombre, codigo);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la Producto");
                
                    /*scanner = new Scanner(System.in);
                    String nombre = scanner.nextLine();
                    
                    System.out.println("Ingrese el codigo de la Producto");
                    String codigo = scanner.nextLine();*/       
                    
                    System.out.println("Ingrese el Precio de la Producto");
                    scanner = new Scanner(System.in);
                    int precio = scanner.nextInt();
                    
                    //producto = new  Producto( precio);
                 
                    break;
                case 4:
                    tienda.mostrarInformacion();
             
                    break;
                case 5:
                    System.out.println("Gracias por visitarnos ! vuelva pronto ¡");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
    
}
