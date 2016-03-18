package com.liu.pattern.template;

/**
 * Created by 刘林林 on 2016/3/12.
 */
public abstract class AbstractTemplate {
    /**
     * 模板方法
     *
     * 子类可以置换掉父类的可变部分，但是子类却不可以改变模板方法所代表的顶级逻辑。
     */

    /**
     * 基本方法的声明（由子类实现）
     */
    protected abstract void sortArray(int[] array);

    /**
     * 基本方法(空方法)
     */
    public void ShowArray(int[] array) {
        this.sortArray(array);
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}
