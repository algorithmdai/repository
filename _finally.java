package Demo;
import java.util.Scanner;
public class _finally {
    public static int ff(){
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        try {
            int i=Integer.valueOf(str);
            i++;
            System.out.println("try");
        }catch (NumberFormatException e) {
            System.out.println("catch");
            return 1;
        }finally {
            System.out.println("finally");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(ff());
    }
}
