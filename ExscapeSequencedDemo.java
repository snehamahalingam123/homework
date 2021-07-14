package homewrk;

public class ExscapeSequencedDemo {

	public static void main(String[] args) {
		System.out.println("jack and jill went\"up\" the hill");
		System.out.println("jack and jill went\'up\' the hill");
		System.out.println("jack and jill went\\up\\ the hill" );
		System.out.println("jack and jill went\n up \n the hill");
		System.out.println("jack and jill went \f up \f the hill");
		System.out.println("hello\b\b\b\b a");
		int i=1;
		while(true) {
			i++;
			if(i<1000000) {
				System.out.println(i+"\r");
				try {Thread.sleep(100);}
				catch(Exception e) {}
			}
		}

	}

}
