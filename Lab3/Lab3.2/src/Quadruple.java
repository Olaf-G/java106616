
public class Quadruple <T, U, V, L> 
{
	  	private  T first;
	    private  U second;
	    private  V third;
	    private  L fourth;

	    public Quadruple(T first, U second, V third, L fourth) {
	        this.first = first;
	        this.second = second;
	        this.third = third;
	        this.fourth = fourth;
	    }

	    public void setFirst(T first) {  this.first = first; }
	    public T getFirst() { return first; }
	    public void setSecond(U second) { this.second = second; }
	    public U getSecond() { return second; }
	    public void setThird(V third) { this.third = third; }
	    public V getThird() { return third; }
	    public void setFourth(L fourth) { this.fourth = fourth; }
	    public L getFourth() { return fourth; }
	    
	    
	    public static void main(String[] args)
	    {
	    	Quadruple test = new Quadruple("Jeden", 1, false, 1.);
	    	System.out.println(test.getFirst());
	    	System.out.println(test.getSecond());
	    	System.out.println(test.getThird());
	    	System.out.println(test.getFourth());
	    }
}



