package com.ss.up.utils;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

import java.util.List;

/**
 * Orika转换工具类
 * @author ss
 */
public class OrikaUtil {
    private static final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    public static <A, B> ClassMapBuilder<A, B> classMap(Class<A> source, Class<B> target) {
        return mapperFactory.classMap(source, target);
    }

    public static <T> T convert(Object source, Class<T> target) {
        return mapperFactory.getMapperFacade().map(source, target);
    }

    public static <S, D> List<D> convertList(Iterable<S> source, Class<D> target) {
        return mapperFactory.getMapperFacade().mapAsList(source, target);
    }

    public static MapperFactory getMapperFactory() {
        return mapperFactory;
    }
}
