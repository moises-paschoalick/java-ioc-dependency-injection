package com.gotocode.injecaodedependencias;

import com.gotocode.injecaodedependencias.exercicioCasa.Casa;
import com.gotocode.injecaodedependencias.exercicioCasa.EnergiaSolar;
import com.gotocode.injecaodedependencias.exercicioCasa.FonteEnergia;
import com.gotocode.injecaodedependencias.exercicioCasa.Gerador;

public class TestaExercicioCasa {

    public static void main(String[] args) {

        //FonteEnergia energia = new Gerador();
        //FonteEnergia energia = new EnergiaSolar();

        //Casa casa = new Casa(energia);
        //casa.ligarLuz();

        testarCasa(new Gerador());
        testarCasa(new EnergiaSolar());

        // Antes
        /*Casa casa = new Casa();
        casa.ligarLuzGerador();
        casa.ligarLuzSolar();*/
    }

    private static void testarCasa(FonteEnergia energia) {
        Casa casa = new Casa(energia);
        casa.ligarLuz();;
    }

}
