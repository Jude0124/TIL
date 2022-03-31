package shape;

public class Rectangle extends Shape implements Resize {
		public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String color) {
		super();
		
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public double getArea() {
		return (width * height); 
	}
	
	public void setResize(int size) {
		this.width = this.width + size;
	}

	public String toString() {
		return "Rectangle  " + getArea() + "  " + color + "";
	}
}
