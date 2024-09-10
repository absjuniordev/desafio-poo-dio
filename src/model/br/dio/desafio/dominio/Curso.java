package model.br.dio.desafio.dominio;

public
class Curso extends Conteudo{

    int cargaHoraria;

    @Override
    public
    double calcularXP() {
        return XP_PADROA * cargaHoraria;
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
                "titulo='" + getTitulo() + '\'' +
                ", decrcao='" + getDescrica() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
