package com.cydeo.yt_practice2;


interface Addable{
    int addition(int a, int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return a + b;
    }
}


public class LambdaParameters {

    public static void main(String[] args) {

        Addable addableLambda = (a , b) -> (a + b);
        int result = addableLambda.addition(10,20);
        System.out.println(result);




    }


}
