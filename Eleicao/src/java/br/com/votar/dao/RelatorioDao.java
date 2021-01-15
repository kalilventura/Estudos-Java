/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votar.dao;

import static br.com.votar.dao.BaseDao.conn;
import static br.com.votar.dao.BaseDao.stm;
import br.com.votar.data.Relatorio;
import br.com.votar.database.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kalil
 */
public class RelatorioDao extends BaseDao {

    public int buscarResultadoVotosCandidato(int idEleicao, int idCandidato) throws SQLException {
        int result = 0;
        try {
            conn = DatabaseConnection.conectar();
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "select \n"
                    + " count(v.IDCANDIDATO) as votos "
                    + " from \n"
                    + " UNINOVE.\"tb_candidato\" as c,\n"
                    + " UNINOVE.\"tb_eleicao\" as e,\n"
                    + " UNINOVE.\"tb_votos\" as v\n"
                    + " where\n"
                    + " v.IDCANDIDATO = c.IDCANDIDATO\n"
                    + " and\n"
                    + " c.IDELEICAO = e.\"idEleicao\"\n"
                    + " and\n"
                    + " e.\"idEleicao\" = " + idEleicao
                    + " and\n"
                    + " c.IDCANDIDATO = " + idCandidato;

            ResultSet resultados = stm.executeQuery(query);

            while (resultados.next()) {
                result = resultados.getInt("votos");
            }
            return result;
        } catch (Exception e) {
            return result;
        } finally {
            DatabaseConnection.desconectar(conn);
        }
    }
}
