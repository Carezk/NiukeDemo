package com.niuk.demo;

public class Equals extends HelloA 
{
 public Equals()
 {
 }
 
 {
     System.out.println("I¡¯m B class");
 }
 static
 {
     System.out.println("static B");
 }
 public static void main(String[] args)
 {
     new Equals();
 }
}
class HelloA
{
 public HelloA()
 {
 }
 {
     System.out.println("I¡¯m A class");
 }
 static
 {
     System.out.println("static A");
 }
}