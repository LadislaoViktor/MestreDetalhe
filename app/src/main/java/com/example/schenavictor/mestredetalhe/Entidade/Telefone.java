package com.example.schenavictor.mestredetalhe.Entidade;

/**
 * Created by 2015102617 on 17/04/2017.
 */
public class Telefone {
    private int IDTelefone;
    private String DDD;
    private String Telefone;
    private int IDCliente;

    public Telefone(int IDTelefone, String DDD, String telefone, int IDCliente) {
        this.IDTelefone = IDTelefone;
        this.DDD = DDD;
        Telefone = telefone;
        this.IDCliente = IDCliente;
    }

    public int getIDTelefone() {
        return IDTelefone;
    }

    public void setIDTelefone(int IDTelefone) {
        this.IDTelefone = IDTelefone;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefone)) return false;

        Telefone telefone = (Telefone) o;

        if (getIDTelefone() != telefone.getIDTelefone()) return false;
        if (getIDCliente() != telefone.getIDCliente()) return false;
        if (getDDD() != null ? !getDDD().equals(telefone.getDDD()) : telefone.getDDD() != null)
            return false;
        return getTelefone() != null ? getTelefone().equals(telefone.getTelefone()) : telefone.getTelefone() == null;

    }

    @Override
    public int hashCode() {
        int result = getIDTelefone();
        result = 31 * result + (getDDD() != null ? getDDD().hashCode() : 0);
        result = 31 * result + (getTelefone() != null ? getTelefone().hashCode() : 0);
        result = 31 * result + getIDCliente();
        return result;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "IDTelefone=" + IDTelefone +
                ", DDD='" + DDD + '\'' +
                ", Telefone='" + Telefone + '\'' +
                ", IDCliente=" + IDCliente +
                '}';
    }
}
