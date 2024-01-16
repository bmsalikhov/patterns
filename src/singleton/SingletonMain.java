package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton.instance.setName("Singleton\'s name");
        System.out.println(Singleton.instance.getName());

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1 == lazySingleton2);

        System.out.println(lazySingleton1.getName());
        System.out.println(lazySingleton2.getName());
        lazySingleton1.setName("Name");
        System.out.println(lazySingleton1.getName());
        System.out.println(lazySingleton2.getName());
    }
}
