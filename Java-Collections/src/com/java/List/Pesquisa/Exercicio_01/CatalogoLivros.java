package com.java.List.Pesquisa.Exercicio_01;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
              livrosPorAutor.add(l);
            }
          }
          return livrosPorAutor;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }
    

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoFinal && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnos.add(livro); 
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2017);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2013);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2009);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2015);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

        System.out.println("");

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2015, 2017));

        System.out.println("");

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
