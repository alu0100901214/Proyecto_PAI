package Hello_package;

public class HelloWorld {
	int x = 0;
	private int z= 0;
	protected int w = 0;
	public int y = 0;
	public static void main(String args[]){
		System.out.println("Hello World!");
		int a = 1;
		int b = 2;
		int c = 0;
		c = a+b;
		System.out.println(c);
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
