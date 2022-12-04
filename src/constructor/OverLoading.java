package constructor;

public class OverLoading {
String draw;
int draw_size;

OverLoading(){
	System.out.println("draw ths diagram ");
	
}
OverLoading(String drawon){
	draw=drawon;
	//System.out.println(drawon);
	
}
OverLoading(String drawon,int size){
	draw=drawon;
	draw_size=size;
	//System.out.println(drawon);
	
}
 private void drawDetails() {
	System.out.println(" ok i will drawn the "+draw +" "+ "shape"+" +and this size is: "+draw_size);

}
 public static void main(String[] args) {
	 OverLoading c= new OverLoading();
	 OverLoading c1= new OverLoading("square");
	 OverLoading c2= new OverLoading("circule");
	 OverLoading c5 = new OverLoading("rectangle", 55);
	 c5.drawDetails();
	 c1.drawDetails();
	 c2.drawDetails();
	 
	 
}
}
