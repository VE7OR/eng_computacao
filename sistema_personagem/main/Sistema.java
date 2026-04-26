package main;

import personagem.*;

public class Sistema {
    public static void main(String[] args) {

        Personagem[] personagens = new Personagem[3];

        personagens[0] = new Heroi("Guerreiro", 100, 50, 30, 80);
        personagens[1] = new Heroi("Mago", 70, 30, 80, 100);
        personagens[2] = new Inimigo("Orc", 120, 60, 20);

        for (Personagem p : personagens){
            p.mostraDados(); // POLIMORFISMO 🔥
        }
    }
}
