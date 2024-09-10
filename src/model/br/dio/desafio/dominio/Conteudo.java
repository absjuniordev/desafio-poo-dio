package model.br.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADROA = 10d;

    private  String titulo;
    private   String descrica;

    public  abstract double calcularXP();

    public
    String getTitulo() {
        return titulo;
    }

    public
    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public
    String getDescrica() {
        return descrica;
    }

    public
    void setDescrica(String descrica) {
        this.descrica = descrica;
    }
}
