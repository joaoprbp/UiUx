package login;

public class Main {

    public static void main(String[] args) {

        // Cria um objeto User
        User u = new User();

        // Valores de teste (troque por dados reais do seu banco)
        String login = "admin";
        String senha = "123";

        // Testa o método verificarUsuario
        boolean resultado = u.verificarUsuario(login, senha);

        if (resultado) {
            System.out.println("Login realizado com sucesso!");
            System.out.println("Bem-vindo, " + u.nome);
        } else {
            System.out.println("Login inválido. Tente novamente.");
        }
    }
}