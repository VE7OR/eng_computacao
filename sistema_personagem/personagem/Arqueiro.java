package personagem;

public class Arqueiro extends Personagem {
    private int precisao;

    public Arqueiro(int vida, int defesa, int defesaMagica, int energia, int precisao){
        super(vida, defesa, defesaMagica, energia);
        this.precisao = precisao;
    }

    @Override
    public String getTipo(){
        return "Arqueiro";
    }

    @Override
    public int atacar(){
        return precisao;
    }

    @Override
    public int habilidadeEspecial(){
        if (getEnergia() >= 15){
            setEnergia(getEnergia() - 15);
            System.out.println("Arqueiro usou tiro preciso");
            return precisao + 50;
        } else {
            System.out.println("Energia insuficiente");
            return atacar();
        }
    }
}
