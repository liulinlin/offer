package com.liu.practice.NIODemo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/** 
* @author: liulinlin1@jiuxian.com	
* @since：2016年7月28日 上午10:19:25 
*/
public class ScatteringAndGathering {

	public static void main(String[] args) throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("data/nio-data.txt", "rw");
		FileChannel inChannel = aFile.getChannel();
		
		// Scattering
		ByteBuffer headerScattering = ByteBuffer.allocate(128);
		ByteBuffer bodyScattering   = ByteBuffer.allocate(1024);
		ByteBuffer[] bufferArrayScattering = { headerScattering, bodyScattering };
		inChannel.read(bufferArrayScattering);
		
		// Gathering 
		ByteBuffer headerGathering = ByteBuffer.allocate(128);
		ByteBuffer bodyGathering   = ByteBuffer.allocate(1024);
		//write data into buffers
		ByteBuffer[] bufferArrayGathering = { headerGathering, bodyGathering };
		inChannel.write(bufferArrayGathering);
		 
	}

}
