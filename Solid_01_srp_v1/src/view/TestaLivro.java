package view;

import model.Fatura;
import model.ImpressaoDeFatura;
import model.Livro;

public class TestaLivro {

    public static void main(String[] args) {

        // Instanciando um objeto livro1 passando os paramentos da classe Livro
        Livro livro1 = new Livro("Java básico","Marcos Silva",2003,69.56,"3565486");

        // Será feito o calculo da fatura da compra realizada do livro1 que é passado como paramento
        Fatura fatura1 = new Fatura( livro1,2,3.57,1.36);

        // Recebendo os dados da fatura1 como paramento para ser processada
        ImpressaoDeFatura faturaLivroFatura1 = new ImpressaoDeFatura(fatura1);

        //Gerando a impressão da fatura1, refrente a compra realizada do livr1
        faturaLivroFatura1.imprimir();

    }
}
