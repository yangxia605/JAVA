package java_basic.basic.methods;

/**
 *  写一个求两个整数的和的方法sum
 *  写一个比较两个整数是否相同的方法compare
 */
public class MethodDemo {
    public static void main(String[] args){
        int a = 10;
        int b = 10;
//        int c = 0;
//        c = sum(a,b);
//        System.out.println(c);
        System.out.println(compare(a,b));
    }

    //对两个整数求和
    public static int sum(int a, int b){
        return  a+b;
    }

    //比较两个整数是否相同
    public static boolean compare(int a, int b){
        return a == b;
    }
    /**
     *方法重载：比较两个数是否相同
     * 需求：分别比较两个int/long/double类型的数是否相同
     * 分析：要定义三个方法分别定义
     */
    public static boolean compareNum(int a, int b){
        System.out.println("比较int型整数");
        return a == b;
    }

    public static boolean compareNum(long a, long b){
        System.out.println("比较long型整数");
        return a == b;
    }

    public static boolean compareNum(double a, double b){
        System.out.println("比较double型整数");
        return a == b;
    }

}

