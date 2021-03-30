package Contato.expection;

public class ContatoNaoExisteException extends Exception{

    private int id;

    public ContatoNaoExisteException (int id){
        this.id = id;

    }


    public int getID() {
        return id ;

    }
}
