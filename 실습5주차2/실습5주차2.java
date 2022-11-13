package 실습5주차2;

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

public class 실습5주차2 {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();
		Tetrahedron tet = new Tetrahedron();
		Hexahedron hex = new Hexahedron();
		System.out.println("삼각형을 만듭니다");
		tri.Shape();
		System.out.println("사각형을 만듭니다");
		rec.Shape();
		System.out.println("사면체를 만듭니다");
		tet.Shape();
		System.out.println("육면체를 만듭니다");
		hex.Shape();
	}
}
