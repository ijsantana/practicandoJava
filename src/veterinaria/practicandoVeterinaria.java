package veterinaria;

import java.util.Scanner;

public class practicandoVeterinaria {

    public static void main(String [] args){

        Scanner nombreMascota = new Scanner(System.in);
             System.out.println("Como se llama tu mascota");

        String nombreM = nombreMascota.nextLine();  // Read user input




        veterinaria gato = new veterinaria("Sol",8,"Ian");
        veterinaria perro = new veterinaria("Laica",6,"=Cristina");


        gato.mostrarDatos();
        gato.verificarEdad();
        perro.mostrarDatos();
        perro.verificarEdad();

    }

}
