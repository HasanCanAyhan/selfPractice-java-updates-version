
package com.cydeo.java13;

public class TextBlocksDemo {

    public static void main(String[] args) {


        var address = "7925 Jones Branch Drive \n " +
                "McLean, v 22102";

        System.out.println(address);

        System.out.println("----------------Text Blocks-------------------");

        var address2 = """
                
                7925 Jones Branch Drive
                McLean, v 22102
                
                """;


        System.out.println(address2);

    }

}
