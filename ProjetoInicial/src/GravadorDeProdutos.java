import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class GravadorDeProdutos {
    public List<Produtos> leProdutos() throws IOException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream((new FileInputStream("produtos.txt")));
            return (List<Produtos>) in.readObject();
        } catch (FileNotFoundException e) {
            throw new IOException("Não fo encontrado o arquivo produtos.txt");
        } catch (IOException e){
            throw e;
        } catch (ClassNotFoundException e ) {
            throw new IOException("A classe dos objetos gravados " + "produtos.txt não existe", e);

        } finally {
            if(in != null) {
                in.close();
            }
        }
    }
}
