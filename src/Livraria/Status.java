package Livraria;

public enum Status {
    EMPRESTADO(1), DISPONIVEL(2);

   public int valor;
   private Status(int valor) {
       this.valor = valor;
   }
}
enum idF{
    PROFESSOR(1), ALUNO(2);

    public int valor;
    private  idF(int valor) {
        this.valor = valor;
    }

    idF() {
    }
}