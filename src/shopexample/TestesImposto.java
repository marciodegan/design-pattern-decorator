package shopexample;

import shopexample.imposto.CalculadoraDeImposto;
import shopexample.imposto.ICMS;
import shopexample.imposto.ISS;
import shopexample.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImposto calculador = new CalculadoraDeImposto();

        System.out.println(calculador.calcular(orcamento, new ISS(null)));
        System.out.println(calculador.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
