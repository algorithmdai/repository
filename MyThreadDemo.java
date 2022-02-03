package Demo;
/*
        1.实现多线程   进程
                     线程：单线程 多线程
                     实现多线程：1.继承Thread类 重run方法
                                2.实现Runnable接口
                     设置和获取线程名称
                     线程调度：1.分时
                              2.抢占式
                     线程控制
                     线程的生命周期（执行资格,执行权）

                     买票
        2.线程同步     数据安全问题标准：
                        1.多线程环境
                        2.共享数据
                        3.多条语句操作共享数据
                      同步代码块（解决问题3）
                        1.好处
                        2.弊端
                      同步方法
                         1.非静态方法 指向对象this

                         2.静态方法   指向类 (字节码文件对象)
                       线程安全的类
                          1.StringBuffer  StringBuilder
                          2.Vector        ArrayList
                          3.Hashtable     HashMap
                          4.将非线程安全类转化成线程安全类
                        Lock锁接口     为了更清晰的表达加锁和释放锁，提供更广泛的锁接口Lock

        3.生产者消费者
 */

public class MyThreadDemo {
    public static void main(String[] args){
        SellTicket st=new SellTicket();

        Thread t1=new Thread(st,"ck1");
        Thread t2=new Thread(st,"ck2");
        Thread t3=new Thread(st,"ck3");


        t1.start();
        t2.start();
        t3.start();
    }
}
