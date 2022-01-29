package Demo;
import java.io.File;
import java.io.IOException;
public class fileDemo {
    //1.File类的概述,构造方法
    //2.File 创建,判断,获取,删除功能

    public static void main(String[] args) throws IOException{
        File f1=new File("D:\\IDEA\\idea_test\\src\\File1\\file");
//        System.out.println(f1.createNewFile());
//        System.out.println(f1.mkdir());
//        System.out.println(f1.mkdirs());
        File f2=new File("idea_test\\src\\Demo");//D:\IDEA\idea_test\src\
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());
        System.out.println(f2.toString());



        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getPath());
        System.out.println(f2.getName());

        //绝对路径   相对路径（相对项目）
        File f3=new File("java.text");//跟项目下的模块同一级
        System.out.println(f3.createNewFile());
        System.out.println(f3.delete());

        File f4=new File("idea_test\\java.txt");
        f4.mkdir();
        f4.delete();
    }
}
