package personagem;

public class Inimigo extends Personagem {
    private String tipo;

    public Inimigo(String tipo, int vida, int defesa, int defesaMagica){
        super(vida, defesa, defesaMagica);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostraDados(){
        System.out.println("Inimigo: " + tipo);
        super.mostraDados();
    }
}
