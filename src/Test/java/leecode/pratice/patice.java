package leecode.pratice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class patice {
    /**
     * 给定一个大小写字母混合的字符串,生成一个新的字符串,大写字母在前,小写字母在后,字符顺序不变;
     */
    @Test
    public static void append() {
        String str = "BcadK";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuffer stringBuffer = new StringBuffer();
        for (char aChar : chars) {
            stringBuffer.append(aChar);
        }
        System.out.println(chars);
    }

    /**
     * 给定一个字符串,计算返回一定条件的全排列字符串数组
     * 条件:以"C"开头以"C"结尾,长度为7的字符串,例如:"Ca01bDc";
     * 举例:["C01","abc","C","C0C"]--->["C01abcC","C01COCC","C01CCOC".....]
     * @param args
     */
    public static void main(String[] args) {
        String last = null;
        String first = null;
        String [] strArr = {"C01","abc","C","COC"};
        StringBuffer sb=new StringBuffer();
        ArrayList<String> alFirst = new ArrayList<>();
        ArrayList<String> alLast = new ArrayList<>();

        for (String s : strArr) {
            //1.1找到所有C开头的字符串
            if (s.charAt(0)=='C')
                alFirst.add(s);
            //1.2找到所有C结尾的字符串
            if(s.charAt(s.length()-1)=='C')
                alLast.add(s);
        }

        //2.遍历所有可能的组合
        for (String s : alFirst) {
            first = s;
            for (String s1 : alLast) {
                last=s1;
                /*System.out.println(first);
                System.out.println(last);*/
                if (last!=first){
                    StringBuffer sbTmp = sb;
                    for (int i = 0; i <strArr.length ; i++) {
                        if (strArr[i]!= first && strArr[i]!=last){
                            if ((first.length()+strArr[i].length()+last.length())==7){
                                sb.append(first);
                                sb.append(strArr[i]);
                                sb.append(last);
                                String string = sb.toString();
                                System.out.println(string);
                                sb.delete(0,sb.length());
                            }
                        }
                    }
                    System.out.println("---------");
                }
            }
        }
    }

}
