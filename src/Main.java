import model.br.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public
class Main {
    public static
    void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrica("POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescrica("POO");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescrica("Mentoria Java POO");
        mentoria.setDate(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJunior = new Dev();
        devJunior.setNome("Junior");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos" + devJunior.getConteudosInscritots());
        devJunior.progredir();
        System.out.println("Conteudo concluidos" + devJunior.getConteudosConcluidos());
        System.out.println("------------------------------------------------------------------------");
        Dev devFau = new Dev();
        devFau.setNome("Fau");
        devFau.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos" + devFau.getConteudosInscritots());
        devFau.progredir();
        System.out.println("Conteudo concluidos" + devFau.getConteudosConcluidos());



    }
}