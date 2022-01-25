package Demo;
public class Fu {
    private void show1(){}
    void show2(){}
    protected void show3(){}
    public void show4(){}

    public static void main(String[] args){
        Fu f=new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
package Demo;
public class Zi extends Fu{
    public static void main(String[] args){
        Zi z=new Zi();
        // z.show1();
        z.show2();
        z.show3();
        z.show4();
    }
}
package Demo;
public class demo{
    public static void main(String[] args){
        Zi z=new Zi();
        // z.show1();
        z.show2();
        z.show3();
        z.show4();
        Fu f=new Fu();
        /// f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
package Demo1;
import Demo.Fu;
public class Zi extends Fu {
    public static void main(String[] args){
        Demo1.Zi z=new Demo1.Zi();
//        z.show1();
//        z.show2();
        z.show3();
        z.show4();
    }
}
package Demo1;
        import Demo.Fu;
public class demo {
    public static void main(String[] args) {
        Fu f=new Fu();
//        f.show1();
//        f.show2();
//        f.show3();
        f.show4();
    }
}
