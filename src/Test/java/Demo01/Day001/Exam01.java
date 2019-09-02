package Demo01.Day001;

import org.junit.Test;

public class Exam01 {
    /**
     * 测试类型转换时数值溢出
     *  byte b = (byte)129;
     *  结果:-127
     */
    @Test
    public void testDemo01(){
        byte b = (byte)129;
        System.out.println(b);
    }
}
