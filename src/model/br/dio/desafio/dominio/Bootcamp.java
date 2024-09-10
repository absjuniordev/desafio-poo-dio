package model.br.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public
class Bootcamp {
    private String name;
    private  String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFicnal = dataInicial.plusDays(45);
    private Set<Dev> devsIsncritos = new HashSet<>()    ;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    public
    String getDescricao() {
        return descricao;
    }

    public
    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public
    LocalDate getDataInicial() {
        return dataInicial;
    }

    public
    LocalDate getDataFicnal() {
        return dataFicnal;
    }

    public
    Set<Dev> getDevsIsncritos() {
        return devsIsncritos;
    }

    public
    void setDevsIsncritos(Set<Dev> devsIsncritos) {
        this.devsIsncritos = devsIsncritos;
    }

    public
    Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public
    void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public
    boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFicnal, bootcamp.dataFicnal) && Objects.equals(devsIsncritos, bootcamp.devsIsncritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public
    int hashCode() {
        return Objects.hash(name, descricao, dataInicial, dataFicnal, devsIsncritos, conteudos);
    }
}
