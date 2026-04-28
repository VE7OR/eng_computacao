package inimigo;

// Classe Goblin herda da classe Inimigo
public class Goblin extends Inimigo {

    // Atributo exclusivo do Goblin
    private int agilidade;

    // Construtor da classe Goblin
    public Goblin(int vida, int defesa, int defesaMagica, int agilidade){

        // Chama o construtor da classe pai (Inimigo)
        // Inicializa os atributos básicos
        super(vida, defesa, defesaMagica);

        // Inicializa o atributo específico do Goblin
        this.agilidade = agilidade;
    }

    // Sobrescreve o método getTipo
    @Override
    public String getTipo(){

        // Retorna o tipo do inimigo
        return "Goblin";
    }

    // Sobrescreve o método mostrarStatus
    @Override
    public void mostrarStatus(){

        // Chama o método da classe pai para exibir:
        // vida, defesa e defesa mágica
        super.mostrarStatus();

        // Exibe o atributo exclusivo do Goblin
        System.out.println("Agilidade: " + agilidade);
    }
}
