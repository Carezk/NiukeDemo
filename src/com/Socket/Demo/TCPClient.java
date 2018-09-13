package com.Socket.Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author zk
 * @date 2018年9月11日
 */
public class TCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("TCP客户端发送数据");
		Socket socket = new Socket("192.168.75.38", 10003);
		try {
			while (true) {
				OutputStream outputStream = socket.getOutputStream();
				Scanner sc = new Scanner(System.in);
				System.out.println("给服务端发送内容:");
				String strNext = sc.next();
				outputStream.write(strNext.getBytes());
				InputStream inputStream = socket.getInputStream();
				byte bytes[] = new byte[1024];
				int len = inputStream.read(bytes);
				String str = new String(bytes, 0, len);
				System.out.println("服务端回复内容:" + str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			socket.close();
		}

	}

}
