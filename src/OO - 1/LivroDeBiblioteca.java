import java.util.Date;

public class LivroDeBiblioteca {

    public static void main (){

        Produtos LivroDeBiblioteca = new Produtos();
        Produtos livros = new Produtos();

        livros.nome = "Escatologia";
        livros.autor = "Ratzinger";
        livros.formato = "Fisico";
        livros.capa = "Capa dura";
        livros.codigobarra = 1234567;
        livros.edicao = 2;
        livros.editora = "lux";
        livros.idioma = "portugues";
        livros.numeropag = 122;

        livros.emprestado = true;
        livros.dataEntrega = new Date(12/02/2021);
        livros.nomemprestado = "Samuel";
    }
}
