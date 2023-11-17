package persistencia;

import java.io.*;
import java.util.List;

public class Repositorio {

    public void gravar(List concessionarias) throws IOException {
        FileOutputStream saidaArquivo = new FileOutputStream("pedagio.dat");
        ObjectOutputStream objetoSaida = new ObjectOutputStream(saidaArquivo);
        objetoSaida.writeObject(concessionarias);
    }
    public boolean gravar(String xxx) { // SOBRECARGA DE MÉTODOS
        return true;
    }
    public List ler() throws IOException, ClassNotFoundException {
        FileInputStream entradaArquivo = new FileInputStream("pedagio.dat");
        ObjectInputStream objetoEntrada = new ObjectInputStream(entradaArquivo);
        Object concessionarias = objetoEntrada.readObject();
        return (List) concessionarias;

    }

}
