package Livraria.Library;

import Livraria.Users.Usuario;

public interface Emprestavel {

    public void emprestar(Usuario usuario);

    public void devolver();

    String toString(Livro livro);
}
