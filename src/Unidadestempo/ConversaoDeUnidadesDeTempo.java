package Unidadestempo;

public class ConversaoDeUnidadesDeTempo {

     static void minutopraseg (double valor){
         double minuto = valor * 60;
         System.out.println(minuto + "segundos");
     }

     static void horapraminu (double valor){
         double hora = valor * 60;
         System.out.println(hora + "minutos");
     }

    static void diaprahora (double valor){
        double dia = valor * 24;
        System.out.println(dia + "horas");
    }

    static void semanapradia (double valor){
        double semana = valor * 7;
        System.out.println(semana + "dias");
    }

    static void mespradia (double valor){
        double mes = valor * 30;
        System.out.println(mes + "dias");

    }

    static void anopradia (double valor){
        double ano = valor * 365.25;
        System.out.println(ano + "dias");

    }
}
