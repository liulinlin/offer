package com.liu.practice.jsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liu.practice.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by liulinlin on 2017/1/10.
 */
public class Main {
    public static void main(String[] args) {
//        String test = "{states:{rect1:{type:'start',text:{text:'开始'}, attr:{ x:384, y:10, width:101, height:50}, props:{text:{value:'开始'},temp1:{value:''},temp2:{value:''}}},rect2:{type:'task',text:{text:'任务1'}, attr:{ x:386, y:116, width:100, height:50}, props:{text:{value:'任务1'},temp1:{value:''},temp2:{value:''},assignee:{value:''},form:{value:''},desc:{value:''}}},rect3:{type:'fork',text:{text:'分支'}, attr:{ x:384, y:209, width:103, height:50}, props:{text:{value:'分支'},temp1:{value:''},temp2:{value:''}}},rect4:{type:'task',text:{text:'任务2'}, attr:{ x:192, y:317, width:100, height:50}, props:{text:{value:'任务2'},temp1:{value:''},temp2:{value:''},assignee:{value:''},form:{value:''},desc:{value:''}}},rect5:{type:'task',text:{text:'任务3'}, attr:{ x:385, y:317, width:100, height:50}, props:{text:{value:'任务3'},temp1:{value:''},temp2:{value:''},assignee:{value:''},form:{value:''},desc:{value:''}}},rect6:{type:'task',text:{text:'任务4'}, attr:{ x:556, y:320, width:100, height:50}, props:{text:{value:'任务4'},temp1:{value:''},temp2:{value:''},assignee:{value:''},form:{value:''},desc:{value:''}}},rect7:{type:'join',text:{text:'合并'}, attr:{ x:386, y:416, width:103, height:50}, props:{text:{value:'合并'},temp1:{value:''},temp2:{value:''}}},rect8:{type:'end',text:{text:'结束'}, attr:{ x:382, y:632, width:107, height:50}, props:{text:{value:'结束'},temp1:{value:''},temp2:{value:''}}},rect9:{type:'task',text:{text:'任务5'}, attr:{ x:384, y:528, width:100, height:50}, props:{text:{value:'任务5'},temp1:{value:''},temp2:{value:''},assignee:{value:''},form:{value:''},desc:{value:''}}}},paths:{path10:{from:'rect1',to:'rect2', dots:[],text:{text:'TO 任务1'},textPos:{x:37,y:-4}, props:{text:{value:''}}},path11:{from:'rect2',to:'rect3', dots:[],text:{text:'TO 分支'},textPos:{x:56,y:-1}, props:{text:{value:''}}},path12:{from:'rect3',to:'rect5', dots:[],text:{text:'TO 任务3'},textPos:{x:24,y:-5}, props:{text:{value:''}}},path13:{from:'rect5',to:'rect7', dots:[],text:{text:'TO 合并'},textPos:{x:41,y:8}, props:{text:{value:''}}},path14:{from:'rect7',to:'rect9', dots:[],text:{text:'TO 任务5'},textPos:{x:36,y:-5}, props:{text:{value:''}}},path15:{from:'rect9',to:'rect8', dots:[],text:{text:'TO 结束'},textPos:{x:32,y:0}, props:{text:{value:''}}},path16:{from:'rect3',to:'rect4', dots:[{x:244,y:232}],text:{text:'TO 任务2'},textPos:{x:0,y:-10}, props:{text:{value:'TO 任务2'}}},path17:{from:'rect4',to:'rect7', dots:[{x:242,y:435}],text:{text:'TO 合并'},textPos:{x:-3,y:17}, props:{text:{value:'TO 合并'}}},path18:{from:'rect3',to:'rect6', dots:[{x:607,y:234}],text:{text:'TO 任务4'},textPos:{x:0,y:-10}, props:{text:{value:'TO 任务4'}}},path19:{from:'rect6',to:'rect7', dots:[{x:607,y:439}],text:{text:'TO 合并'},textPos:{x:-8,y:16}, props:{text:{value:'TO 合并'}}}},props:{props:{name:{value:'新建流程'},key:{value:''},desc:{value:''}}}}";
//        JSONObject jsonObject = JSONHelper.getJSONObject(test);
//        JSONObject states = jsonObject.getJSONObject("states");
//        System.out.println("states size():"+states.size());
//        Set<String> keys = states.keySet();


        List<Person> all = new ArrayList<>();
        all.add(new Person("小明","小",1));
        all.add(new Person("大名","小",1));
        all.add(new Person("小李","小",1));
        all.add(new Person("小王","小",1));
        System.out.println(JSON.toJSONString(all));
    }
}
