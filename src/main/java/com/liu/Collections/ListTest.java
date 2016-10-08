package com.liu.Collections;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by liulinlin1 on 2016/9/6.
 */
public class ListTest {
    public static void main(String[] args) {

    }

    public static void mainOperation(){
        String[] vowelarray = {"a", "e", "i", "o", "u"};

        List<String> vowelsList = Arrays.asList(vowelarray);
        System.out.println(vowelsList);

        /**
         * List is backed by array, we can't do structural modification
         * Both of the below statements will throw java.lang.UnsupportedOperationException
         *///vowelsList.remove("e");//vowelsList.clear();//using for loop to copy elements from array to list, safe for modification of list
        List<String> myList = new ArrayList<>();
        for (String s : vowelarray) {
            myList.add(s);
        }
        System.out.println(myList);
        myList.clear();

        List<Integer> ints = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) ints.add(random.nextInt(1000));

        //natural sorting using Collections class
        Collections.sort(ints);
        System.out.println("Natural Sorting: " + ints);

        //My custom sorting, reverse order
        ints.sort((o1, o2) -> {
            return (o2 - o1);
        });
        System.out.println("Reverse Sorting: " + ints);

        List<String> vowels = new ArrayList<String>();

        //add example
        vowels.add("A");
        vowels.add("I");

        //let's insert E between A and I
        vowels.add(1, "E");
        System.out.println(vowels);

        List<String> listtolist = new ArrayList<String>();
        listtolist.add("O");
        listtolist.add("U");

        //appending list elements to letters
        vowels.addAll(listtolist);
        System.out.println(vowels);

        //clear example to empty the listlist.clear();

        //size example
        System.out.println("letters list size = " + vowels.size());

        //set example
        vowels.set(2, "E");
        System.out.println(vowels);

        //subList example
        vowels.clear();
        vowels.add("E");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        listtolist = vowels.subList(0, 2);
        System.out.println("letters = " + vowels + ", list = " + listtolist);
        vowels.set(0, "A");
        System.out.println("letters = " + vowels + ", list = " + listtolist);
        listtolist.add("U");
        System.out.println("letters = " + vowels + ", list = " + listtolist);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) list.add(i);

        Iterator<Integer> iterator = list.iterator();

        //simple iteration
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            System.out.print(i + ", ");
        }
        System.out.println("\n" + list);
        //modification of list using iterator
        iterator = list.iterator();
        while(iterator.hasNext()){
            int x = (int) iterator.next();
            if(x%2 ==0) iterator.remove();
        }
        System.out.println(list);

        //changing list structure while iterating
        iterator = list.iterator();
        while(iterator.hasNext()){
            int x = (int) iterator.next(); //ConcurrentModificationException hereif(x==1) list.add(10);
        }
    }

    public static void splitTest(){
        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("b");
        input.add("#");
        input.add("c");
        input.add("#");
        input.add("d");
        input.add("e");
        input.add("#");
        input.add("f");
        List<List<String>> data = split(input,i->i.equals("#"));
        System.out.println(data);
    }

    public static <T> List<List<T>> split(List<T> input , Predicate<T> predicate){
        int[] edges = IntStream.range(-1,input.size()+1).filter(i->i==-1||i==input.size()||predicate.test(input.get(i))).toArray();
        System.out.println(Arrays.toString(edges));
        return IntStream.range(0,edges.length-1).mapToObj(k->input.subList(edges[k]+1,edges[k+1])).collect(Collectors.toList());
    }

    public static void test(){
        String [] tt = {"1","2","3","4","5","6"};
        List<String> test = Arrays.asList(tt) ;
        System.out.println(test.subList(0,6));
    }
}
