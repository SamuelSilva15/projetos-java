public class E3 {

    public static void main (String[] args){

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

        System.out.println("Nome: " + livros.nome);
        System.out.println("Autor: " + livros.autor);
        System.out.println("Formato: " + livros.formato);
        System.out.println("Formato: " + livros.capa);
        System.out.println("Formato: " + livros.codigobarra);
        System.out.println("Formato: " + livros.edicao);
        System.out.println("Formato: " + livros.editora);
        System.out.println("Formato: " + livros.idioma);
        System.out.println("Formato: " + livros.numeropag);
    }
}
