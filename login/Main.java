package login;

public class Main {
    public static void main(String[] args) {
        User u = new User();

        // Teste do método verificarUsuario
        boolean ok = u.verificarUsuario("lopes", "123");

        if (ok) {
            System.out.println("Usuário encontrado: " + u.nome);
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
