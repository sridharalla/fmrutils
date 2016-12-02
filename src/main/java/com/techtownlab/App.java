package com.techtownlab;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Utils utils = new Utils();
        utils.setProductName("myproduct");

        System.out.println(utils.getProductName());
    }
}
