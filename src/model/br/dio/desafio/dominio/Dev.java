package model.br.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public
class Dev {
    private  String nome;
    private Set<Conteudo> conteudosInscritots = new LinkedHashSet<>();
    private  Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){}

    public  void  progredir(){}

    public void calcularTotalXp(){}

    public
    String getNome() {
        return nome;
    }

    public
    void setNome(String nome) {
        this.nome = nome;
    }

    public
    Set<Conteudo> getConteudosInscritots() {
        return conteudosInscritots;
    }

    public
    void setConteudosInscritots(Set<Conteudo> conteudosInscritots) {
        this.conteudosInscritots = conteudosInscritots;
    }

    public
    Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public
    void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public
    boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritots, dev.conteudosInscritots) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public
    int hashCode() {
        return Objects.hash(nome, conteudosInscritots, conteudosConcluidos);
    }
}
