package ArrayList;
public class numerosAleatorios {
    public static int generaNumeroAleatorio(int minimo, int maximo){
        
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    
    public static double generaNumeroRealAleatorio(double minimo, double maximo){
        
        double num=Math.random()*(minimo-(maximo+1))+(maximo+1);
        return num;
    }
}
