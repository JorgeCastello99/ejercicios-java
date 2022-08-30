public class ClaseGenerica3 <T,T1>{

private T pr;
private T1 se;

public ClaseGenerica3(T pr,T1 se){
this.pr=pr;
this.se=se;


}


protected T getA(){
	return pr;
}

protected T1 getB(){
	return se;
}

}