public class EjercicioArrayPrueba{
public static void main(String[] args){

System.out.println(ArrayConNumerosConsecutivos(3));


}
static int[] ArrayConNumerosConsecutivos (int totalNumeros) {
int[] r=new int[totalNumeros];
for (int i=0;i<totalNumeros;i++) r[i]=i;
return r;
}
}