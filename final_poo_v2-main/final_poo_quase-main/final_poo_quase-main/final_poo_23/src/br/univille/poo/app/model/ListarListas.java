package br.univille.poo.app.model;

import br.univille.poo.app.model.Lista;
import br.univille.poo.app.model.ListaDAO;

import java.util.List;

public class ListarListas {

    private ListaDAO dao;

    public ListarListas(){
        dao = new ListaDAO();
    }

    public List<Lista> obterTodos(){
        return dao.obterTodos();
    }

}
