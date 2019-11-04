public class Singleton {
    
    private static Singleton instance = new Singleton();
    private static int cpt = 0;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        cpt++;
        return instance ;
    }

    public void service() {
        System.out.println("Singleton " + cpt + " uses service");
    }

}