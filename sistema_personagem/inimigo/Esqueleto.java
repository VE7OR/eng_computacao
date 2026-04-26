package inimigo;

public class Esqueleto extends Inimigo {
    private int resistenciaOssea;

    public Esqueleto(int vida, int defesa, int defesaMagica, int resistencia){
        super(vida, defesa, defesaMagica);
        this.resistenciaOssea = resistencia;
    }

    @Override
    public String getTipo(){
        return "Esqueleto";
    }

    @Override
    public void mostrarStatus(){
        System.out.println("=== Esqueleto ===");
        super.mostrarStatus();
        System.out.println("Resistência Óssea: " + resistenciaOssea);
    }
}
