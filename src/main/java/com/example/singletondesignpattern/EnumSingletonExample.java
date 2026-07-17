package com.example.singletondesignpattern;

 enum enumSin{
     INSTANCE;
     public void show(){
         System.out.println("eff");
     }

}
public class EnumSingletonExample {
    public static void main(String[] args) {
        enumSin obj = enumSin.INSTANCE;
        enumSin obj2 = enumSin.INSTANCE;

        if(obj == obj2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
