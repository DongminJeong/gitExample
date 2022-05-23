package ch10;

class Triangle extends Figure {
	 
	@Override
	void draw() {
		// TODO Auto-generated method stub
		super.draw();
	}
	
}

public class Figure {
	
	void draw() {
		
		System.out.println("도형을 그립니다.");
	}

	class Circle extends Figure {
		
		void draw() {
			
			System.out.println("삼각형 그리기...");
		}
	}
	// 좌변은 부모 우변은 자식클래스 (다형성)
}
