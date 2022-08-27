package com.cydeo.yt_practice1;

interface MsgInterface{
    Text createMsg(String str);
}


public class Text {

    public Text(String str) {
        System.out.println("Message is " + str);
    }

    public static void main(String[] args) {

        //Method Ref --->>>>  reference to Constructor

        MsgInterface ref = (str -> new Text(str));
        ref.createMsg("Hello Java");

        MsgInterface ref2 = Text::new;
        ref.createMsg("HELLO WORLD");



    }


}
