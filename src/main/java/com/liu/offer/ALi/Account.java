package com.liu.offer.ALi;

import java.math.BigDecimal;

public class Account{


    public BigDecimal getBalance(){
        // 去数据库查询余额然后返回
        return  new BigDecimal(0.1);
    }
    public void BalanceAdd(BigDecimal money){
        money.doubleValue();
        //  更新用户数据库中的余额，加上当前值
    }
    public void BalanceReduce(BigDecimal money){
        money.doubleValue();
        //  更新用户数据库中的余额，减去当前值
    }
}
