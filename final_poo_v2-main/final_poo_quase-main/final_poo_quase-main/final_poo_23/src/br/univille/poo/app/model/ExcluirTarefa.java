package br.univille.poo.app.model;

import br.univille.poo.app.model.TarefaDAO;

public class ExcluirTarefa {

    private TarefaDAO dao;

    public ExcluirTarefa(){
        dao = new TarefaDAO();
    }

    public void excluir(int tarefa_id) throws Exception{
        dao.excluir(tarefa_id);
    }
}
