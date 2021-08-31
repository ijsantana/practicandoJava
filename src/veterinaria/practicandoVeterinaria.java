package veterinaria;

public class practicandoVeterinaria {

    public static void main(String [] args){
        veterinaria gato = new veterinaria("Sol",8,"Ian");
        veterinaria perro = new veterinaria("Laica",6,"=Cristina");

        gato.mostrarDatos();
        gato.verificarEdad();
        perro.mostrarDatos();
        perro.verificarEdad();

    }

}
