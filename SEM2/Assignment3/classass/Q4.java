package classass;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        Box<String> obj1 = new Box<>("Hello World");
        Box<String> var11 = obj1;
        Box<String> var12 = obj1;
        System.out.println("Var11 :" + var11.getValue());
        System.out.println("Var12 :" + var12.getValue());
        System.out.println("After change ---");
        var11.setValue("Hi");
        System.out.println("Var11 :" + var11.getValue());
        System.out.println("Var12 :" + var12.getValue());

        Box<Integer> obj2 = new Box<>(246);
        Box<Integer> var21 = obj2;
        Box<Integer> var22 = obj2;
        System.out.println("Var21 :" + var21.getValue());
        System.out.println("Var22 :" + var22.getValue());
        System.out.println("After change ---");
        var21.setValue(183);
        System.out.println("Var21 :" + var21.getValue());
        System.out.println("Var22 :" + var22.getValue());

        Box<Object> obj3 = new Box<>(new int[]{2,5,6});
        Box<Object> var31 = obj3;
        Box<Object> var32 = obj3;
        System.out.println("Var31 :" + var31.getValue());
        System.out.println("Var32 :" + var32.getValue());
        System.out.println("After change ---");
        var31.setValue(new int[]{1,8,9,6});
        System.out.println("Var31 :" + var31.getValue());
        System.out.println("Var32 :" + var32.getValue());
    }
}
class Box<T>{
    T name;
    Box(T name){
        this.name = name;
    }
    void setValue(T name){
        this.name = name;
    }
    T getValue(){
        return name;
    }

}
