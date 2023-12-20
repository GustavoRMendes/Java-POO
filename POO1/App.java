public class App {
    public static void main(String[] args)throws Exception {
   
        Mobile mobile1 = new Mobile();
        mobile1.nome = "Iphone 12";
        mobile1.tamanhoTela = 6.1f;
        mobile1.espacoArmazenamento = 256;
        mobile1.sistemaOperacional = "iOS";

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s",mobile1.nome,mobile1.tamanhoTela,mobile1.espacoArmazenamento,mobile1.sistemaOperacional);

        Mobile mobile2 = new Mobile();
        mobile2.nome = "Galaxy Note";
        mobile2.tamanhoTela = 6.9f;
        mobile2.espacoArmazenamento = 256;
        mobile2.sistemaOperacional = "Samsung";
        
        System.out.format("\nCelular %s com tela de %.1f, com %dgb e SO %s",mobile2.nome,mobile2.tamanhoTela,mobile2.espacoArmazenamento,mobile2.sistemaOperacional);
    }
}