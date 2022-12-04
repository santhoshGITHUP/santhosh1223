package expectionBasic;import polyMophism2.Parents;

public class NumberFormatException {
  public static void main(String[] args) {
	String s1="23";
	int parseInt = Integer.parseInt(s1);
	System.out.println(parseInt);

	String s2="23.0";                     // don't not accept the float value condition
	System.out.println(Integer.parseInt(s2));
	int parseInt2 = Integer.parseInt(s2);
	System.out.println(parseInt2);
	
}
}
