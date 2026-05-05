package com.gotocode.injecaodedependencias.exercicioCasa;

/*
// Antes
public class Gerador {

    public void fornecerEnergia() {
        System.out.println("Energia do gerador");
    }

}*/

import org.springframework.stereotype.Service;

// Depois interface
@Service
public class Gerador implements FonteEnergia  {
    public void fornecerEnergia() {
        System.out.println("Energia do gerador");
    }

}
