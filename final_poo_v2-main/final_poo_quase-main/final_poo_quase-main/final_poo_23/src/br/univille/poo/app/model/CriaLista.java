package br.univille.poo.app.model;


import java.util.ArrayList;
import java.util.List;

public class CriaLista {
    public List<String> listar() {
        List<String> lista = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            lista.add("Tarefa " + i);
        }
        return lista;
    }
}
