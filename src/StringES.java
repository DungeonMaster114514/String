import java.util.Arrays;

public class StringES {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //String类初始化使用第一种方法更简便
        String string = "Ass We Can";
        String string2 = new String("Do you like Van You See");

        //将数组改为字符串的方法
        char[] chars = new char[]{'1','2','3'};
        String string3 = new String(chars);
        System.out.println("转换后"+string3);

        //==和Object类的equals比较的是地址是否相同,String类中重写过的equals才是比较值是否相同
        String Van = "DungeonMaster";
        String FuQ= "DungeonMaster";
        String Deep= "dungeonMaster";
        System.out.println("\nVan == FuQ " + Van == FuQ);//因为比较的是地址是否相同,所以返回false
        System.out.println("Van.equals(FuQ) " + Van.equals(FuQ));//比较值是否相同则返回true
        System.out.println("Van.equalsIgnoreCase(Deep) " + Van.equalsIgnoreCase(Deep));//不区分大小写

        //比较值的大小需要实现Comparable<类名>接口,并重写compareTo()方法
        //这在String类中都已经被搞定了
        System.out.println(string.compareTo(string2));//比较string与string2的大小,大于返回>0的数、小于返回<0的数,等于着返回0

        //通过for循环遍历字符串(String),请使用charAt()方法
        System.out.println("\n通过for循环遍历字符串string的方法");
        for (int i = 0; i < string.length(); i++) {
            char c1 = string.charAt(i);
            System.out.println(c1);
        }

        //字符串中查找元素调用.indexOf()方法
        int Ou = string2.indexOf("affoauoufff");//在字符串中查找ou
        System.out.println("\n找到了！ou的下标为"+Ou);//如果找道了ou则返回首字母o的下标
        int Ou2 = string2.lastIndexOf("ou");//从后往前查找ou
        System.out.println("找到了！从后往前查找ou的小标为"+Ou2);
        System.out.println("没找到！"+string2.indexOf("FUCK!"));//没找到元素则返回-1

        //其他类转字符串.valueOf
        String sa = String.valueOf(11451);
        System.out.println("\ndd整型转字符串类型 "+sa);
        char[] ch = {'a','b','c'};
        String sb = String.valueOf(ch);
        System.out.println("char数组转字符串类型 "+sb);
        //字符串转整数or其他类型.parseOf
        int a = Integer.parseInt("114514");
        System.out.println("字符串类型转整型 "+a);
        double b = Double.parseDouble("114514.1919810");
        System.out.println("字符串类型转Double "+b);
        float c = Float.valueOf("1.5");
        System.out.println("字符串类型转Float "+c);
        short d = Short.valueOf("15");
        System.out.println("字符串类型转short "+d);

        //字符串变大写String.toUpperCase
        String lower = "I bleeding in way of the fire burned";
        lower = lower.toUpperCase();
        System.out.println("\n将lower转为大写 "+lower);
        //字符串变小写String.toLowerCase
        String upper = "TO BLOSSOM WITHOUT YOU";
        upper = upper.toLowerCase();
        System.out.println("将upper转为小写 "+upper);

        //格式化输出String.format(类似C的printf)
        String output = String.format("\n格式化输出 %d,%s,%d",114,a,514);
        System.out.println(output);

        //替换字符串String.replace()
        System.out.println("\nreplace将\"I bleeding in way of the fire burned\"的e替换为f "+lower.replace("e","f"));
        System.out.println("replaceAll将\"I bleeding in way of the fire burned\"的e全部替换为f "+lower.replaceAll("e","f"));

        //字符串拆分String.split("分隔字符",次数)
        String dollar = "40-088-886-114$";
        String[] spDollar = new String[10] ;
        spDollar = dollar.split("-");//以字符串“-”作为分割线
        System.out.println("\n40-088-886-114以$\"-\"为分割线,分割后为 "+Arrays.toString(spDollar));
        //字符串拆分可设置分割的次数
        spDollar = dollar.split("-",2);
        System.out.println("40-088-886-114以$\"-\"为分割线,设置分割次数最多为2次后 "+Arrays.toString(spDollar));
        //分割"."需要转义字符
        String dollar2 = "3.1415926-this is π";
        spDollar = dollar2.split("\\.");
        System.out.println("分割\".\"需要使用转义字符 "+Arrays.toString(spDollar));
        //采用多个多个不同的字符分割,应用|分隔不同的字符
        spDollar = dollar2.split("\\.|-");
        System.out.println("采用多个不同的字符分割需要使用|分隔不同字符 "+Arrays.toString(spDollar));

        //截取字符String.substring()
        String str = "ABCDEFG";
        String save = str.substring(2);//从下标2开始截取【包括2】
        save += str.substring(0,2);//从下标0到下标2截取【不包括2】
        System.out.println("\n利用截取字符重新拼接ABCDEFG "+save);

        //去除空格String.trim()
        String str2 = " 1   1 4 5 6";
        System.out.println(" 1   1 4 5 6去除空格后:"+str2.trim());
    }
}