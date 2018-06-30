/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author turupawn
 */
public class Ejercicios {
    static void guardar(String nombre_archivo, ArrayList<Producto> productos)
    {
                try
        {
            PrintWriter print_writer = new PrintWriter(nombre_archivo);

            for(Producto dato:productos)
            {
                print_writer.println(dato.nombre+ " " + dato.categoria+" "+ dato.existencias+" "+dato.precio);
            }

            print_writer.close();
        }catch (Exception e)
        {
 
        }
    }
    
    static ArrayList<Producto> abrir(String nombre_archivo)
    {
        ArrayList<Producto> leer = new ArrayList<>();
        
        try
        {
            Scanner scanner = new Scanner(new File(nombre_archivo));
            while(scanner.hasNext())
            {
                String nombre = scanner.next();
                String categoria = scanner.next();    
                int existencias = scanner.nextInt();
                double precio=scanner.nextDouble();
                leer.add(new Producto(nombre,categoria,existencias,precio));
            }
        }catch(Exception e)
        {
        }
    return leer;
    }
}
