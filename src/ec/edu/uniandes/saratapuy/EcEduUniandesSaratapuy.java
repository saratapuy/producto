/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.saratapuy;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class EcEduUniandesSaratapuy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     ArrayList<clsProducto> producto =new ArrayList<clsProducto>();
               clsProducto pr0 = new clsProducto(1,"Clavo",25,clsProducto.unidades.libras);
               clsProducto pr1 = new clsProducto(2,"Lubricante",15,clsProducto.unidades.litros);
               clsProducto pr2 = new clsProducto(3,"Alambre",20,clsProducto.unidades.metros);
              
     producto.add(pr0);
     producto.add(pr1);
     producto.add(pr2);
     imprimir(producto);
     
    }
    public static void imprimir(ArrayList<clsProducto> pro)
    {
        for (clsProducto productos :pro){
      System.out.println("*****************");
      System.out.println("ID:"+ productos.ID());
      System.out.println("Nombre:"+productos.Nombre());
      System.out.println("Valor:"+productos.Valor());
      System.out.println("Unidad:"+ productos.Unidades()); 
        }
  }
}

