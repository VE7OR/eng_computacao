package inimigo;

public class Goblin extends Inimigo {
    private int agilidade;

    public Goblin(int vida, int defesa, int defesaMagica, int agilidade){
        super(vida, defesa, defesaMagica);
        this.agilidade = agilidade;
    }

    @Override
    public String getTipo(){
        return "Goblin";
    }

    @Override
    public void mostrarStatus(){
        super.mostrarStatus();
        System.out.println("Agilidade: " + agilidade);
    }
}
