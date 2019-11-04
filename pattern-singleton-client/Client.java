public class Client {
    
    public Client() {}

    public static void main(String[] args){
        Singleton sing1 = Singleton.getInstance();
        sing1.service();
        Singleton sing2 = Singleton.getInstance();
        sing2.service();
        Singleton sing3 = Singleton.getInstance();
        sing3.service();

        System.out.println(sing1==sing2);

    }
} 