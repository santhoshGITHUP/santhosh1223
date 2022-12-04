package string;

public class Examble {
  public static void main(String[] args) {
	String spiltThis="am,i,teaching,Good";
	String[] split = spiltThis.split(",");
	for(String a:split) {
		System.out.println(a);
	}
	
}
}
