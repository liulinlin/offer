package com.liu.offer._360._20160910;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String data = in.next();
            String first = in.next();
            String second = in.next();

            boolean forward = false,backward=false;
            int firstIndex,secondIndex;
            char [] chardata = data.toCharArray();
            for (int i = 0; i < chardata.length; i++) {
                if (!forward && chardata[i] == first.charAt(0)){
                    int j = i;
                    forward = true;
                    for (int k = 0; k < first.length(); k++) {
                        if (chardata[j++] != first.charAt(k)){
                            forward = false;
                            break;
                        }
                    }
                    if (forward){
                        firstIndex = i;
                    }
                }
            }
        }
    }
}
