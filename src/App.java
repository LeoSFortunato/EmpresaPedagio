import modelo.Concessionaria;
import modelo.*;

public class App {
    public static void main(String[] args) {

        Concessionaria minhaConcessionaria = new Concessionaria("Concessionaria A");

        minhaConcessionaria.setNome("Concessionaria Aaaa");


        Praca praca01 = new Praca();
        praca01.setCidade("Curitiba");

        Praca praca02 = new Praca();
        praca02.setCidade("São Paulo");

        Praca praca03 = new Praca();
        praca03.setCidade("Rio de Janeiro");

        minhaConcessionaria.adicionarPraca(praca01);
        minhaConcessionaria.adicionarPraca(praca02);
        minhaConcessionaria.adicionarPraca(praca03 );

        minhaConcessionaria.adicionarPraca(praca01);

        minhaConcessionaria.limparPracas();
    }
}