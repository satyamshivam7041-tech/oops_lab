class Robort{
void work (){
System.out.println("robort is working");
}}
class Helperrobort extends Robort{
void work(){
System.out.println("Helperrobort is working");
}}
class Main{
public static void main(String[]args){
Robort r1 = new Helperrobort();
r1.work();
}}