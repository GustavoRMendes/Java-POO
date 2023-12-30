public class Jogo implements VideoGame {

    public void iniciarJogo(String nomeJogo, String usuario) {
        System.out.printf("Iniciando Jogo %s \n",nomeJogo);
        System.out.printf("Bem-vindo(a) %s!\n",usuario);
    }
    public void jogarJogo() {
        System.out.printf("Jogando...\n");
    }
    public void fecharJogo() {
        System.out.printf("Fechando Jogo.\n");
        System.out.printf("Volte sempre!\n");
    }

}
