package com.Socket.Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**    
* @author zk  
* @date 2018年9月11日  
*/
public class udpClient {
       public static void main(String[] args) throws SocketException {
    	   
		System.out.println("UDP客户端启动成功.....");
		DatagramSocket datagramSocket = new DatagramSocket();
		String str = "注意啦，UDP发送数据来啦...";
		byte bytes[] = str.getBytes();
		try {
			InetAddress serverIPAddres = InetAddress.getByName("192.168.75.38");
			DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, serverIPAddres, 9999);
			datagramSocket.send(datagramPacket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			datagramSocket.close();
		}
	}
}
