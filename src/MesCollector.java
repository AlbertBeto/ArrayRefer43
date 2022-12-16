import java.sql.SQLOutput;

public class MesCollector {

    private int mes;
    private int anyo;
    private int diames;

    private int[] tempsDiasMes;

    public MesCollector(int mes, int anyo){
setMes(mes);
setAnyo(anyo);
setTempsDiasMes(creaArraysMeses(mes));
    }


    public int[] creaArraysMeses(int mes){
        int[] diasMesAnyo = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int[] creado = new int[diasMesAnyo[mes]];
        for (int i=0;i<creado.length;i++){
            creado[i]=0;
        }
        return creado;
    }

    public int getTemperatura(int dia){
if (dia<1 || dia> tempsDiasMes.length){
    return -1;
}
        return tempsDiasMes[dia-1];
    }


    public void setTemperatura(int dia,int temp){
        if (dia>=1 && dia<= tempsDiasMes.length){
            setTempsDiasMes(dia-1,temp);
        }
    }
/*
public String toString(){
    enero.toString();


        for (int i=0;i<tempsDiasMes.length;i++){
        if (tempsDiasMes[i]==0){
            System.out.print("No data ,");
        }else{
            System.out.print(tempsDiasMes[i]+",");
        }
    }

}

*/
public void printTemperatureMonth(){
        for (int i=0;i<tempsDiasMes.length;i++){
            if (tempsDiasMes[i]==0){
                System.out.print((i+1)+ ": " +"No data ,");
            }else{
                System.out.print((i+1)+ ": " +tempsDiasMes[i]+",");
            }
        }
}






    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getDiames() {
        return diames;
    }

    public void setDiames(int diames) {
        this.diames = diames;
    }

    public int[] getCuantosDiasMes() {
        return tempsDiasMes;
    }

    public void setTempsDiasMes(int dia, int temp) {
        this.tempsDiasMes[dia] =temp;
    }
    public void setTempsDiasMes(int[] inicio) {
        this.tempsDiasMes=inicio;
    }

    //class
}
