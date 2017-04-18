package com.example.schenavictor.mestredetalhe.Entidade;

/**
 * Created by 2015102617 on 17/04/2017.
 */
public class Cliente {
    private int IDCliente;
    private String NomeCompleto;
    private String Rua;

    public Cliente(int IDCliente, String nomeCompleto, String rua) {
        this.IDCliente = IDCliente;
        NomeCompleto = nomeCompleto;
        Rua = rua;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        NomeCompleto = nomeCompleto;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;

        Cliente cliente = (Cliente) o;

        if (getIDCliente() != cliente.getIDCliente()) return false;
        if (getNomeCompleto() != null ? !getNomeCompleto().equals(cliente.getNomeCompleto()) : cliente.getNomeCompleto() != null)
            return false;
        return getRua() != null ? getRua().equals(cliente.getRua()) : cliente.getRua() == null;

    }

    @Override
    public int hashCode() {
        int result = getIDCliente();
        result = 31 * result + (getNomeCompleto() != null ? getNomeCompleto().hashCode() : 0);
        result = 31 * result + (getRua() != null ? getRua().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "IDCliente=" + IDCliente +
                ", NomeCompleto='" + NomeCompleto + '\'' +
                ", Rua='" + Rua + '\'' +
                '}';
    }
}
