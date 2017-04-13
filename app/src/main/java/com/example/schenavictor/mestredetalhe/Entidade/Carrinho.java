package com.example.schenavictor.mestredetalhe.Entidade;

import java.util.List;

/**
 * Created by 2015102617 on 12/04/2017.
 */
public class Carrinho {

    public int IdCarrinho;
    public String Data;
    public List<Produto> Produtos;
    public float Total;


    public Carrinho(int idCarrinho, String data, List<Produto> produtos, float total) {
        IdCarrinho = idCarrinho;
        Data = data;
        Produtos = produtos;
        Total = total;
    }

    public int getIdCarrinho() {
        return IdCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        IdCarrinho = idCarrinho;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public List<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        Produtos = produtos;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float total) {
        Total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carrinho)) return false;

        Carrinho carrinho = (Carrinho) o;

        if (getIdCarrinho() != carrinho.getIdCarrinho()) return false;
        if (Float.compare(carrinho.getTotal(), getTotal()) != 0) return false;
        if (!getData().equals(carrinho.getData())) return false;
        return getProdutos().equals(carrinho.getProdutos());

    }

    @Override
    public int hashCode() {
        int result = getIdCarrinho();
        result = 31 * result + getData().hashCode();
        result = 31 * result + getProdutos().hashCode();
        result = 31 * result + (getTotal() != +0.0f ? Float.floatToIntBits(getTotal()) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "IdCarrinho=" + IdCarrinho +
                ", Data='" + Data + '\'' +
                ", Produtos=" + Produtos +
                ", Total=" + Total +
                '}';
    }
}