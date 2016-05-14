package com.liu.offer.ALi;

import java.math.BigDecimal;

public class Main2 {

    public boolean Transfer(Account Target,Account Outer,BigDecimal Money){
        if(Outer.getBalance().compareTo(Money)<0)
            return false;
        Target.BalanceAdd(Money);
        Outer.BalanceReduce(Money);
        return true;
    }
}
