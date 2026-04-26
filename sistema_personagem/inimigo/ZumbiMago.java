package inimigo;

public class ZumbiMago extends Inimigo {
    private int magiaSombria;

    public ZumbiMago(int vida, int defesa, int defesaMagica, int magia){
        super(vida, defesa, defesaMagica);
        this.magiaSombria = magia;
    }

    @Override
    public String getTipo(){
        return "Zumbi Mago";
    }

    @Override
    public void mostrarStatus(){
        System.out.println("=== Zumbi Mago ===");
        super.mostrarStatus();
        System.out.println("Magia Sombria: " + magiaSombria);
    }
}
