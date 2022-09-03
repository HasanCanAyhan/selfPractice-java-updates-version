package com.cydeo.lesson.constructor4Parameters;

public interface CarConstructor<T,V,K,E,R> {

    R createCar(T t, V v, K k,E e);
}
