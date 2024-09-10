import model.br.dio.desafio.dominio.Curso;
import model.br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public
class Main {
    public static
    void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDecrcao("POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDecrcao("POO");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setDecrcao("Mentoria Java");
        mentoria.setDecrcao("Mentoria Java POO");
        mentoria.setDate(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
    }
}