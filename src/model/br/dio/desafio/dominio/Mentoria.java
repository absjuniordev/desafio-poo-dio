package model.br.dio.desafio.dominio;

import java.time.LocalDate;

public
class Mentoria  extends  Conteudo {

private     LocalDate date;

    @Override
    public
    double calcularXP() {
        return XP_PADROA +20d;
    }

    public
    LocalDate getDate() {
        return date;
    }

    public
    void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public
    String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", decrcao='" + getTitulo() + '\'' +
                ", date=" + date +
                '}';
    }
}
