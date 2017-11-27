
package Model;


public class CadastroPeça {
    
    private int codproduto;
    private String descriprod;
    private int qtdprod;
    private float precopag;
    private float precovenda;
    private int idforne;
    private String nomeforne;

    public int getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }

    public String getDescriprod() {
        return descriprod;
    }

    public void setDescriprod(String descriprod) {
        this.descriprod = descriprod;
    }

    public int getQtdprod() {
        return qtdprod;
    }

    public void setQtdprod(int qtdprod) {
        this.qtdprod = qtdprod;
    }

    public float getPrecopag() {
        return precopag;
    }

    public void setPrecopag(float precopag) {
        this.precopag = precopag;
    }

    public float getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(float precovenda) {
        this.precovenda = precovenda;
    }

    public int getIdforne() {
        return idforne;
    }

    public void setIdforne(int idforne) {
        this.idforne = idforne;
    }

    public String getNomeforne() {
        return nomeforne;
    }

    public void setNomeforne(String nomeforne) {
        this.nomeforne = nomeforne;
    }

    public CadastroPeça(int codproduto, String descriprod, int qtdprod, float precopag, float precovenda, int idforne, String nomeforne) {
        this.codproduto = codproduto;
        this.descriprod = descriprod;
        this.qtdprod = qtdprod;
        this.precopag = precopag;
        this.precovenda = precovenda;
        this.idforne = idforne;
        this.nomeforne = nomeforne;
    }
    
            
    
    
}
