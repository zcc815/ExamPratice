package Demo01.Day001;

/**
 * 类的加载及顺序测试
 * 测试结果:(输出顺序从上到下)
 * 父类静态变量
 * 父类静态代码块one
 * 父类静态代码块second
 * 父类非静态变量
 * 非静态语句one
 * 非静态语句second
 * 父类构造函数
 * 父类方法(静态 非静态不分先后,谁在前被调用则谁先被执行)
 *
 * 作者:张陈陈
 * 时间:2019/9/2/19:24
 */
public class Exam02Demo01 {
    //1.静态变量
    static String test01 = TestDemo01();

    //2.静态方法
    static String TestDemo01() {
        System.out.println("父类静态变量");
        return "静态变量";
    }

    //3.静态代码块
    static {
        System.out.println("父类静态代码块one");
    }

    static {
        System.out.println("父类静态代码块second");
    }

    //4.非静态变量
    String test02 = TestDemo02();

    //5.非静态变量测试方法
    public String TestDemo02() {
        System.out.println("父类非静态变量");
        return "父类非静态变量";
    }

    //6.非静态语句块
    {
        System.out.println("父类非静态语句one");
    }
    {
        System.out.println("父类非静态语句second");
    }

    //7.非静态方法
    public void methodTest(){
        System.out.println("父类非静态方法");
    }
    //7.1静态方法
    public static void staticMethodTest(){
        System.out.println("父类静态方法");
    }

    //8.构造函数


    public Exam02Demo01() {
        System.out.println("父类构造函数");
    }

    public static void main(String[] args) {
        Exam02Demo01 exam02Demo01 = new Exam02Demo01();
        exam02Demo01.staticMethodTest();
        exam02Demo01.methodTest();

    }
}
