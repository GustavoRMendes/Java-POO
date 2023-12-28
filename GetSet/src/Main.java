//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Person pessoa = new Person();
            pessoa.setNome("Davi\n");
            System.out.format(pessoa.getNome());

            Conta bradesco = new Conta();
            System.out.println(bradesco.getSaldo());
            bradesco.depositar(-200.50);
            System.out.println(bradesco.getSaldo());
            bradesco.setSaldo(2000);
            System.out.println(bradesco.getSaldo());
        }
    }