package com.wf.util.ListToMap;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangfa
 * @Date: 2019/4/16 16:19
 * @Description:
 */
public abstract class ListToMapUtil {


    /**
     *
     * @Author: wangfa
     * @Date: 2019/4/16 下午6:02
     * @Description: 属性为key。对象为value的list->map
     */
    public  static <K,V> Map<K, V> listtomapByProperty(List<V> lists,String keyProperty){
        Map<K,V> result = new HashMap<>();
        if(lists != null && lists.size() > 0 && keyProperty != null && !"".equals(keyProperty)){
            String getter = "get"+keyProperty.substring(0,1).toUpperCase()+keyProperty.substring(1);
            try {
                for(V v : lists){
                    Method method = v.getClass().getMethod(getter,null);
                    K key = (K) method.invoke(v,null);
                    if(key != null){
                        result.put(key,v);
                    }
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


    public  static <K,V,T> Map<K, T> listtomapByProperty(List<V> lists,String keyProperty,String valueProperty){
        Map<K,T> result = new HashMap<>();
        if(lists != null && lists.size() > 0 && keyProperty != null && !"".equals(keyProperty) &&  valueProperty != null && !"".equals(valueProperty) ){
            String getterKeyProperty = "get"+keyProperty.substring(0,1).toUpperCase()+keyProperty.substring(1);
            String getterValueProperty = "get"+valueProperty.substring(0,1).toUpperCase()+valueProperty.substring(1);
            try {
                for(V v : lists){
                    Method keyMethod = v.getClass().getMethod(getterKeyProperty,null);
                    Method valueMethod = v.getClass().getMethod(getterValueProperty,null);
                    K key = (K) keyMethod.invoke(v,null);
                    T value = (T) valueMethod.invoke(v,null);
                    if(key != null && value!=null){
                        result.put(key,value);
                    }
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


}
