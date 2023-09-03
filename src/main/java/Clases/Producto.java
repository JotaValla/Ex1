/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User
 */
public class Producto {

    private String codProducto;
    private String nombreProducto;
    private String descripcionProducto, catProd;
    private Double precioUnit;
    private Double pesoNeto;
    private int cantStock;
    private Double contCacao;
    private boolean estadoStock;
    private boolean estadoProducto;

    public Producto() {
    }

    
    
    public Producto(String codProducto, String nombreProducto, String descripcionProducto,String catProd, Double precioUnit, Double pesoNeto, int cantStock, Double contCacao, boolean estadoStock, boolean estadoProducto) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.catProd = catProd;
        this.precioUnit = precioUnit;
        this.pesoNeto = pesoNeto;
        this.cantStock = cantStock;
        this.contCacao = contCacao;
        this.estadoStock = estadoStock;
        this.estadoProducto = true;
    }

    public String getCatProd() {
        return catProd;
    }

    public void setCatProd(String catProd) {
        this.catProd = catProd;
    }

    
    
    public Double getPesoNeto() {
        return pesoNeto;
    }

    public void setPesoNeto(Double pesoNeto) {
        this.pesoNeto = pesoNeto;
    }

    
    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(Double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public Double getContCacao() {
        return contCacao;
    }

    public void setContCacao(Double contCacao) {
        this.contCacao = contCacao;
    }

    public boolean isEstadoStock() {
        return estadoStock;
    }

    public void setEstadoStock(boolean estadoStock) {
        this.estadoStock = estadoStock;
    }

    public boolean isEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
    
    

}
