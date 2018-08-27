package com.niuk.demo;

/**    
* @author zk  
* @date 2018年8月20日  
*/

interface Fruit {
    public abstract void eat();
}
class Apple implements Fruit {
   public void eat(){
       System.out.println("Apple");
   }
}
class Orange implements Fruit {
   public void eat(){
       System.out.println("Orange");
   }
}
class Factory {
   public static Fruit getInstance(String ClassName) {
       Fruit f=null;
       try {
           f=(Fruit)Class.forName(ClassName).newInstance();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return f;
   }
}
public class Client {
       public static void main(String[] args) {
		
    	   Fruit f=Factory.getInstance("com.niuk.demo.Apple");
           if(f!=null){
               f.eat();
           }
	}
}
