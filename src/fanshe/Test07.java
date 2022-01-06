package fanshe;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/17 14:55
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        // 获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取扩展类加载器的父类加载器--> 根加载器（C/C++）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        // 测试当前类是哪一个加载器加载的
        ClassLoader classLoader = Class.forName("fanshe.Test07").getClassLoader();
        System.out.println(classLoader);
        //测试JDK内置的类是谁加载的
        classLoader  = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获得系统类加载器可以加载的路径

        System.out.println(System.getProperty("java.class.path"));

        /*
        双亲委派机制
            java.lang.String -->
         */
    }
}