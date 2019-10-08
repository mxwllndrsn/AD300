class Circle{

	double radius = 1.0;

	Circle() {}	
	
	Circle(double newRadius){
		radius = newRadius;
	}
	double getArea() {
		return radius * radius * 3.14159;
	}	
}
