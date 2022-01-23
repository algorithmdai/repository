package Demo;

public class student implements Comparable<student>{
    public static String name;
    private int age;
    public student(String n,int age){
        name=n;
        this.age=age;
    }
    public student(){}
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public int compareTo(student o){
        return this.age==o.age?this.name.compareTo(o.name):this.age-o.age;
    }

    private String n1="L";
    private static String n2="s";
    public void show1(){}
    public void show2(){
        System.out.println(n1);
        System.out.println(n2);
        show1();
        show3();
    }
    public static void show3(){
    }
    public static void show4(){}
}
