package main;

// Importa todas as classes de personagens e inimigos
import personagem.*;
import inimigo.*;

public class Sistema {

    public static void main(String[] args) {

        // Criação do array de personagens (time do jogador)
        Personagem[] personagens = {
            new Guerreiro(100, 50, 30, 100, 80), // vida, defesa, defesa mágica, energia, força
            new Arqueiro(80, 40, 20, 100, 90),
            new Mago(70, 30, 80, 100, 100)
        };

        // Criação do array de inimigos
        Inimigo[] inimigos = {
            new Goblin(80, 20, 10, 40),     // vida, defesa, defesa mágica, atributo especial
            new Esqueleto(90, 30, 20, 50),
            new ZumbiMago(100, 25, 40, 60)
        };

        // =========================
        // MOSTRAR STATUS INICIAL
        // =========================
        System.out.println("=== PERSONAGENS ===");
        for (Personagem p : personagens) { // percorre todos personagens
            p.mostrarStatus(); // método que exibe atributos
            System.out.println();
        }

        System.out.println("=== INIMIGOS ===");
        for (Inimigo i : inimigos) { // percorre todos inimigos
            i.mostrarStatus();
            System.out.println();
        }

        System.out.println("=== BATALHAS ===");

        // =========================
        // SISTEMA DE BATALHA (todos contra todos)
        // =========================
        for (Personagem pOriginal : personagens) {
            for (Inimigo iOriginal : inimigos) {

                // Cria cópias para não alterar os originais
                Personagem p = copiarPersonagem(pOriginal);
                Inimigo i = copiarInimigo(iOriginal);

                System.out.println("\nBatalha: " + p.getTipo() + " vs " + i.getTipo());

                // Loop da batalha enquanto ambos estiverem vivos
                while (p.getVida() > 0 && i.getVida() > 0){

                    // =========================
                    // ATAQUE DO PERSONAGEM
                    // =========================

                    int ataqueBase;

                    // Escolhe aleatoriamente entre ataque normal ou especial
                    if (Math.random() < 0.5){
                        ataqueBase = p.atacar(); // ataque comum
                        System.out.println(p.getTipo() + " usou ataque normal");
                    } else {
                        ataqueBase = p.habilidadeEspecial(); // habilidade especial
                    }

                    // Gera uma variação aleatória no dano (0 a 19)
                    int variacao = (int)(Math.random() * 20);

                    // Calcula dano final considerando defesa do inimigo
                    int dano = (ataqueBase + variacao) - i.getDefesa();

                    // Garante que o dano não seja negativo
                    if (dano < 0) dano = 0;

                    // Aplica o dano ao inimigo
                    i.setVida(i.getVida() - dano);

                    System.out.println(p.getTipo() + " causou: " + dano);

                    // Verifica se o inimigo morreu
                    if (i.getVida() <= 0){
                        System.out.println(p.getTipo() + " venceu");
                        break;
                    }

                    // =========================
                    // ATAQUE DO INIMIGO
                    // =========================

                    // Dano base do inimigo com variação (20 a 34)
                    int danoInimigo = (20 + (int)(Math.random() * 15)) - p.getDefesa();

                    if (danoInimigo < 0) danoInimigo = 0;

                    // Aplica dano ao personagem
                    p.setVida(p.getVida() - danoInimigo);

                    System.out.println(i.getTipo() + " causou: " + danoInimigo);

                    // Verifica se o personagem morreu
                    if (p.getVida() <= 0){
                        System.out.println(i.getTipo() + " venceu");
                        break;
                    }
                }

                System.out.println("----------------------");
            }
        }
    }

    // =========================
    // MÉTODO PARA COPIAR PERSONAGENS
    // =========================
    public static Personagem copiarPersonagem(Personagem p){

        // Verifica o tipo do personagem e cria um novo igual
        if (p instanceof Guerreiro){
            return new Guerreiro(100, 50, 30, 100, 80);
        } else if (p instanceof Arqueiro){
            return new Arqueiro(80, 40, 20, 100, 90);
        } else {
            return new Mago(70, 30, 80, 100, 100);
        }
    }

    // =========================
    // MÉTODO PARA COPIAR INIMIGOS
    // =========================
    public static Inimigo copiarInimigo(Inimigo i){

        // Verifica o tipo do inimigo e cria um novo igual
        if (i instanceof Esqueleto){
            return new Esqueleto(90, 30, 20, 50);
        } else if (i instanceof ZumbiMago){
            return new ZumbiMago(100, 25, 40, 60);
        } else {
            return new Goblin(80, 20, 10, 40);
        }
    }
}
