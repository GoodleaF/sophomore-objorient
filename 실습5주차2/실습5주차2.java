package �ǽ�5����2;

class Shape{
	public void Shape() {
		// TODO Auto-generated method stub
		System.out.println("Shape=>");
	}
	
}
class Triangle extends Shape {
	public void Shape() {
		super.Shape();
		System.out.println("Triangle");
	}	
}
class Rectangle extends Shape{
	public void Shape() {
		super.Shape();
		System.out.println("Rectangle");
	}	
}
class Simplex extends Shape{
	public void Shape() {
		super.Shape();
		System.out.println("Simplex=>");
	}
}
class Tetrahedron extends Simplex{
	public void Shape() {
		super.Shape();
		System.out.println("Tetrahedron");
	}
}
class Hexahedron extends Simplex{
	public void Shape() {
		super.Shape();
		System.out.println("Hexahedron");
	}
}

public class �ǽ�5����2 {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();
		Tetrahedron tet = new Tetrahedron();
		Hexahedron hex = new Hexahedron();
		System.out.println("�ﰢ���� ����ϴ�");
		tri.Shape();
		System.out.println("�簢���� ����ϴ�");
		rec.Shape();
		System.out.println("���ü�� ����ϴ�");
		tet.Shape();
		System.out.println("����ü�� ����ϴ�");
		hex.Shape();
	}
}
