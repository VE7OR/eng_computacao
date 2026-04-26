package personagem;

public class Mago extends Personagem {
    private int poderMagico;

    public Mago(int vida, int defesa, int defesaMagica, int energia, int poderMagico){
        super(vida, defesa, defesaMagica, energia);
        this.poderMagico = poderMagico;
    }

    @Override
    public String getTipo(){
        return "Mago";
    }

    @Override
    public int atacar(){
        return poderMagico;
    }

    @Override
    public int habilidadeEspecial(){
        if (getEnergia() >= 25){
            setEnergia(getEnergia() - 25);
            System.out.println("Mago usou magia suprema");
            return poderMagico * 2;
        } else {
            System.out.println("Energia insuficiente");
            return atacar();
        }
    }
}
