package com.example.schenavictor.mestredetalhe.Entidade;

/**
 * Created by 2015102617 on 12/04/2017.
 */
public class Produto {

    public int ProdutoID;
    public String Descricao;
    public float Preço;

    public Produto(int produtoID, String descricao, float preço) {
        ProdutoID = produtoID;
        Descricao = descricao;
        Preço = preço;
    }


    public int getProdutoID() {
        return ProdutoID;
    }

    public void setProdutoID(int produtoID) {
        ProdutoID = produtoID;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public float getPreço() {
        return Preço;
    }

    public void setPreço(float preço) {
        Preço = preço;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;

        Produto produto = (Produto) o;

        if (getProdutoID() != produto.getProdutoID()) return false;
        if (Float.compare(produto.getPreço(), getPreço()) != 0) return false;
        return getDescricao().equals(produto.getDescricao());

    }

    @Override
    public int hashCode() {
        int result = getProdutoID();
        result = 31 * result + getDescricao().hashCode();
        result = 31 * result + (getPreço() != +0.0f ? Float.floatToIntBits(getPreço()) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "ProdutoID=" + ProdutoID +
                ", Descricao='" + Descricao + '\'' +
                ", Preço=" + Preço +
                '}';
    }
}
