package shopexample;

import shopexample.http.HttpAdapterImplHtmlURLConnection;
import shopexample.orcamento.Orcamento;
import shopexample.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("2000"), 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new HttpAdapterImplHtmlURLConnection());
        registro.registrar(orcamento);

    }
}
