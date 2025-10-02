package Livraria.Library;

import Livraria.Users.*;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {


    ArrayList<Livro> livros = new ArrayList <>();

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void addLivro (Livro livro){
        // Populando Livros
        livros.add(livro);
    }
    
    public String devolverLivro(Usuario u, int codigo) {
            Livro livro = buscarLivroPorCodigo(codigo+1);
            if (livro == null) {
                return "Livro não encontrado.";
            }

            if (livro.getStatus().equals(Status.EMPRESTADO)) {
                livro.setStatus(Status.DISPONIVEL);
                return "Livro devolvido com sucesso!";
            }
            return "Este usuário não possui esse livro emprestado.";
        }

    private Livro buscarLivroPorCodigo(int codigo) {
        for (Livro l : livros) {
            if (l.getId() == codigo+1) {
                return l;
            }
        }
        return null;
    }

    // Emprestar livro pelo objeto Usuario
    public String emprestarLivro(Usuario u, int codigo) {
        Livro livro = buscarLivroPorCodigo(codigo);
        if (livro == null) {
            return "Livro não encontrado.";
        }
        if (livro.getStatus() == Status.EMPRESTADO) {
            return "Livro indisponível.";
        }
        livro.setStatus(Status.EMPRESTADO);
        return "Livro emprestado com sucesso!";
    }

    public String emprestarLivro(int userId, int codigo) {
        Usuario usuario = buscarUsuarioPorId(userId);
        if (usuario == null) {
            return "Usuário não encontrado.";
        }
        return emprestarLivro(usuario, codigo);
    }

    private Usuario buscarUsuarioPorId(int id) {

        return null;
    }
}




