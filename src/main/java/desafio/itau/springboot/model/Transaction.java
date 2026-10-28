package desafio.itau.springboot.model;

import java.time.OffsetDateTime;



public class Transaction {

    private Double valor;
    private OffsetDateTime dataHora;

    public Transaction(final Double valor, final OffsetDateTime dataHora)
    {
        this.dataHora = dataHora;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

}
