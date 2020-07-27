package java_basic.basic.objectoriented;

/**
 * 定义手机类
 * 类名：Phone
 * 成员变量：String brand 品牌；String model 型号；String name 名称
 * 成员方法：去掉 static修饰符 call()  打电话；sendMessage（） 发短信//
 * 使用：
 */

public class Phone {
    //成员变量
    String name;
    String model;
    String brand;

    //成员方法
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage(){

    }

    public void playGame(){

    }

}
