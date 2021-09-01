package veterinaria;

public class veterinaria {

    // Atributos

    private String nombreMascota;
    private String nombreDueño;
    private Integer edadMascota;

    //CONSTRUCTORES

    public veterinaria(String nombreM,Integer edadM,String nombreD) {
        this.nombreMascota =nombreM;
        this.nombreDueño = nombreD;
        this.edadMascota = edadM;

    }

    //METODOS

    public void showData() {

        System.out.println("El nombre de tu mascota es: " + nombreMascota.substring(0, 1).toUpperCase() + nombreMascota.substring(1));

        System.out.println("La edad de tu mascota es: " + edadMascota + " años");

        System.out.println("El nombre del dueño es: " + nombreDueño.substring(0, 1).toUpperCase() + nombreDueño.substring(1));
    }

    public void verifyAge() {
        if (edadMascota > 10) {
            System.out.println(nombreMascota.substring(0, 1).toUpperCase() + nombreMascota.substring(1) + " es mayor de edad");
        } else {
            System.out.println(nombreMascota.substring(0, 1).toUpperCase() + nombreMascota.substring(1) + " es menor de edad");
        }
    }

}

