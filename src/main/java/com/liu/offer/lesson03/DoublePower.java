package com.liu.offer.lesson03;

/**
 * Created by 刘林林 on 2016/2/28.
 */
public class DoublePower {
    boolean g_InvalidInput = false;
    double Power(double base,int exponent){
        if (equal(base,0.0) && exponent <0){
            g_InvalidInput = false;
            return 0.0;
        }
        int absExponent =Math.abs(exponent);
        double result = PowerWithUnsignedExponent(base ,absExponent);
        if (exponent <0){
            result  = 1.0/result;
        }
        return  result;
    }

    private double PowerWithUnsignedExponent(double base, int absExponent) {
        double result = 1.0;
        for (int i = 1;i<=absExponent;++i){
            result *=base;
        }
        return  result;
    }

    boolean equal(double num1,double num2){
        if ((num1 - num2)>-0.000001&& (num1 - num2 <0.000001)){
            return true;
        }else {
            return  false;
        }
    }

    private double PowerWithUnsignedExponent_two(double base, int absExponent) {
        if (absExponent ==0 )
            return  1;
        if (absExponent ==1)
            return base;
        double result = PowerWithUnsignedExponent_two(base,absExponent>>1);
        result *= result;
        if((absExponent & 0x1) == 1)
            result *=base;
        return  result;
    }
}
