
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioEscolar
{
    //
    private int dia;
    //
    private int mes;
    //
    private int year;
    public CalendarioEscolar(){
        dia = 1;
        mes = 1;
        year = 1;
    }       
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoYear){
         dia = nuevoDia;
         mes = nuevoMes;
         year = nuevoYear;
     }
     public void avanzarFecha(){
         dia = dia +1;
         if (dia == 30){
             dia = 1;
             mes = mes +1;
             if (mes == 12){
                 dia = 1;
                 mes = 1;
                 year = year +1;
                 if (year == 99){
                     dia = 1;
                     mes = 1;
                     year = 1;
                 }
             }
         }
    }
    public String obtenerFecha(){
        String diaCadena;
        if (dia < 10){
            diaCadena = "0" + dia;
        }
        else{
            diaCadena = "" + dia;
        }
        String mesCadena;
        if (mes < 10){
           mesCadena = "0" + mes;
        }
        else{
            mesCadena = "" + mes;
        }
        String yearCadena;
        if (year <10){
            yearCadena = "0"+ year;
        }
        else{
            yearCadena = "" + year;
        }
        return diaCadena + "-" + mesCadena + "-" + yearCadena;
    }
}
