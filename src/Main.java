import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev matheus = new Dev();
        matheus.setNome("Matheus");
        matheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Matheus " + matheus.getConteudosInscritos());
        matheus.progredir();
        matheus.progredir();
        System.out.println("Conteudos Concluidos Matheus " + matheus.getConteudosConcluidos());
        System.out.println("XP:" + matheus.calcularTotalXp());

        Dev nathan = new Dev();
        nathan.setNome("Nathan");
        nathan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Nathan " + nathan.getConteudosInscritos());
        nathan.progredir();
        System.out.println("Conteudos Concluidos Nathan " + nathan.getConteudosConcluidos());
        System.out.println("XP:" + nathan.calcularTotalXp());
    }
}