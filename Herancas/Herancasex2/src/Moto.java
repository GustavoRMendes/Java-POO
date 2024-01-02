public class Moto extends Veiculo{
    private int rodas;
    public Moto(String nome,String marca,int ano,int rodas){
        super(nome,marca,ano);
        this.rodas = rodas;
    }
    public void mostrarVeiculo() {
        super.mostrarVeiculo();
        System.out.format("\nRodas:%d",rodas);
    }
}
