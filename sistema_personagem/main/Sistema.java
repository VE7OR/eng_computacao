package main;

import personagem.*;
import inimigo.*;

public class Sistema {

    public static void main(String[] args) {

        Personagem[] personagens = {
            new Guerreiro(100, 50, 30, 100, 80),
            new Arqueiro(80, 40, 20, 100, 90),
            new Mago(70, 30, 80, 100, 100)
        };

        Inimigo[] inimigos = {
            new Goblin(80, 20, 10, 40),
            new Esqueleto(90, 30, 20, 50),
            new ZumbiMago(100, 25, 40, 60)
        };

        // MOSTRAR STATUS
        System.out.println("=== PERSONAGENS ===");
        for (Personagem p : personagens) {
            p.mostrarStatus();
            System.out.println();
        }

        System.out.println("=== INIMIGOS ===");
        for (Inimigo i : inimigos) {
            i.mostrarStatus();
            System.out.println();
        }

        System.out.println("=== BATALHAS ===");

        // TODOS vs TODOS
        for (Personagem pOriginal : personagens) {
            for (Inimigo iOriginal : inimigos) {

                Personagem p = copiarPersonagem(pOriginal);
                Inimigo i = copiarInimigo(iOriginal);

                System.out.println("\nBatalha: " + p.getTipo() + " vs " + i.getTipo());

                while (p.getVida() > 0 && i.getVida() > 0){

                    // alterna entre ataque normal e especial
                    int ataqueBase;
                    if (Math.random() < 0.5){
                        ataqueBase = p.atacar();
                        System.out.println(p.getTipo() + " usou ataque normal");
                    } else {
                        ataqueBase = p.habilidadeEspecial();
                    }

                    // variação no dano
                    int variacao = (int)(Math.random() * 20);
                    int dano = (ataqueBase + variacao) - i.getDefesa();
                    if (dano < 0) dano = 0;

                    i.setVida(i.getVida() - dano);
                    System.out.println(p.getTipo() + " causou: " + dano);

                    if (i.getVida() <= 0){
                        System.out.println(p.getTipo() + " venceu");
                        break;
                    }

                    // ataque do inimigo com variação
                    int danoInimigo = (20 + (int)(Math.random() * 15)) - p.getDefesa();
                    if (danoInimigo < 0) danoInimigo = 0;

                    p.setVida(p.getVida() - danoInimigo);
                    System.out.println(i.getTipo() + " causou: " + danoInimigo);

                    if (p.getVida() <= 0){
                        System.out.println(i.getTipo() + " venceu");
                        break;
                    }
                }

                System.out.println("----------------------");
            }
        }
    }

    // cópia de personagens
    public static Personagem copiarPersonagem(Personagem p){
        if (p instanceof Guerreiro){
            return new Guerreiro(100, 50, 30, 100, 80);
        } else if (p instanceof Arqueiro){
            return new Arqueiro(80, 40, 20, 100, 90);
        } else {
            return new Mago(70, 30, 80, 100, 100);
        }
    }

    // cópia de inimigos
    public static Inimigo copiarInimigo(Inimigo i){
        if (i instanceof Esqueleto){
            return new Esqueleto(90, 30, 20, 50);
        } else if (i instanceof ZumbiMago){
            return new ZumbiMago(100, 25, 40, 60);
        } else {
            return new Goblin(80, 20, 10, 40);
        }
    }
}
