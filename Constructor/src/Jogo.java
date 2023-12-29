public class Jogo {
    private String nome;
    private int divisao;
    private int nivel;
    //Constructor
    public Jogo(String nome,int nivel,int divisao){
        this.nome = nome;
        this.nivel = nivel;
        this.divisao = divisao;
        iniciarJogo();
    }
    private void iniciarJogo(){
        System.out.format("Bem-vindo(a) %s!",nome);
        System.out.format("\nNível: %d",nivel);
        System.out.format("\nSua divisão: %d\n",divisao);
    }
}
