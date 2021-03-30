package Contato;

public class Contato {

    private static int contador = 0 ;


    private int id;
    private String nome;
    private int telfone;
    private String email;

    public Contato (int telefone, int id, String nome, String email){
        this.id = id;
        this.telfone = telefone;
        this.nome = nome;
        this.email = email;
        contador ++;
        id = contador;
    }

    public int getID (){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelfone() {
        return telfone;
    }

    public void setTelfone(int telfone) {
        this.telfone = telfone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contato: " +
                "\n ID: " + id +
                "\n Nome: " + nome +
                "\n Telefone: " + telfone +
                "\n email: " + email
                ;
    }
}
