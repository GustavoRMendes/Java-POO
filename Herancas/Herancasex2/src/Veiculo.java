public class Veiculo {
    private String nome;
    private String marca;
    private int ano;
    public Veiculo(String nome,String marca,int ano){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }

    public void mostrarVeiculo(){
        System.out.format("\nNome:%s" ,nome);
        System.out.format("\nMarca:%s", marca);
        System.out.format("\nAno: %d" ,ano);
    }

}
