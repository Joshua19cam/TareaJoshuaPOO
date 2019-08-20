/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareajoshuapoo;

import clases.Alumno;
import clases.Audifonos;
import clases.Billete;
import clases.Caja;
import clases.Camisa;
import clases.Cancion;
import clases.Carro;
import clases.Casa;
import clases.Celular;
import clases.Ciudad;
import clases.Empleado;
import clases.Escuela;
import clases.Figura;
import clases.Libro;
import clases.Perro;
import clases.Procesador;
import clases.Sabritas;
import clases.Tennis;
import clases.Usuario;
import java.util.Scanner;

/**
 *
 * @author Joshua C.H
 */
public class TareaJoshuaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno juan=new Alumno("Juan Carlos", 2019670071,"Mecatronica"); 
        Alumno luis=new Alumno("Luis", 2019670073,"Sistemas");
        Audifonos a=new Audifonos("Skullcandy", 500, "Buds");
        Audifonos b=new Audifonos("Pionner", 1400, "BIg bass");
        Billete benito=new Billete(500, "Azul", "Benito Juarez");
        Billete morelos=new Billete(50, "Rosa", "Morelos");
        Caja chica=new Caja(20, 20, 10);
        Caja grande=new Caja(100, 120, 110);
        Camisa uno=new Camisa("Adidas", 400, "s");
        Camisa dos=new Camisa("Cuidado con el perro", 450, "m");
        Cancion cumbia1=new Cancion("Cumbia", "Los angeles azules", 1990);
        Cancion electronica1=new Cancion("Dubstep", "Skrillex", 2000);
        Carro nissan=new Carro("Nissan", "Versa", 4);
        Carro ferrari=new Carro("Ferrari", "Legion 3", 4);
        Casa big=new Casa(6, 7, 5);
        Casa peque=new Casa(4, 3, 4);
        Celular xiaomi=new Celular("Xiaomi", "Redmi note 4", 3000);
        Celular iphone=new Celular("iPhone", "Xs", 15000);
        Ciudad zac=new Ciudad("Guadalupe", "Zacatecas", 150000);
        Ciudad rio=new Ciudad("Rio grande", "Zacatecas", 1000000);
        Empleado x=new Empleado("Joshua", "1234joshua", 200);
        Empleado y=new Empleado("Omar", "2346omar", 800);
        Escuela upiiz=new Escuela("UPIIZ", "1U2P3I4I5IZ", 4000);
        Escuela uaz=new Escuela("UAZ", "UAZ777", 10000);
        Figura tri=new Figura(3, "Triangulo");
        Figura penta=new Figura(5, "Pentagono");
        Libro libro1=new Libro("La cabaña", "Young L.", 300);
        Libro libro2=new Libro("Calculo", "Cosmy P.", 100);
        Perro chaneke=new Perro("Chaneke", "Pitbull", "+culino", 2, "Blanco");
        Perro firu=new Perro("Firulais", "Callegera", "+culino", 2, "Cafe");
        Procesador amd=new Procesador("AMD", "Ryzen 2400G", 8);
        Procesador intel=new Procesador("Intel", "Core i9 8100k", 10);
        Sabritas limon=new Sabritas("Sabritas", "Limon", 55);
        Sabritas Rufles=new Sabritas("Rufles Flammin hot", "Chile habanero", 60);
        Tennis vans=new Tennis("VANS", "SK8", 27);
        Tennis puma=new Tennis("Puma", "Los correlones", 23);
        Usuario entrante1=new Usuario("JoshuaxXx19", "joshuacam.mx@gmail.com", "contraseña111");
        Usuario entrante2=new Usuario("Om4rXmaicra", "omarmaicra@gmail.com", "ilovemainca");
                
        System.out.println();
        }
    
}
