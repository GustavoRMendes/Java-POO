public class Conta {
    private double saldo;
    public void depositar(double valor){
        if(valor < 0){
            System.out.format("Não há como depositar valor negativo. Seu saldo continua:\n");
        }else{
            saldo += valor;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
