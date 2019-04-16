package com.wf.util.ListToMap;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: wangfa
 * @Date: 2019/4/16 16:41
 * @Description:
 */
public class DemoMain {



    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"张三",11,"男"));
        studentList.add(new Student(2,"李四",12,"女"));
        studentList.add(new Student(3,"王五",13,"男"));
        // 利用java8特性  Map<Long, User> maps = userList.stream().collect(Collectors.toMap(User::getId,Function.identity())); key1,key2,表示key值一样时，进行覆盖
        Map<Integer, Student> mapStu = studentList.stream().collect(Collectors.toMap(Student::getId, Function.identity(), (key1, key2) -> key2));
        Map<Integer,Integer> mapStr = studentList.stream().collect(Collectors.toMap(Student::getId,Student::getAge,(key1,key2)->key2)) ;
        showMap(mapStu);
        showMap(mapStr);

        // 利用Google的guava
        ImmutableMap<Integer, Student> maps = Maps.uniqueIndex(studentList, new com.google.common.base.Function<Student, Integer>() {
            @Override
            public Integer apply(@Nullable Student student) {
                return student.getId();
            }
        });
        showMap(maps);


        // 利用工具类
        Map<Integer, Student> studentMap = ListToMapUtil.listtomapByProperty(studentList,"id");
        System.out.println("====工具类获取对象Map");
        showMap(studentMap);

        Map<Integer,String> stringMap = ListToMapUtil.listtomapByProperty(studentList,"id","name");
        System.out.println("====工具类获取属性Map");
        showMap(stringMap);
    }

    private static <K,V> void showMap(Map<K, V> maps) {
        Set<Map.Entry<K, V>> entries = maps.entrySet();
        Iterator<Map.Entry<K, V>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<K, V> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
    }
}
