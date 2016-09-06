package com.liu.practice.NIODemo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月28日 上午9:48:56
 */
public class Test01 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("data/nio-data.txt", "rw");
		FileChannel inChannel = aFile.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(48);  // 分配48字节capacity的ByteBuffer

		int bytesRead = inChannel.read(buf);
		while (bytesRead != -1) {

			System.out.println("Read " + bytesRead);
			buf.flip(); // 将Buffer从写模式切换到读模式  调用flip()方法会将position设回0，并将limit设置成之前position的值。

			while (buf.hasRemaining()) {
				System.out.print((char) buf.get());
			}

			buf.clear(); // 这里有个类似的方法 compact（） 他俩的不同在于，clear 是将整个缓冲区清空，而 compact 是将读过的数据清空。compact()方法将所有未读的数据拷贝到Buffer起始处。然后将position设到最后一个未读元素正后面
			bytesRead = inChannel.read(buf);
		}
		aFile.close();

	}
	
	/*
	 * 一 使用Buffer读写数据一般遵循以下四个步骤：
	 * 
	 	1 写入数据到Buffer
		2 调用flip()方法
		3 从Buffer中读取数据
		4 调用clear()方法或者compact()方法
		
		
	 */
	/*
	 * 缓冲区(buffer)
	 * 本质上是一块可以写入数据，然后可以从中读取数据的内存。
	 * 这块内存被包装成NIO Buffer对象，并提供了一组方法，用来方便的访问该块内存。
	 */

}
