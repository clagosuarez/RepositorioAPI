import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class app {
    public static void main(String[] args) throws IOException {
        GitHub github = AccesoPasswd();
        GHRepository repo = github.createRepository(
                "AccesoPasswd","this is my new repository",
                "https://www.kohsuke.org/",true/*public*/);
    }
    public static GitHub AccesoFichero() throws IOException {
        GitHub github = GitHubBuilder.fromPropertyFile("C:\\Users\\carlo\\Desktop\\login.txt").build();
        return github;
    }
    public static GitHub AccesoToken() throws IOException {
        GitHub github = new GitHubBuilder().withJwtToken("").build();
        return github;
    }
    public static GitHub AccesoPasswd() throws IOException {
        GitHub github = new GitHubBuilder().withPassword("", "").build();
        return github;
    }
}
