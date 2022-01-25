package Demo;

public class static_Demo {
    static关键字的作用（修饰类、方法、变量、静态块）
    1. static修饰的类只能为内部类，普通类无法用static关键字修饰。static修饰的内部类相当于一个普通的类，访问方式为（new 外部类名.内部类的方法() ）。如下所示：
    public class OuterClass {
        public static class InnerClass{
            InnerClass(){
                System.out.println("============= 我是一个内部类'InnerClass' =============");
            }
        }
    }
    public class TestStaticClass {
        public static void main(String[] args) {
            // 不需要new一个InnerClass
            new OuterClass.InnerClass();
        }
    }
    注：普通内部类的访问方式为 （外部类对象.new 内部类方法()）
    2.static修饰静态方法的访问方式为  （类名.方法名）
    3.静态变量和实例变量的区别

    static修饰的变量为静态变量，静态变量在内存中只有一份存储空间，静态变量不属于某个实例对象，被一个类中的所有对象所共享，属于类，所以也叫类变量，可以直接通过类名来引用。

    实例变量属于某个固定对象所私有，实例变量的使用必须先创建一个类的实例，然后通过这个实例来引用使用。
}
