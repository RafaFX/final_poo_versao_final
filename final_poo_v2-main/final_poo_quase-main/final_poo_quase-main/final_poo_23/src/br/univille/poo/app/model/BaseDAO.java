package br.univille.poo.app.model;

import br.univille.poo.app.model.FabricaDeConexoes;

import java.sql.Connection;

class BaseDAO {

    protected Connection obterConexao(){
        return FabricaDeConexoes.obterInstancia().obterConexao();
    }

}
