package personagem;

// Classe Guerreiro herda da classe Personagem
public class Guerreiro extends Personagem {

    // Atributo exclusivo do Guerreiro
    private int forca;

    // Construtor da classe Guerreiro
    public Guerreiro(int vida, int defesa, int defesaMagica, int energia, int forca){

        // Chama o construtor da classe pai (Personagem)
        // Inicializa os atributos básicos
        super(vida, defesa, defesaMagica, energia);

        // Inicializa o atributo específico
        this.forca = forca;
    }

    // Sobrescreve o método getTipo
    @Override
    public String getTipo(){

        // Retorna o tipo do personagem
        return "Guerreiro";
    }

    // Sobrescreve o método atacar
    @Override
    public int atacar(){

        // O dano do ataque básico é baseado na força
        return forca;
    }

    // Sobrescreve o método de habilidade especial
    @Override
    public int habilidadeEspecial(){

        // Verifica se há energia suficiente
        if (getEnergia() >= 20){

            // Consome energia ao usar a habilidade
            setEnergia(getEnergia() - 20);

            // Mensagem da habilidade
            System.out.println("Guerreiro usou ataque forte");

            // Dano dobrado (mais forte que o ataque normal)
            return forca * 2;

        } else {

            // Caso não tenha energia suficiente
            System.out.println("Energia insuficiente");

            // Executa ataque normal
            return atacar();
        }
    }
}
