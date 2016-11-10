
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioEscolar
{
    //
    private DisplayDosDigitos dia;
    //
    private DisplayDosDigitos mes;
    //
    private DisplayDosDigitos year;
    
    public CalendarioEscolar(){
      dia = new DisplayDosDigitos(31);
      mes = new DisplayDosDigitos(13);
      year = new DisplayDosDigitos(100);
    }       
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoYear){
         dia.setValor(nuevoDia);
         mes.setValor(nuevoMes);
         year.setValor(nuevoYear);
    }
    public void avanzarFecha(){
         dia.incrementaValor();
         if (dia.getValor() == 1){
             mes.incrementaValor();
             if (mes.getValor() == 1){
                 year.incrementaValor();
             }
         }
     }
       public String mostrarFecha(){
        return dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + year.getValorDelDisplay();
    }
}
