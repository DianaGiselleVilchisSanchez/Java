public class prom {
    float prom;
    public static void main(String[] args) {
        prom obj = new prom();
        obj.promediar (100, 90, 80); 
    }
    public float promediar(int x, int y, int z){
        prom =(x+y+z)/3;
        return prom;
    }
}
