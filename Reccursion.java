import java.lang.*;
public class Reccursion{
public int fun(int i);
public static void main(string args[]){
fun(0);
}
int fun(int i){
if (i<10)
System.out.println(i);
return(i++);

}