/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro_fisica;

/**
 *
 * @author STIVEN
 */
class Libro_Fisica {

      private int codigo;
    private String autor;
    private String tipo;
    private int anio_edicion;

    public Libro_Fisica(int pCodigo,String pAutor , String pTipo,int pAnio_edicion ){
          codigo=pCodigo;
          autor=pAutor;
          tipo=pTipo;
          anio_edicion=pAnio_edicion;
    }

            public int getCodigo(){
                return codigo;
            }
            public void setCodigo(int codigo){
                this.codigo=codigo;

            }
            public String getAutor(){
                return autor;
            }
            public void setAutor(String autor){
                this.autor = autor;
            }
            public String getTipo(){
                return tipo;
            }
            public void setTipo(String tipo){
                this.tipo = tipo;
            }
            public int getAnio_edicion(){
                return anio_edicion;
            }
            public void setAnio_edicion(int anio_edicion){
                this.anio_edicion=anio_edicion;
            }
            @Override
    public String toString (){
        String numMntenimieto;
            return "El Libro de Fisica con codigo "+codigo+" para bachilerato de titulo: "+tipo+" del"
           + " autor "+autor
           + " del anio de edicion : "+anio_edicion+":no esta a la venta en este momento";

    }
}
    public class Libro_FisicaApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro_Fisica libro1_1=new Libro_Fisica(377,"ROBERT CHANG","FISICA CLASICA TOMO I",2003);
        Libro_Fisica libro2_2=new Libro_Fisica(378,"ANA GRACIA HERNANDEZ","FISICA CLASICA y FUNDAMENTAL",2005);
        Libro_Fisica libro3_3=new Libro_Fisica(379,"ESPINOZA RAMOS","FISICA CUANTICA", 2010);
        System.out.println(libro1_1.toString());
        System.out.println(libro2_2.toString());
        System.out.println(libro3_3.toString());
    }

}
