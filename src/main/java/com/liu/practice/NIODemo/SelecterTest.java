package com.liu.practice.NIODemo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月28日 上午10:37:43
 */
public class SelecterTest {

	public static void main(String[] args) throws IOException {
		SocketChannel channel = SocketChannel.open();
		Selector selector = Selector.open();
		channel.configureBlocking(false);
		SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
		while (true) {
			int readyChannels = selector.select();
			if (readyChannels == 0)
				continue;
			Set selectedKeys = selector.selectedKeys();
			Iterator keyIterator = selectedKeys.iterator();
			while (keyIterator.hasNext()) {
				SelectionKey key1 = (SelectionKey) keyIterator.next();
				if (key1.isAcceptable()) {
					// a connection was accepted by a ServerSocketChannel.
				} else if (key1.isConnectable()) {
					// a connection was established with a remote server.
				} else if (key1.isReadable()) {
					// a channel is ready for reading
				} else if (key1.isWritable()) {
					// a channel is ready for writing
				}
				keyIterator.remove();
			}
		}
	}

}
