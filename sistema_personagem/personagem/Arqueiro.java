package personagem;

// Classe Arqueiro herda da classe Personagem
public class Arqueiro extends Personagem {

    // Atributo exclusivo do Arqueiro
    private int precisao;

    // Construtor da classe Arqueiro
    public Arqueiro(int vida, int defesa, int defesaMagica, int energia, int precisao){

        // Chama o construtor da classe pai (Personagem)
        // Inicializa os atributos básicos
        super(vida, defesa, defesaMagica, energia);

        // Inicializa o atributo específico
        this.precisao = precisao;
    }

    // Sobrescreve o método getTipo
    @Override
    public String getTipo(){

        // Retorna o tipo do personagem
        return "Arqueiro";
    }

    // Sobrescreve o método atacar
    @Override
    public int atacar(){

        // O dano do ataque básico é baseado na precisão
        return precisao;
    }

    // Sobrescreve o método de habilidade especial
    @Override
    public int habilidadeEspecial(){

        // Verifica se há energia suficiente para usar a habilidade
        if (getEnergia() >= 15){

            // Consome energia ao usar a habilidade
            setEnergia(getEnergia() - 15);

            // Mensagem da habilidade
            System.out.println("Arqueiro usou tiro preciso");

            // Retorna dano maior que o ataque normal
            return precisao + 50;

        } else {

            // Caso não tenha energia suficiente
            System.out.println("Energia insuficiente");

            // Executa ataque normal
            return atacar();
        }
    }
}
