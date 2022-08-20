package com.cydeo.lesson.flatMap_vs_Map;

public class FlatMap_vs_map {

    /*

    map() : takes Stream<T> as input and returns Stream<R>
    It is mapper function produces single value for each input value.It is called One-To-One mapping.

    flatMap() : takes Stream<Stream<T>> as an input and return Stream<R>.It is called One-To-Many mapping
    //           Stream of Stream

    Stream.of(1,2,3,4) -> returns Stream : [1,2,3,4] - map()

    [  [1,2], [3,4] , [5,6] , [7,8]  ] -> return Stream :  [1,2,3,4,5,6,7,8] - flatMap()

     */

}
