import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class app {
    public static void main(String[] args) throws IOException {
        // Llamar al método de acceso
        GitHub github = AccesoPasswd();
        //Crear repositorio con nombre, descripción, url del autor y setear el acceso del mismo a público(true) o privado(false)
        GHRepository repo = github.createRepository(
                "AccesoPasswd","this is my new repository",
                "https://www.kohsuke.org/",true/*public*/);
    }
    public static GitHub AccesoFichero() throws IOException {
        // Acceder medíante la ruta de un fichero externo que contiene el usuario y contraseña de github (uno en cada línea)
        GitHub github = GitHubBuilder.fromPropertyFile("C:\\Users\\carlo\\Desktop\\login.txt").build();
        // Devolver la conexión mediante un objeto de tipo Github
        return github;
    }
    public static GitHub AccesoToken() throws IOException {
        // Acceder medíante token que nos facilita github desde settings/developer
        GitHub github = new GitHubBuilder().withJwtToken("").build();
        // Devolver la conexión mediante un objeto de tipo Github
        return github;
    }
    public static GitHub AccesoPasswd() throws IOException {
        // Acceder mediante el usuario y contraseña de github
        GitHub github = new GitHubBuilder().withPassword("", "").build();
        // Devolver la conexión mediante un objeto de tipo Github
        return github;
    }
}
