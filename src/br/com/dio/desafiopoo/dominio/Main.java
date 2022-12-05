package br.com.dio.desafiopoo.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso1 = new Curso();
      curso1.setTitulo("curso de java");
      curso1.setDescricao("descricao do curso1");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("curso de js");
      curso2.setDescricao("descricao do curso2");
      curso2.setCargaHoraria(8);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria de java");
      mentoria.setDescricao("mentoria java");
      mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
      System.out.println(mentoria);

    }
}