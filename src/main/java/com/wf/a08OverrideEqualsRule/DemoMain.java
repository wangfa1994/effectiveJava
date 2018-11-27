package com.wf.a08OverrideEqualsRule;

import com.wf.a08OverrideEqualsRule.transitivity.Color;
import com.wf.a08OverrideEqualsRule.transitivity.ColorPoint;
import com.wf.a08OverrideEqualsRule.transitivity.Person;
import com.wf.a08OverrideEqualsRule.transitivity.Point;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author: wangfa
 * @Date: 2018/11/12 16:56
 * @Description: 覆盖euqals方法请遵守通用规则
 */
public class DemoMain {

    public static void main(String[] args) {

        //checkSymmetry();

        //checkTransitivity();

        normal();
    }



    /**
     *
     * @Author: wangfa
     * @Date: 2018/11/12 下午6:46
     * @Description:  对称性测试
     */
    public static void checkSymmetry(){

        // 有问题测试
        Symmetry cis = new Symmetry("Polish");
        String s ="polish";
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
        /**
         * Symmetry 的equals知道区分大小，而对于String的equals 则不知道要区分大小，所以会导致违反对称性
         */


        // 修正测试
        Symmetry cisCopy = new Symmetry("Polish");
        System.out.println(cis.equals(cisCopy));
        System.out.println(cisCopy.equals(cis));

    }


    /**
     *
     * @Author: wangfa
     * @Date: 2018/11/12 下午6:47
     * @Description:  传递性测试
     */
    public static void checkTransitivity(){

        Point point = new Point(1,2);
        ColorPoint colorPoint = new ColorPoint(1,2,Color.RED);
        System.out.println(point.equals(colorPoint));
        System.out.println(colorPoint.equals(point));

    }




    //  技巧测试
    public static void normal(){

        Person person1 = new Person.Builder().name("tom").age(12).build();
        Person person2 = new Person.Builder().name("tom").age(12).build();
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }



    // TimeStamp 和 date 对于equals的实现 违反了对称性










    /**
     * 1.类的每一个实例本质上都是唯一的
     * 2.不关心是否提供了逻辑相等的测试功能
     * 3.超类已经覆盖了equals，从超类继承过来的行为对于子类也会合适的
     * 4.类是私有的或者是包级私有的，可以确定他的equals方法永远不被调用
     *
     *
     *
     * 覆盖equals通用约定
     * 自反性，对象必须等于其自身
     *
     * 对称性，任何两个对象对于"他们是否相等"的问题都必须保持一致
     * 传递性，一个对象等于第二个对象并且第二个对象等于第三个对象，则第一个对象一定等于第三个对象
     * 一致性  对于任何非null的引用值x和y，只要在equals的比较操作在对象中所有的信息没有被修改，多次调用x.equals(y)就会一致返回false或者true
     *
     * 非空性，对于任何非null的引用值x，x.equals(null) 必须返回false
     *
     *
     * 实现高质量的equals方法技巧 (可以直接利用idea自动重写equals方法 )
     * 1.使用==操作符检查"参数是否为这个对象的引用"，是返回true，记得这个只是一种性能优化。(自身equals)
     * 2.使用 instanceof 操作符检查"参数是否为正确的类型"，不是返回false，一般情况下，正确的类型是指equals方法所在的那个类，有些情况是指类所实现的某个接口
     * 3.把参数转换成正确的类型，因为在转换之前进行instanceof检验，所以会确保成功
     * 4.对于类中关键的字段域进行检查参数中的域是否与改对象中对应的域相匹配。
     *
     * 在 类中关键的字段域进行检查 时
     *      如果是基本类型 用==
     *      如果是float 用 Float.compare
     *      如果是double 用 Double.compare
     *      对于Float 或者是double域有必要进行特殊的处理 因为存在着Float.NaN -0.0f 以及 double 常量
     *      对于数组域，需要将不同的原则应用在每一个元素上面，如果所有的元素都很重要，则可以利用Arrays.equals方法
     *      对于对象引用域，注意null可能是合法的，(field == o.field ||(o.field == null && field.equals(o.field)))
     *
     *
     * 覆盖equals时 总要覆盖hashCode  Objects类的使用
     *
     */

}
