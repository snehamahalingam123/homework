package hit.day6;


public class GenericsDemo1 {
	 public static void main(String[] args) {
			Paint paint= new RedPaint();
			Powder powder = new RosePowder();
			
			GoodPaintBrush<Paint> brush=new GoodPaintBrush<>();
			brush.setObj(paint);
			
			Paint mypaint = brush.getobj();
			mypaint.color();
			
			GoodPaintBrush<Powder> brush2=new GoodPaintBrush<>();
			brush2.setObj(new RosePowder());
			
			Powder mypowder =brush2.getobj();
			mypowder.doMakeup();
			

		}

	}
	abstract class paint{
		public abstract void color();
		
	}
	class RedPaint extends Paint{
		

	public void color() {
		System.out.println("red color......");
	}
	}
	class BluePaint extends paint{
		public void color() {
			System.out.println("blue color....");
		}
	}
	abstract class Powder{
		public abstract void  doMakeup();
		
	}
	class WhitePowder extends Powder{
		public  void doMakeup() {
			System.out.println("applying powder...");
		}
	}
	class RosePowder extends Powder{
		public void doMakeup() {
			System.out.println("rose powder applied...");
		}
	}
	class GoodPaintBrush<T>{
		T obj;
		public void  setObj(T obj) {
			this.obj=obj;
		
			}
		public T getobj(){
			return this.obj;
		}
	}
	class BadPaintBrush3{
		Object obj;
		public void execute() {
			if(obj instanceof Paint) {
				Paint paint =(Paint)obj;
				paint.color();
				
			}
			if( obj instanceof Powder) {
				Powder makeup=(Powder)obj;
				makeup.doMakeup();
			}
		}
	}
	class BadPaintBrush2{
		Paint paint;
		public void doPaint() {
			System.out.println(paint);
		}
	}
	class BadPaintBrush{
		public void doPaint(int i) {
			if(i==1) {
				RedPaint rp= new RedPaint();
				System.out.println("red paint..."+rp);
			}
		
		else if(i==2) {
			BluePaint bp= new BluePaint();
			System.out.println("blue paint..."+bp);
			
		}
	}
	}


