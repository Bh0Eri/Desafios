package Livraria.Library;

import Livraria.Users.Usuario;

public class Emprestimo {
    private String dataEmprestimo;
    private String dataDevolucao;
    private Usuario usuario;
    private Livro livro;

    public Emprestimo(String dataEmprestimo, String dataDevolucao, Usuario usuario, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo" +
                "dataEmprestimo='" + dataEmprestimo + '\'' +
                " dataDevolucao='" + dataDevolucao + '\'' +
                "usuario=" + usuario +
                " livro=" + livro +
                '\n';
    }
}
