import java.util.regex.*;
public class ValidaFecha{
public static void main(String[] args){

Pattern valida=Pattern.compile("([0-9]|[1-2][0-9]|3[0-1])/(ene|feb|mar|abr|may|jun|jul|ago|sep|oct|nov|dic)/([1-9]|[1-9][0-9]|[1-9][0-9][0-9]|[1][0-9][0-9][0-9]|20[0-1][0-9])");
Matcher m=valida.matcher("9/dic/2019");
Matcher r=valida.matcher("25/ene/2018");
Matcher f=valida.matcher("1/oct/1999");

Matcher g=valida.matcher("1/octubre/1999");
Matcher h=valida.matcher("-1/oct/1999");
Matcher i=valida.matcher("1/oct/19998");

if (m.matches()) System.out.println("Si, contiene el patron");
else System.out.println("No, no contiene el patron");

if (r.matches()) System.out.println("Si, contiene el patron");
else System.out.println("No, no contiene el patron");
if (f.matches()) System.out.println("Si, contiene el patron");
else System.out.println("No, no contiene el patron");

if (g.matches()) System.out.println("Si, contiene el patron");
else System.out.println("No, no contiene el patron");
if (h.matches()) System.out.println("Si, contiene el patron");
else System.out.println("No, no contiene el patron");
if (i.matches()) System.out.println("Si, contiene el patron");
else System.out.println("No, no contiene el patron");
}
}