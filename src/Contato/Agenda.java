package Contato;

import Contato.expection.AgendaCheiaException;
import Contato.expection.ContatoNaoExisteException;

public class Agenda {

    private Contato [] contatos;

    public Agenda (){
        contatos = new Contato[5];
    }

    public void addContato(Contato contato) throws AgendaCheiaException {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                cheia = false;
            }
        }

            if(cheia){
                throw new AgendaCheiaException();
            }
    }
            public Contato procuraContato (int id){

            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i] != null) {
                    if (id == contatos[i].getID()) {
                        return contatos[i];
                    }
                }
            }
            return null;
        }
}