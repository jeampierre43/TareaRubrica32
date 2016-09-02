//package pilas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.io.*;
//package pilas;
import java.io.*;
/**
 *
 * Programa de usos de pilas: Stacks
 * Autor: Ing. Loor Byron
 * Ultima revisión.  Fecha: 4 de marzo del 2014
 */
public class Pila {
 public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
 public static final int MAX_LENGTH = 5;
 public static String Pila[] = new String[MAX_LENGTH];
 public static int cima = -1;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
        Menu();
    }
public static void Menu()throws IOException{
     System.out.println("\n\n\t\t\t=========Menú Manejo Pila=============");
     System.out.println("\t\t\t=                                    =");
     System.out.println("\t\t\t= 1- Insertar elemento               =");
     System.out.println("\t\t\t= 2- Eliminar elemento               =");
     System.out.println("\t\t\t= 3- Buscar elemento                 =");
     System.out.println("\t\t\t= 4- Imprimir pila                   =");
     System.out.println("\t\t\t= 5- Salir                           =");
     System.out.println("\t\t\t======================================");
     System.out.print("\t\t\tOpcion: ");
     int op = Integer.parseInt(entrada.readLine());
     Opciones(op);
    }
    public static void Opciones(int op)throws IOException{
        switch(op){
			case 1: Insertar();
			        break;
			case 2: Eliminar();
			        break;
			case 3: Buscar();
			        break;
			case 4: Imprimir();
			        break;
			case 5: System.exit(1);
			        break;
			default:Menu();
			        break;
	   }
    }

    public static void Insertar()throws IOException{
       System.out.print("\nDigite algo para la pila: ");
       String dato = entrada.readLine();
       Crear(dato);
    }

    public static void Crear(String dato)throws IOException{
      if ((Pila.length-1)==cima){
        System.out.println("Capacidad de la pila al limite\n\n\n");
        Imprimir();
      } else{
           ++cima; //incremento la variable de control cima
        }
      Agregar(dato);
    }
    public static void Agregar(String dato)throws IOException{
      Pila[cima]=dato; //guardo el dato en la posición donde esta cima
      Menu();
    }
    public static void Imprimir()throws IOException{
      for(int i=Pila.length-1;i>=0;i--){
	       System.out.println(Pila[i]);
      }
      Menu();
    }
    public static void Eliminar()throws IOException{
      if(cima== -1){ //si pila esta vacia
		  System.out.println("\n\n\nNo se puede eliminar, pila vacía !!!" );
      } else{
	      Pila[cima] = null;
	      --cima;
        }
      Menu();
    }
    public static void Buscar()throws IOException{
       System.out.println("\n\n\nDigite la cadena a buscar: ");
       String cad = entrada.readLine();
       for(int i=0;i<Pila.length-1;i++){
			if(cad.equals(Pila[i])){
				System.out.println("Elemento encontrado,posición "+i);
				break;
		        } else{
		     	       System.out.println("Elemento no encontrado :(");
	                      }
        }
	Menu();
    }
    
}
