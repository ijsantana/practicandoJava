package veterinaria;

public class veterinaria {

    // Atributos

    private String mascota;
    private String dueno;
    private Integer edad;

    //CONSTRUCTORES

    public veterinaria(String nombreM,Integer edadM,String nombreD) {
        this.mascota =nombreM;
        this.edad = edadM;
        this.dueno = nombreD;
    }

    //METODOS

    public void mostrarDatos() {
        System.out.println("El nombre es:" +mascota);
        System.out.println("La edad es:" +edad);
        System.out.println("El dueno se llama:" +dueno);
    }

    public void verificarEdad() {
        if (edad > 10) {
            System.out.println(mascota + " es mayor de edad");
        } else {
            System.out.println(mascota+" es menor de edad");
        }
    }

}

