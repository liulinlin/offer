package com.liu.ConsumerAndProduction;

import com.liu.ConsumerAndProduction.pattern1.Storage;

/** 
* @author: liulinlin1@jiuxian.com	
* @since：2016年8月31日 上午9:27:08 
* 
* 消费者类Consumer继承线程类Thread 
*/
public class Consumer extends Thread{
	 // 每次消费的产品数量  
    private int num;  
  
    // 所在放置的仓库  
    private Storage storage;  
  
    // 构造函数，设置仓库  
    public Consumer(Storage storage)  
    {  
        this.storage = storage;  
    }  
  
    // 线程run函数  
    public void run()  
    {  
        consume(num);  
    }  
  
    // 调用仓库Storage的生产函数  
    public void consume(int num)  
    {  
        storage.consume(num);  
    }  
  
    // get/set方法  
    public int getNum()  
    {  
        return num;  
    }  
  
    public void setNum(int num)  
    {  
        this.num = num;  
    }  
  
    public Storage getStorage()  
    {  
        return storage;  
    }  
  
    public void setStorage(Storage storage)  
    {  
        this.storage = storage;  
    } 
}
