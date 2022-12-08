package p4;

import com.sun.source.tree.SynchronizedTree;

public class Singleton {
    private volatile static Singleton instance;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }

}

class  SingletonDriver{
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2= Singleton.getInstance();

        if (instance2==instance1)
            System.out.println("Both are equal");
        else
        System.out.println("Both are not equal");
    }
}
