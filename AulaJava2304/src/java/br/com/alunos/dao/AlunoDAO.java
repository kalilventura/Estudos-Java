/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alunos.dao;

import br.com.alunos.model.Aluno;
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
public class AlunoDAO {
    
    private static Connection conn = null;
    private static Statement stm = null;
    
    public ArrayList<Aluno> getTodos() throws SQLException {
        ArrayList<Aluno> alunos = new ArrayList();
        
        conn = DatabaseConnection.conectar();
        
        stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        String select = "SELECT aluno.IDALUNO, aluno.\"RA\", aluno.\"NOME\", curso.\"idCurso\", curso.\"nome_curso\", curso.\"tipo_curso\"\n"
                + "FROM kalil.\"tb_alunos\" as aluno, kalil.\"tb_cursos\" as curso\n"
                + "where aluno.IDCURSO = curso.\"idCurso\"";

        ResultSet resultados = stm.executeQuery(select);

        while (resultados.next()) {
            Aluno a = new Aluno();
            Curso c = new Curso();
            a.setIdAluno(resultados.getInt("IDALUNO"));
            a.setRA(resultados.getInt("RA"));
            a.setNome(resultados.getString("NOME"));

            c.setIdCurso(resultados.getInt("idCurso"));
            c.setNomeCurso(resultados.getString("nome_curso"));
            c.setTipoCurso(resultados.getString("tipo_curso"));

            a.setIdCurso(resultados.getInt("idCurso"));

            alunos.add(a);
        }
        DatabaseConnection.desconectar(conn);
        return alunos;
    }

    public void inserirAluno(Aluno a, int idCurso) throws SQLException{
        conn = DatabaseConnection.conectar();
        
        PreparedStatement st = conn.prepareStatement("insert into \"tb_alunos\" "
                + "(RA, NOME, IDCURSO) values(?, ?, ?)");
        st.setInt(1, a.getRA());
        st.setString(2, a.getNome());
        st.setInt(3, idCurso);
        st.executeUpdate();
        
        DatabaseConnection.desconectar(conn);
    }
}
