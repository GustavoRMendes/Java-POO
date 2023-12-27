public class Festa {
    //private,public,default and protected
    private void beberCafe(){
        System.out.println("Bebeu uma xícara de café");
    }
    private void comerDoce(){
        System.out.println("Comeu um doce");
    }
    public void entrarFesta(){
        beberCafe();
        comerDoce();
    }

    // Protegendo o método discurso()
    /*  private void discurso(){
         System.out.println("Algum discurso");
     } */ 
}
