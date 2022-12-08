package view;

import Controller.PersistenciaEmBD;
import model.Fatura;
import model.Livro;

public class TestaLivro {

    public static void main(String[] args) {

        // Instanciando um objeto livro1 passando os paramentos da classe Livro
        Livro livro1 = new Livro("Java básico","Marcos Silva",2003,69.56,"356586");

        // Será feito o calculo da fatura da compra realizada do livro1 que é passado como paramento
        Fatura fatura1 = new Fatura( livro1,2,3.57,1.36);


        //Persitindo a fatura no BD(Banco de Dados)
        PersistenciaEmBD persistenciaEmBD1 = new PersistenciaEmBD(fatura1);
        //Salvando a fatura no BD
        persistenciaEmBD1.salvar(fatura1);

    }
}
