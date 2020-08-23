package com.reactlibrary;

public class JavaToC {

    public native String helloC();

    static {
        System.loadLibrary("Hello");
    }

    public static void main(String[] args) {
      JavaToC sample = new JavaToC();
      String  text   = sample.helloC();

      System.out.println("" + text);

    }
}
