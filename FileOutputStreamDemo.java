package Demo;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class FileOutputStreamDemo  {
    /*
    1.IO流概述和分类          1.IO：
                            2.流：数据传输
                            3.应用：文件复制，文件上传，文件下载
                            4.分类： 1.数据流向  字节流
                                               字符流
                                    2.数据类型   输入流：读数据
                                                输出流：写数据
     2.字节流                       5.字节流写数据write
                            6.换行，持续写入
                            7.字节流写数据加异常处理
                            8.字节流读数据（字节）
                            9.字节流复制文本文件
                            10.字节流读数据(字节数组)
                            11.复制图片
                            12.字节缓冲流
                            13.复制视频
     3.字符流                1.为什么出现字符流   字符流=字节流+编码表
                            2.编码表  编码
                                     解码
                                     乱码
                              字符集
                             3.不同的编码解码问题
      ·字符流对字节流进行增强改进


     4.特殊操作流
     */
    public static void main(String[] args)throws java.io.IOException{
//        FileOutputStream fos=new FileOutputStream("idea_test\\FileOutputStream.txt",true);
//        fos.write(97);
//        fos.write(9);
//        fos.write(7);
//        Byte[] b=new Byte[]{97,98,99};
//        Byte[] b={97,98,99};
//        fos.write(b);
//        fos.write("abcde".getBytes());
//        for(int i=0;i<10;i++){
//            fos.write("hello".getBytes());
//            fos.write("\n".getBytes());
//        }
//        fos.close();


//        FileOutputStream fos=null;
//        try{
//            fos=new FileOutputStream("idea_test\\FileOutputStream.txt",true);
//            fos.write("hello".getBytes());
//        }catch(IOException e){
//            e.printStackTrace();
//        }finally{
//            fos.close();
//        }
//        FileInputStream fis=
//                new FileInputStream("idea_test\\FileOutputStream.txt");
//        int by;
////        fis.read()
////                by
////                        by->-1
//        while((by=fis.read())!=-1){
//            System.out.print((char)by);
//        }



//        FileInputStream fis=
//               new FileInputStream("idea_test\\FileOutputStream.txt");
//        FileOutputStream fos=
//                new FileOutputStream("idea_test\\FileInputStream.txt",true);
//        int by;
//        while((by=fis.read())!=-1){
//            fos.write(by);
//        }
//        fos.close();
//        fis.close();
//                FileInputStream fis=
//               new FileInputStream("idea_test\\FileOutputStream.txt");
//                byte[] bys=new byte[1024];
//                int len;
//                while((len=fis.read(bys))!=-1){
//                    System.out.print(new String(bys,0,len));
//                }
//                FileInputStream fis=
//               new FileInputStream("C:\\图片\\QQ图片20220125104045.jpg");
//        FileOutputStream fos=
//                new FileOutputStream("idea_test\\mn.jpg",true);
//                        byte[] bys=new byte[1024];
//                int len;
//                while((len=fis.read(bys))!=-1){
//                    fos.write(bys,0,len);
//                }
//        fos.close();
//        fis.close();
    }
}
