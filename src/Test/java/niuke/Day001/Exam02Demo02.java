package niuke.Day001;

/**
 * 测试子类父类结合的时候类的加载顺序
 * 测试结果:(输出顺序从上到下)
 * 父类静态变量
 * 父类静态代码块one
 * 父类静态代码块second
 * 子类静态变量
 * 子类静态代码块one
 * 子类静态代码块second
 * 父类非静态变量
 * 父类非静态语句one
 * 父类非静态语句second
 * 父类构造函数
 * 子类非静态变量
 * 子类非静态代码块one
 * 子类非静态代码块second
 * 子类构造函数
 *
 * 从此两次测试结果得出关于类的加载顺序的以下结论
 * 1.加载父类静态变量
 * 2.加载父类中静态代码块的内容
 * 3.加载子类静态变量
 * 4.加载子类中静态代码块的内容
 * 5.加载父类非静态变量
 * 6.加载父类非静态代码块内容
 * 7.加载父类构造方法
 * 8.加载子类非静态变量
 * 9.加载子类非静态代码块内容
 * 10.加载子类构造方法
 * 作者:张陈陈
 * 时间:2019/9/2/19:24
 */
public class Exam02Demo02 extends Exam02Demo01 {
    //1.静态变量
    static String test01 = SunTestDemo01();

    public static String SunTestDemo01() {
        System.out.println("子类静态变量");
        return "子类静态变量";
    }

    //2.静态代码块
    static {
        System.out.println("子类静态代码块one");
    }

    static {
        System.out.println("子类静态代码块second");
    }

    //3.非静态变量
    String test02 = SunTEstDemo02();

    public String SunTEstDemo02() {
        System.out.println("子类非静态变量");
        return "子类非静态变脸";
    }

    //4.非静态代码块
    {
        System.out.println("子类非静态代码块one");
    }

    {
        System.out.println("子类非静态代码块second");
    }

    //5.构造函数

    public Exam02Demo02() {
        System.out.println("子类构造函数");
    }

    //6.静态方法
    public static void StaticMethod() {
        System.out.println("子类静态方法");
    }

    //7.非静态方法
    public void Method() {
        System.out.println("子类非静态方法");
    }

    public static void main(String[] args) {
        Exam02Demo02 exam02Demo02 = new Exam02Demo02();
    }
}
