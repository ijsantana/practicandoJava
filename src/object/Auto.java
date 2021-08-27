package object;

import interace.AutoInterface;

import java.time.LocalDate;

public class Auto implements AutoInterface {

    //VARIABLES
    private String patente = "HSDW213";
    private String modelo;
    private Double peso;
    private Puerta puerta;
    private String nroMotor;
    private LocalDate fechaFabricacion;


    //CONSTRUCTORES

    //CONSTRUCTOR POR DEFAULT VACIO
    //public Auto(){}


    public Auto(){}

    public Auto(String mod){
        this.modelo = mod;
    }

    public Auto(String mod, String pat){
        this.modelo = mod;
        this.patente = pat;
    }

    public Auto(Auto aut){
        this.patente = aut.mostrarPatente();
        iniciarObjeto(aut);
    }




    //FUNCIONES
    /*    FUNCION: Y = F(X1,X2,X3...)
     QueDevuelve(TIPO DE VARIABLE DE Y) NombreDeFUncion(ENTRADA, ENTRADA2){
        ALGORITMOS = X2 +3;
    }*/

    public String mostrarPatente(){
        return this.patente;
    }

    //NO RETORNO NADA -> VOID
    public void setearPatente(String pat){
        this.patente = pat;
    }

    public Auto copiarAuto(Auto auto1){
        Auto auto2 = new Auto();
        auto2.setearPatente(auto1.mostrarPatente());
        return auto2;
    }

    public void iniciarObjeto(Auto auto){
        System.out.println("ESTOY INICIANDO EL OBJETO");
    }


    public void generarPatente(){
    }


    public String obtenerColorDePuerta() {
        return null;
    }


    public String elegirColorRandom() {
        return null;
    }

}
