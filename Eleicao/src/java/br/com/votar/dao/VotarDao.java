/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votar.dao;

import static br.com.votar.dao.BaseDao.conn;
import static br.com.votar.dao.BaseDao.stm;
import br.com.votar.data.Candidato;
import br.com.votar.data.ResultadoVotacao;
import br.com.votar.database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class VotarDao extends BaseDao{
    
    public void registarVoto(String idCandidato,String idEleicao, String idUsuario) throws SQLException {
        conn = DatabaseConnection.conectar();
        String query = "INSERT INTO UNINOVE.\"tb_votos\" (UNINOVE.\"tb_votos\".idusuario, UNINOVE.\"tb_votos\".idcandidato, UNINOVE.\"tb_votos\".ideleicao) "
                + " VALUES (?,?,?)";

        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, idUsuario);
        st.setString(2, idCandidato);
        st.setString(3, idEleicao);
        st.executeUpdate();

        DatabaseConnection.desconectar(conn);
    }
    
    public ArrayList<ResultadoVotacao> buscarVotacao(String idUsuario) throws SQLException {

        conn = DatabaseConnection.conectar();
        stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ArrayList<ResultadoVotacao> eleicoes = new ArrayList<ResultadoVotacao>();

        String query = "SELECT * FROM UNINOVE.\"tb_votos\" WHERE UNINOVE.\"tb_votos\".idusuario =  " + idUsuario;

        ResultSet resultados = stm.executeQuery(query);

        while (resultados.next()) {
            ResultadoVotacao resultadoVotacao = 
            new ResultadoVotacao(resultados.getString("idusuario"), resultados.getString("idcandidato"), resultados.getString("ideleicao"));
            eleicoes.add(resultadoVotacao);
        }

        DatabaseConnection.desconectar(conn);

        return eleicoes;
    }
    
    
    
    
    
}
