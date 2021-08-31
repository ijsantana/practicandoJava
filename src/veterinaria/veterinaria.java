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

    public void mostrarDatos() {
        System.out.println("El nombre es:" +mascota);
        System.out.println("La edad es:" +edad);
        System.out.println("El dueno se llama:" +dueno);
    }

}

