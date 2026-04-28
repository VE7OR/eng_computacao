package personagem;

// Classe base (superclasse) para todos os personagens
public class Personagem {

    // Atributos básicos comuns a todos os personagens
    private int vida;
    private int defesa;
    private int defesaMagica;
    private int energia;

    // Construtor da classe Personagem
    public Personagem(int vida, int defesa, int defesaMagica, int energia){

        // Inicializa os atributos com os valores recebidos
        this.vida = vida;
        this.defesa = defesa;
        this.defesaMagica = defesaMagica;
        this.energia = energia;
    }

    // =========================
    // GETTERS (acesso aos dados)
    // =========================

    // Retorna a vida atual
    public int getVida() { 
        return vida; 
    }

    // Retorna a defesa física
    public int getDefesa() { 
        return defesa; 
    }

    // Retorna a energia atual
    public int getEnergia() { 
        return energia; 
    }

    // =========================
    // SETTERS (modificação)
    // =========================

    // Atualiza a vida (usado durante batalhas)
    public void setVida(int vida) { 
        this.vida = vida; 
    }

    // Atualiza a energia (usado ao usar habilidades)
    public void setEnergia(int energia) { 
        this.energia = energia; 
    }

    // =========================
    // MÉTODOS GERAIS
    // =========================

    // Retorna o tipo do personagem
    // Pode ser sobrescrito pelas subclasses (polimorfismo)
    public String getTipo(){
        return "Personagem";
    }

    // Exibe os atributos do personagem
    public void mostrarStatus(){

        // Usa getTipo() (permite polimorfismo)
        System.out.println("Tipo: " + getTipo());

        // Mostra os atributos básicos
        System.out.println("Vida: " + vida);
        System.out.println("Defesa: " + defesa);
        System.out.println("Defesa Magica: " + defesaMagica);
        System.out.println("Energia: " + energia);
    }

    // Método de ataque padrão
    // Pode ser sobrescrito pelas subclasses
    public int atacar(){

        // Valor padrão de ataque
        return 10;
    }

    // Método de habilidade especial padrão
    // Pode ser sobrescrito pelas subclasses
    public int habilidadeEspecial(){

        // Por padrão, apenas executa o ataque normal
        return atacar();
    }
}
