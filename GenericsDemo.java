package homewrk;

public class GenericsDemo {

	public static void main(String[] args) {
		Paint paint = new RedPaint();
		GoodPaintBrush brush=new GoodPaintBrush();
		
		brush.paint=paint;
		brush.dopaint();
		BadPaintBrush bpb=new BadPaintBrush();
		bpb.dopaint(1);

	}

}
abstract class Paint{
	
}
class RedPaint extends Paint{
}
class BluePaint extends Paint{
	
}
class GoodPaintBrush{
	Paint paint;
	public void dopaint() {
		System.out.println(paint);
	}
}
class BadPaintBrush{
	public void dopaint(int i) {
		if(i==1) {
			RedPaint rp=new RedPaint();
			System.out.println("redpaint....."+rp);
		}
		else if(i==2) {
			BluePaint bp=new BluePaint();
			System.out.println("bluepaint...."+bp);
		}
	}
}