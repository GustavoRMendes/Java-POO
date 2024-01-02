public class Carro extends Veiculo {
    private  int portas;
    public Carro(String nome, String marca, int ano,int portas) {
        super(nome, marca, ano);
        this.portas = portas;
    }
    public void mostrarVeiculo() {
        super.mostrarVeiculo();
        System.out.format("\nPortas: %d",portas);
    }
}
