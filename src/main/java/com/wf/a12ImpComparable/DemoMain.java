package com.wf.a12ImpComparable;

/**
 * @Author: wangfa
 * @Date: 2018/11/15 20:00
 * @Description: 考虑实现Comparable接口
 */
public class DemoMain {

    /**
     * Comparable 接口 中的compareTo方法，不但允许进行简单的同等性比较，而且还允许执行顺序比较，它与Object的equals方法具有相似的特征，她还是一个泛型。
     *
     * 类实现了Comparable接口的话，就说明他的实例具有内在的排序关系。为实现Comparable接口的对象数组进行排序，利用Arrays.sort(a);
     *
     * 实现了Comparable接口的对象，在集合中进行搜索，计算极限值以及自动维护也很简单。
     *
     * java所有的值类，都实现了Comparable接口，对于自己编写的值类，如果有很明显的内在排序关系(按照字母，数字，年代等)，那么久可以实现Comparable接口。
     *
     *
     *
     * ComparableTo方法的通用约定：
     *
     * 1. 将对象与指定的对象进行比较时，当该对象小于，等于或者大于指定对象的时候，分别返回一个负整数，零，或者整数。如果无法进行比较，则抛出ClassCaseException
     *
     * 2. 必须保证比较的可传递性，x.compareTo(y)>0 && y.compareTo(z)>0 则x.compareTo(z)>0
     *
     * 3. 在比较时被认为相同的所有对象，他们跟别的对象做比较时一定会产生相同的结果， x.compareTo(y) == 0 则 x.compareTo(z) == y.compareTo(z)
     */
}