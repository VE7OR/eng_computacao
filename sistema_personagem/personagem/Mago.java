package personagem;

// Classe Mago herda da classe Personagem
public class Mago extends Personagem {

    // Atributo exclusivo do Mago
    private int poderMagico;

    // Construtor da classe Mago
    public Mago(int vida, int defesa, int defesaMagica, int energia, int poderMagico){

        // Chama o construtor da classe pai (Personagem)
        // Inicializa os atributos básicos
        super(vida, defesa, defesaMagica, energia);

        // Inicializa o atributo específico
        this.poderMagico = poderMagico;
    }

    // Sobrescreve o método getTipo
    @Override
    public String getTipo(){

        // Retorna o tipo do personagem
        return "Mago";
    }

    // Sobrescreve o método atacar
    @Override
    public int atacar(){

        // O dano do ataque básico é baseado no poder mágico
        return poderMagico;
    }

    // Sobrescreve o método de habilidade especial
    @Override
    public int habilidadeEspecial(){

        // Verifica se há energia suficiente
        if (getEnergia() >= 25){

            // Consome energia ao usar a habilidade
            setEnergia(getEnergia() - 25);

            // Mensagem da habilidade
            System.out.println("Mago usou magia suprema");

            // Dano elevado (dobro do poder mágico)
            return poderMagico * 2;

        } else {

            // Caso não tenha energia suficiente
            System.out.println("Energia insuficiente");

            // Executa ataque normal
            return atacar();
        }
    }
}
