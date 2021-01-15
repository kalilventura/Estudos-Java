/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alunos.dao;

import br.com.alunos.model.Curso;
import br.com.alunos.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author kalil
 */
public class CursoDAO {

    private static Connection conn = null;
    private static Statement stm = null;

    public ArrayList<Curso> getTodos() throws SQLException {
        ArrayList<Curso> c = new ArrayList<Curso>();

        conn = DatabaseConnection.conectar();

        stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String select = "select * from kalil.\"tb_cursos\"";

        ResultSet resultados = stm.executeQuery(select);

        while (resultados.next()) {
            Curso curso = new Curso();
            curso.setIdCurso(resultados.getInt("idCurso"));
            curso.setNomeCurso(resultados.getString("nome_curso"));
            curso.setTipoCurso(resultados.getString("tipo_curso"));

            c.add(curso);
        }
        DatabaseConnection.desconectar(conn);

        return c;
    }
    
    public void inserirCurso(Curso curso) throws SQLException{
        
        conn = DatabaseConnection.conectar();
        
        PreparedStatement st = conn.prepareStatement("insert into \"tb_cursos\" "
                + "(\"nome_curso\", \"tipo_curso\") values(?, ?)");
        st.setString(1, curso.getNomeCurso());
        st.setString(2, curso.getTipoCurso());
        st.executeUpdate();
         
        DatabaseConnection.desconectar(conn);
    }
}
