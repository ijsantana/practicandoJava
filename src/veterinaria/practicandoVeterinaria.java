package veterinaria;

import java.util.Scanner;

public class practicandoVeterinaria {

    public static void main(String [] args){

        //SCANNER NOMBRE MASCOTA

        Scanner petName = new Scanner(System.in);
             System.out.println("Como se llama tu mascota");
        String nameP = petName.nextLine();

        //SCANNER EDAD MASCOTA

        Scanner petAge = new Scanner(System.in);
            System.out.println("Cual es la edad de tu mascota?");
        Integer ageP = petAge.nextInt();


        //SCANNER NOMBRE DEL DUENO

        Scanner petOwner = new Scanner(System.in);
            System.out.println("Cual es el nombre del dueño?");
        String ownerP = petOwner.nextLine();

        //SETEO LA PRIMER MASCOTA CON EL CONSTRUCTOR

        veterinaria pet1 = new veterinaria(nameP,ageP,ownerP);

        //EJECUTO METODOS

        pet1.showData();
        pet1.verifyAge();

    }

}
