package inimigo;

// Classe ZumbiMago herda da classe Inimigo
public class ZumbiMago extends Inimigo {

    // Atributo exclusivo do Zumbi Mago
    private int magiaSombria;

    // Construtor da classe ZumbiMago
    public ZumbiMago(int vida, int defesa, int defesaMagica, int magia){

        // Chama o construtor da classe pai (Inimigo)
        // Inicializa os atributos básicos
        super(vida, defesa, defesaMagica);

        // Inicializa o atributo específico
        this.magiaSombria = magia;
    }

    // Sobrescreve o método getTipo
    @Override
    public String getTipo(){

        // Retorna o nome específico do inimigo
        return "Zumbi Mago";
    }

    // Sobrescreve o método mostrarStatus
    @Override
    public void mostrarStatus(){

        // Mostra o título do inimigo
        System.out.println("=== Zumbi Mago ===");

        // Reaproveita o método da classe pai (vida, defesa, defesa mágica)
        super.mostrarStatus();

        // Mostra o atributo exclusivo
        System.out.println("Magia Sombria: " + magiaSombria);
    }
}
