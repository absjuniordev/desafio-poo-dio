package model.br.dio.desafio.dominio;

import java.time.LocalDate;

public
class Mentoria {
  private   String titulo;
   private String decrcao;
private     LocalDate date;

    public
    String getTitulo() {
        return titulo;
    }

    public
    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public
    String getDecrcao() {
        return decrcao;
    }

    public
    void setDecrcao(String decrcao) {
        this.decrcao = decrcao;
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
                "titulo='" + titulo + '\'' +
                ", decrcao='" + decrcao + '\'' +
                ", date=" + date +
                '}';
    }
}
