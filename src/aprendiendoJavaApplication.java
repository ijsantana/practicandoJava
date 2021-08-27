import object.Auto;

public class aprendiendoJavaApplication {

    public static void main(String[] args) {

        //AGREGO UNA LINEA//
        //OBJETO TIPO STRING DE JAVA lo que quiera puto el que lee
        //awdawdawdawd
        /*
        dwadaw
        awfawf
        wfawf
        awfaw
        fwafa
        wf
        awawgawg
        awgawg3wr3rw3rw3
        */

        //VARIABLES PRIMITIVAS: boolean, int, string, char, double, float, long.
        //VARIABLES EN JAVA, LIBRERIAS PROPIAS DE JAVA: Boolean, Integer, String, Double, Float...

        String nombre = ""; //UN STRING ES UNA CADENA O UN VECTOR DE CHARS
        String nombre2 = null; //_ _ _ _ _ _ _ /0 -> Finaliza la cadena o string

        int largo = nombre.length();
        Integer largo2 = nombre.length();
        String largoEnLetras = largo2.toString();

        Boolean respuesta = nombre.equals("pepe");

        //VECTOR [String1, String2, String3]
        //SIEMPRE ARRANCA EN 0 HASTA N-1
        // ES DE TAMAÑO FIJO -> YO DEFINO EL TAMAÑO DEL MISMO
        String[] nombres2 = new String[3];
        String[] nombres = new String[]{"CARLOS", "PEPE", "LUIS"};
        nombres[0] = "JUAN";
        String[] nombres3 = nombres.clone();
        String[] nombres4 = nombres;
        nombres[1].toLowerCase();
        nombres[1].concat("12312");


        for(int i = 0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }



//        CONDICIONALES
//        if(condicion -> true o false, booleana){
//          Respuesta si es verdadero
//        } else {
//          Respuesta si es falso
//        }

        if(nombre.equals("nacho")){
            System.out.println("Es nacho");
        } else {
            System.out.println("No Es nacho");
        }

        //EN NUMEROS SE COMPARA CON ==, >=, <=, >, <, !=
        if(largo > 8){
            System.out.println("Largo es mayor a 8");
        } else if (largo > 2){
            //EJECUCION
        } else {
            //EJECUCION
        }

        //CONDICIONAL MULTIPLE
        switch (nombre){
            case "nacho":
                System.out.println("Es nacho");
                break; //SE PONE BREAK PARA SALIR DEL SWITCH
            case "pepe":
                System.out.println("Es pepe");
                break;
            default:
                System.out.println("es otro nombre");
        }

        //CONDICIONAL TERNARIO -> IF REDUCIDO
        //CONDICION ? RESULTADO VERDADERO : RESULTADO FALSO;
        String resultado2 = nombre.equals("nacho") ? "NACHO" : "NO ES NACHO";


        //CICLOS EXACTOS -> FOR
        //FOR(DESDE DONDE ARRANCO; CONDICION Hasta donde; SALTO)
        // i++ -> Va acumulando 1
        for(int i=0; i<10;i++){

            if(i==2){
                continue; //SALE DE ESA ITERACION Y VA A LA SIGUIENTE
            }

            System.out.println(i); // 0, 1, 3, 4,5,6,7,8

            if (i == 8) {
                break; //SALGA AUTOMATICAMENTE DEL FOR.
            }

        }

        //CICLOS INEXACTOS -> SOLO ENTRA A ITERAR SI CUMPLE UNA CONDICION
        while(largo<7){
            System.out.println(largo);
            largo++;
        }



        //OBJETOS:

        //OBJETO TIPO AUTO QUE DEFINIMOS NOSTROS
        Auto corsa = new Auto();//SE TIENEN QUE INICIALIZAR LAS VARIABLES.
        corsa.mostrarPatente();




        Auto corsa2 = new Auto("corsa");

        //COPIANDO AUTO2 DE CORSA EN UN OBJETO NUEVO
        Auto auto2 = new Auto("corsa","LSS232");
        auto2.copiarAuto(corsa);

        corsa.setearPatente("HAD123");

        corsa2.setearPatente(corsa.mostrarPatente());


        System.out.println(auto2.mostrarPatente());
        System.out.println(corsa2.mostrarPatente());
        System.out.println(corsa.mostrarPatente());

        //String patente = corsa.mostrarPatente();

        //System.out.println(corsa);

    }




}
