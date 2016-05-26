/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.saratapuy;

/**
 *
 * @author Usuario
 */
public class clsProducto {

    public enum unidades{litros,libras,metros};
    
    private int _ID;
    private String _Nombre;
    private float _Valor;
    private unidades _Unidades;

    public clsProducto() {
    }

    public clsProducto(int _ID, String _Nombre, float _Valor, unidades _Unidades) {
        this._ID = _ID;
        this._Nombre = _Nombre;
        this._Valor = _Valor;
        this._Unidades = _Unidades;
    }
    
    
    public int ID() {
        return _ID;
    }

    public void ID(int ID) {
        this._ID = ID;
    }

    public String Nombre() {
        return _Nombre;
    }

    public void Nombre(String Nombre) {
        this._Nombre = Nombre;
    }

    public float Valor() {
        return _Valor;
    }

    public void Valor(float Valor) {
        this._Valor = Valor;
    }

    public unidades Unidades() {
        return _Unidades;
    }

    public void Unidades(unidades Unidades) {
        this._Unidades = Unidades;
    }
    
}
