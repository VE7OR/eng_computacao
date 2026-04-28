package inimigo;

// Classe base (superclasse) para todos os inimigos
public class Inimigo {

    // Atributos básicos comuns a todos os inimigos
    private int vida;
    private int defesa;
    private int defesaMagica;

    // Construtor da classe Inimigo
    public Inimigo(int vida, int defesa, int defesaMagica){

        // Inicializa os atributos com os valores recebidos
        this.vida = vida;
        this.defesa = defesa;
        this.defesaMagica = defesaMagica;
    }

    // =========================
    // GETTERS E SETTERS
    // =========================

    // Retorna a vida atual do inimigo
    public int getVida(){ 
        return vida; 
    }

    // Atualiza a vida do inimigo (usado durante a batalha)
    public void setVida(int vida){ 
        this.vida = vida; 
    }

    // Retorna o valor da defesa física
    public int getDefesa(){ 
        return defesa; 
    }

    // =========================
    // MÉTODOS GERAIS
    // =========================

    // Retorna o tipo do inimigo
    // Pode ser sobrescrito pelas subclasses
    public String getTipo(){
        return "Inimigo";
    }

    // Exibe os atributos do inimigo
    public void mostrarStatus(){

        // Usa getTipo() (polimorfismo pode alterar o retorno)
        System.out.println("Tipo: " + getTipo());

        // Mostra os atributos básicos
        System.out.println("Vida: " + vida);
        System.out.println("Defesa: " + defesa);
        System.out.println("Defesa Magica: " + defesaMagica);
    }
}
