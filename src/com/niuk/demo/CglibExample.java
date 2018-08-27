package com.niuk.demo;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**    
* @author zk  
* @date 2018年8月15日  
* CGLIB动态代理
*/      

class Ship {
    public void travel(){
        System.out.println("轮船正在行驶");
    }
}
public class CglibExample implements MethodInterceptor{
       
	   public Object getProxy(Class c) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(c);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	@Override
	public Object intercept(Object obj, Method m, Object[] objs, MethodProxy proxy) throws Throwable {
		System.out.println("日志开始");
		Object result = proxy.invokeSuper(obj, objs);
		System.out.println("日志结束");
		return result;
	}
	public static void main(String[] args) {
		CglibExample cglibExample = new CglibExample();
		Ship ship = (Ship) cglibExample.getProxy(Ship.class);
		ship.travel();
	}
}
