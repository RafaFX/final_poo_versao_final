package br.univille.poo.app.model;

import br.univille.poo.app.model.ListaDAO;



public class CriarLista {



    private ListaDAO dao;

    public   CriarLista(){
        dao = new ListaDAO();
    }

    public void criar(String listaName) throws Exception {
        dao.inserir(listaName);

    }

    

}
