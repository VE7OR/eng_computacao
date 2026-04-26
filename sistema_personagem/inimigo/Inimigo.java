package inimigo;

public class Inimigo {
    private int vida;
    private int defesa;
    private int defesaMagica;

    public Inimigo(int vida, int defesa, int defesaMagica){
        this.vida = vida;
        this.defesa = defesa;
        this.defesaMagica = defesaMagica;
    }

    public int getVida(){ return vida; }
    public void setVida(int vida){ this.vida = vida; }

    public int getDefesa(){ return defesa; }

    public String getTipo(){
        return "Inimigo";
    }

    public void mostrarStatus(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Vida: " + vida);
        System.out.println("Defesa: " + defesa);
        System.out.println("Defesa Magica: " + defesaMagica);
    }
}
