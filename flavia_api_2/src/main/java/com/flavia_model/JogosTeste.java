package com.flavia_model;

import java.util.ArrayList;
import java.util.List;

public class JogosTeste {

    public List<Jogo> getJogos() {

        Jogo jogo1 = new Jogo("futebol", "19/10/2019", "20:00", "aaa", "bbb");
        Jogo jogo2 = new Jogo("volei", "22/10/2019", "19:30", "frd", "rrr");
        Jogo jogo3 = new Jogo("natacao", "13/12/2019", "19:30", "dgdfg", "rrr");
        Jogo jogo4 = new Jogo("volei", "07/07/2019", "19:30", "frd", "rrr");
        Jogo jogo5 = new Jogo("volei", "15/03/2019", "19:30", "frd", "rrr");
        Jogo jogo6 = new Jogo("futebol", "22/10/2019", "19:30", "frd", "rrr");
        Jogo jogo7 = new Jogo("volei", "22/10/2019", "19:30", "frd", "rrr");
        Jogo jogo8 = new Jogo("volei", "22/10/2019", "19:30", "frd", "rrr");
        Jogo jogo9 = new Jogo("basquete", "13/12/2019", "19:30", "frd", "rrr");
        Jogo jogo10 = new Jogo("volei", "22/10/2019", "19:30", "frd", "rrr");


        List<Jogo> jogos = new ArrayList<>();

        jogos.add(jogo1);jogos.add(jogo2);jogos.add(jogo3);jogos.add(jogo4);jogos.add(jogo5);
        jogos.add(jogo6);jogos.add(jogo7);jogos.add(jogo8);jogos.add(jogo9);jogos.add(jogo10);

        return jogos;

    }


}
