package cafelogin;
import java.util.HashMap;
import java.util.Scanner;

public class CafeLogin {
    private static HashMap<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {
        // Agregar usuarios a la base de datos (podrían ser cargados desde una base de datos real en una aplicación real)
        usuarios.put("juanito", "12345");
        usuarios.put("imelda", "12345");
        usuarios.put("kevin", "12345");

        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre de usuario y contraseña
        System.out.println("Ingrese su nombre de usuario:");
        String username = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String password = scanner.nextLine();

        // Verificar credenciales
        if (verificarCredenciales(username, password)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
            menu m=new menu();
            m.listamenu();
        } else {
            System.out.println("Credenciales incorrectas. Inténtelo de nuevo.");
        }
    }

    private static boolean verificarCredenciales(String username, String password) {
        // Verificar si el usuario existe y si la contraseña coincide
        return usuarios.containsKey(username) && usuarios.get(username).equals(password);
    }
}
