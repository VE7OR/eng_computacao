package personagem;

public class Personagem {
    private int vida;
    private int defesa;
    private int defesaMagica;

    public Personagem(int vida, int defesa, int defesaMagica){
        this.vida = vida;
        this.defesa = defesa;
        this.defesaMagica = defesaMagica;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public void setDefesaMagica(int defesaMagica) {
        this.defesaMagica = defesaMagica;
    }

    public void mostraDados(){
        System.out.println("Vida: " + vida);
        System.out.println("Defesa: " + defesa);
        System.out.println("Defesa Mágica: " + defesaMagica);
        System.out.println("=====================");
    }
}
