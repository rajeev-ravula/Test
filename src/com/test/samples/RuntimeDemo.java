package com.test.samples;

public class RuntimeDemo{  
 public static void main(String args[])throws Exception{  
  Runtime.getRuntime().exec("shutdown -r -t 0");  
 }  
}  