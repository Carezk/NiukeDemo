package com.Socket.Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author zk
 * @date 2018年9月11日
 */
public class TCPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("TCP服务端接受数据");
		ServerSocket serverSocket = new ServerSocket(10003);
		Socket socket = serverSocket.accept();
		/*
		 * String ip = socket.getInetAddress().getHostAddress(); System.out.println(ip);
		 */
		try {
			
			while (true) {
				InputStream inputStream = socket.getInputStream();
				byte bytes[] = new byte[1024];
				int len = inputStream.read(bytes);
				String str = new String(bytes, 0, len);
				System.out.println("客户端内容:" + str);
				OutputStream outputStream = socket.getOutputStream();
				Scanner scanner = new Scanner(System.in);
				System.out.println("给客户端回复内容:");
				String strNext = scanner.next();
				outputStream.write(strNext.getBytes());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			socket.close();
			serverSocket.close();
		}
	}
}
