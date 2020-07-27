package java_basic.basic.array;

public class ArrayDemo {
    public static void main(String[] args){
        /**
         * 练习数组的三种定义格式
         */

        int[] arr1 = new int[3]; //不知道具体的数字
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = {1,2,3};

        int[] a = {1,2,4,9,7,20};
        System.out.println(findMax(a));
    }

    /**
     * 需求：找出数组中最大的值
     */
    public  static int findMax(int[] a){
        int temp = a[0]; //临时变量的值不能随意写
        for(int i = 0;i<a.length;i++){
            if(a[i] > temp){
                temp = a[i];
            }
        }
        return temp;

    }
}
