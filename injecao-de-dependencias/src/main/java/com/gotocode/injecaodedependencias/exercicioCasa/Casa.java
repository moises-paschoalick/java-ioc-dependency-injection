package com.gotocode.injecaodedependencias.exercicioCasa;

import org.springframework.stereotype.Service;

//Analogia Casa
//No começo, a casa gera sua própria energia (acoplado).
//Depois surgem várias fontes e fica difícil gerenciar.
//E, em vez da casa decidir de onde vem a energia, alguém de fora conecta a energia nela.
//Isso é injeção de dependência.

@Service
public class Casa {

    private FonteEnergia fonteEnergia;

    // Injeção via construtor
    public Casa(FonteEnergia fonteEnergia) {
        this.fonteEnergia = fonteEnergia;
    }

    public void ligarLuz() {
        fonteEnergia.fornecerEnergia();
    }

}
// Antes

//public class Casa {
//
//    private Gerador gerador = new Gerador();
//    private EnergiaSolar solar = new EnergiaSolar();
//
//    /*E, em vez da casa decidir de onde vem a energia, alguém de fora conecta a energia nela.
//Isso é injeção de dependência.
//    public Casa() {
//        this.gerador = new Gerador();
//        this.solar = new EnergiaSolar();
//    }*/
//
//    public void ligarLuzGerador() {
//        gerador.fornecerEnergia();;
//    }
//    // Casa depende diretamente de Gerador
//    // Não da para trocar por solar facilmente
//
//    public void ligarLuzSolar() {
//        solar.fornecerEnergia();
//    }
//    // Mais código
//    // Mais dependência
//    // Mais acoplamento
//
//}

