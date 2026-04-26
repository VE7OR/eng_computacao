package personagem;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(int vida, int defesa, int defesaMagica, int energia, int forca){
        super(vida, defesa, defesaMagica, energia);
        this.forca = forca;
    }

    @Override
    public String getTipo(){
        return "Guerreiro";
    }

    @Override
    public int atacar(){
        return forca;
    }

    @Override
    public int habilidadeEspecial(){
        if (getEnergia() >= 20){
            setEnergia(getEnergia() - 20);
            System.out.println("Guerreiro usou ataque forte");
            return forca * 2;
        } else {
            System.out.println("Energia insuficiente");
            return atacar();
        }
    }
}
