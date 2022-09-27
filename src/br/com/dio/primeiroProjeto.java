package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroProjeto {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.setNome("Nacho");
        gato.setCor("preto");
        gato.setIdade("1");
        System.out.println(gato);

    }
}
