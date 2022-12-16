public class MesCollector {

    private int mes;
    private int anyo;
    private int diames;

    private int[] cuantosDiasMes;

    public MesCollector(int mes, int anyo){
setMes(mes);
setAnyo(anyo);
setCuantosDiasMes(creaArraysMeses(mes));
    }


    public int[] creaArraysMeses(int mes){
        int[] diasMesAnyo = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int[] creado = new int[diasMesAnyo[mes]];
        return creado;
    }

    public int getTemperatura(int dia){
if (dia<1 || dia> cuantosDiasMes.length){
    return -1;
}
        return cuantosDiasMes[dia];
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
        return cuantosDiasMes;
    }

    public void setCuantosDiasMes(int[] cuantosDiasMes) {
        this.cuantosDiasMes = cuantosDiasMes;
    }


    //class
}
