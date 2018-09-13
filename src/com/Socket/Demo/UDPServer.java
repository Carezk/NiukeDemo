package com.Socket.Demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**    
* @author zk  
* @date 2018年9月11日  
*/
public class UDPServer {

	public static void main(String[] args) throws IOException {
           System.out.println("UDP接受数据启动....");
		   DatagramSocket datagramSocket = new DatagramSocket(9999);
		   byte buf[] = new byte[1024];
		   DatagramPacket dp = new DatagramPacket(buf,buf.length);
		   datagramSocket.receive(dp);
		   String ip = dp.getAddress().getHostAddress();
		   int port = dp.getPort();
		   String str = new String(dp.getData(), 0, dp.getLength());
		   System.out.println(ip+"------port:"+port+"-------str:"+str);
		  
	}
}
