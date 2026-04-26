package personagem;

public class Personagem {
    private int vida;
    private int defesa;
    private int defesaMagica;
    private int energia;

    public Personagem(int vida, int defesa, int defesaMagica, int energia){
        this.vida = vida;
        this.defesa = defesa;
        this.defesaMagica = defesaMagica;
        this.energia = energia;
    }

    public int getVida() { return vida; }
    public int getDefesa() { return defesa; }
    public int getEnergia() { return energia; }

    public void setVida(int vida) { this.vida = vida; }
    public void setEnergia(int energia) { this.energia = energia; }

    public String getTipo(){
        return "Personagem";
    }

    public void mostrarStatus(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Vida: " + vida);
        System.out.println("Defesa: " + defesa);
        System.out.println("Defesa Magica: " + defesaMagica);
        System.out.println("Energia: " + energia);
    }

    public int atacar(){
        return 10;
    }

    public int habilidadeEspecial(){
        return atacar();
    }
}
