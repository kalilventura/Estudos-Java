package com.example.personaldiary.sqlcommands;

import com.example.personaldiary.models.Events;

/**
 * Classe com os comandos basicos SQL para a criacao das tabelas, consultas, atualizacoes, exclusao
 */
public class SqlCommands {

    /**
     * Cria a base de dados 'event'
     */
    public static final String CREATE_DATABASE = "CREATE TABLE IF NOT EXISTS " +
                                            " event(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                                            " titleEvent text not null," +
                                            " descriptionEvent text not null );";

    /**
     * Seleciona tudo da base escolhida
     * @param databaseName nome do banco de dados
     * @param extra comandos a mais do select
     * @return query
     */
    public static final String select(String databaseName, String extra) {
        String query = "SELECT * FROM "+ databaseName;
        if(!extra.isEmpty()) {
            String more = " "+extra;
            query.concat(more);
        }
        return  query;
    }

    /**
     * Seleciona tudo da base escolhida
     * @param databaseName nome do banco de dados
     * @return query
     */
    public static final String select(String databaseName) {
        String query = "SELECT * FROM "+ databaseName;
        return  query;
    }

    /**
     *  Atualiza o evento
     * @param event objeto que sera alterado
     * @return query
     */
    public static final String update(Events event){
        return " UPDATE event SET " +
                " titleEvent = '" +event.getTitle() + "' " +
                " , descriptionEvent = '" +event.getText() + "' "+
                " WHERE id = " + event.getId();
    }

    /**
     * Deleta o evento
     * @param event o que sera excluido
     * @return query
     */
    public static final String whereDelete(Events event){
        return " id = " + event.getId();
    }

}
