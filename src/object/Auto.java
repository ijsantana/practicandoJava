package object;

import java.time.LocalDate;

public class Auto {

    private String patente;
    private String modelo;
    private Double peso;
    private String nroMotor;
    private LocalDate fechaFabricacion;

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

}

