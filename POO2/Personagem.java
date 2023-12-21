package POO2;

import java.util.Random;

public class Personagem {
    String nome;
   
    int danoCausado(){
        Random gerador = new Random();
        int numero = 1 + (int) (gerador.nextInt(99));
        return numero;
    }

    void atacar(String alvo,String feitico){
        if(feitico.length() == 0){
            System.out.format("%s atacou %s. O dano foi de %d",nome,alvo,danoCausado());    
        }else{
            System.out.format("%s atacou %s com o feitiço %s. O dano foi de %d",nome,alvo,feitico,danoCausado());
        }
    }
    
}