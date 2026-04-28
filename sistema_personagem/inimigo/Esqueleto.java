package inimigo;

// Classe Esqueleto herda (extends) da classe Inimigo
public class Esqueleto extends Inimigo {

    // Atributo específico do Esqueleto
    private int resistenciaOssea;

    // Construtor da classe Esqueleto
    public Esqueleto(int vida, int defesa, int defesaMagica, int resistencia){

        // Chama o construtor da classe pai (Inimigo)
        // Inicializa vida, defesa e defesa mágica
        super(vida, defesa, defesaMagica);

        // Inicializa o atributo específico do Esqueleto
        this.resistenciaOssea = resistencia;
    }

    // Sobrescreve o método getTipo da classe Inimigo
    @Override
    public String getTipo(){

        // Retorna o tipo do inimigo
        return "Esqueleto";
    }

    // Sobrescreve o método mostrarStatus
    @Override
    public void mostrarStatus(){

        // Mostra o nome do inimigo
        System.out.println("=== Esqueleto ===");

        // Chama o método da classe pai para mostrar atributos básicos
        // (vida, defesa, defesa mágica)
        super.mostrarStatus();

        // Mostra o atributo exclusivo do Esqueleto
        System.out.println("Resistência Óssea: " + resistenciaOssea);
    }
}
