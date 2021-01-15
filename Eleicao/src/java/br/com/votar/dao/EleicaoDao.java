/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votar.dao;

import br.com.votar.data.Eleicao;
import br.com.votar.data.ResultadoVotacao;
import br.com.votar.database.DatabaseConnection;
import br.com.votar.servlet.Votar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Internet
 */
public class EleicaoDao extends BaseDao {

    public void CadastrarEleicao(String eleicao, String descricao) throws SQLException {
        conn = DatabaseConnection.conectar();

        

        String query = "INSERT INTO UNINOVE.\"tb_eleicao\" (\"nomeEleicao\", \"descricao\") "
                + " VALUES (?,?)";

        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, eleicao);
        st.setString(2, descricao);
        st.executeUpdate();

        DatabaseConnection.desconectar(conn);
    }

    public ArrayList<Eleicao> BuscarEleicoes() throws SQLException {

        conn = DatabaseConnection.conectar();
        stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ArrayList<Eleicao> eleicoes = new ArrayList<Eleicao>();

        String query = "SELECT * FROM UNINOVE.\"tb_eleicao\" ";

        ResultSet resultados = stm.executeQuery(query);

        while (resultados.next()) {
            Eleicao eleicao = new Eleicao();
            eleicao.setNomeEleicao(resultados.getString("nomeEleicao"));
            eleicao.setDescricaoEleicao(resultados.getString("descricao"));
            eleicao.setIdEleicao(resultados.getInt("idEleicao"));

            eleicoes.add(eleicao);
        }

        DatabaseConnection.desconectar(conn);

        return eleicoes;
    }
}
