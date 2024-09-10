package model.br.dio.desafio.dominio;

public
class Curso {
    String titulo;
    String decrcao;
    int cargaHoraria;

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
    int getCargaHoraria() {
        return cargaHoraria;
    }

    public
    void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public
    String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", decrcao='" + decrcao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
