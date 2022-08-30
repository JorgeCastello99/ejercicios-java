import java.util.regex.*;
public class Ejercicioprueba{
public static void main(String[] args){

Pattern p=Pattern.compile("[01]+");
Matcher m=p.matcher("00001010");

if (m.matches()) System.out.println("Si, contiene el patron");
else System.out.println("No, no contiene el patron");




}


}
}