package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe responsável pela conexão com o banco e validação do usuário.
 */
public class User {

    public String nome = "";
    public boolean result = false;

    /**
     * Realiza a conexão com o banco de dados.
     * @return Conexão válida ou null em caso de erro.
     */
    public Connection conectarBD() {
        Connection conn = null;

        try {
            // Driver corrigido
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://127.0.0.1/teste?user=root&password=1234";
            conn = DriverManager.getConnection(url);

        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

        return conn;
    }

    /**
     * Verifica se o usuário existe no banco de dados.
     * @param login Login digitado
     * @param senha Senha digitada
     * @return true se o usuário existir  
     */
        public boolean verificarUsuario(String login, String senha) {

            String sql = "";
            Connection conn = conectarBD();

            // Evita NullPointerException caso a conexão falhe
            if (conn == null) {
                System.out.println("Conexão não estabelecida.");
                return false;
            }

            // INSTRUÇÃO SQL
            sql += "select nome from usuarios ";
            sql += "where login = '" + login + "'";
            sql += " and senha = '" + senha + "';";

            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {
                    result = true;
                    nome = rs.getString("nome");
                }

                // Fechamento dos recursos
                rs.close();
                st.close();
                conn.close();

            } catch (Exception e) {
                System.out.println("Erro ao verificar usuário: " + e.getMessage());
            }

            return result;
        }
} // fim da classe
