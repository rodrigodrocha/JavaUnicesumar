package com.cadastro.usuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aplicacao {
    public static void main(String[] args){
        //Usuario user = new Usuario("Thaís Bispo", "thaisbispoo@email.com", "123456" );
        //insertUser(user);
        listarUsuarios();
        atualizarUsuario(6,"Rodrigo Donizetti Rocha", "rodrigo.rocha@email.com", "654321");
        deletarUsuario(1);
        listarUsuarios();
    }
    public static void insertUser(Usuario user){
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?,?,?)";

        //TRY-WITH-RESOURCES
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Usuario inserido com sucesso! Linhas afetadas: " + linhasAfetadas);
        } catch (SQLException e){
            System.out.println("Erro ao inserir usuário: " + e.getMessage());
        }
    }
    //método consultar BD
    public static void listarUsuarios(){
        String sql = "SELECT * FROM usuarios";

        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()){
            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String senha = rs.getString("senha");

                System.out.println(id + " | " + nome + " | " + email + " | " + senha);
            }
        // FINAL DO TRY
        } catch (SQLException e){
            System.out.println("Erro ao listar usuarios: " + e.getMessage());
        }
    } // FIM DO MÉTODO CONSULTAR BD
    //MÉTODO ATUALIZAR DADOS
    public static void atualizarUsuario(int id, String novoNome, String novoEmail, String novoSenha){
        String sql = "UPDATE usuarios SET nome = ?, email = ?, senha = ? WHERE id = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, novoNome);
            stmt.setString(2, novoEmail);
            stmt.setString(3, novoSenha);
            stmt.setInt(4, id);
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0){
                System.out.println("Usuario atualizado com sucesso!");
            } else {
                System.out.println("Erro ao atualizar usuario! ID informado não encontrado!");
            }

        }catch (SQLException e){
            System.out.println("Erro ao atualizar usuario: " + e.getMessage());
        }
    }// FIM DO MÉTODO ATUALIZAR DADOS
    //MÉTODO DELETAR DADOS
    public static void deletarUsuario(int id){
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

        }catch (SQLException e){
            System.out.println("Erro ao deletar usuario: " + e.getMessage());
        }
    } // FIM DO MÉTODO DELETAR DADOS
}
