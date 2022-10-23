package com.wang.utils;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class BeanCopyUtils {
    private  BeanCopyUtils() {}

    public static <V> V copyBean(Object source,Class<V> claxx) {

        V result = null;
        try {
            result = claxx.newInstance();
            BeanUtils.copyProperties(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


    public static <T,V> List<V> copyBeanList(List<T> source, Class<V> claxx) {

        return source.stream()
                .map(o -> copyBean(o, claxx))
                .collect(Collectors.toList());


    }



}
