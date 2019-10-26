
public class Triangle {
	private double first_side;
	private double secound_side;
	private double third_side;
	
	Triangle(){
		first_side = 1;
		secound_side = 1;
		third_side = 1;
	}
	Triangle(Double a, Double b, Double c){
		first_side = a;
		secound_side = b;
		third_side = c;
		
	}

	public boolean ifTriangle() {
		if((this.first_side+this.secound_side>=this.third_side)&&(this.first_side+this.third_side>=this.secound_side)&&(this.third_side+this.secound_side>=this.first_side)) {
		return true;
}
		else {
			return false;
		}
}
	public double TriangleSquare() {
		double p = (this.first_side + this.secound_side + this.third_side)/2;
		double S = Math.sqrt(p*(p-this.first_side)*(p-this.secound_side)*(p-this.third_side));
		return S;
	}
	public void GetArrangedSides() {
		if(!this.ifTriangle()) {
			System.out.println("It is not a triangle");
		}
		Double[] Sides = {this.first_side,this.secound_side,this.third_side};
		boolean sorted = false;
		double temp;
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < Sides.length - 1; i++)
			{
				if(Sides[i] > Sides[i+1])
				{
					temp = Sides[i];
	                Sides[i] = Sides[i+1];
	                Sides[i+1] = temp;
	                sorted = false;
				}
			}
		}
		for(int i=0;i < Sides.length; i++)
		{
		System.out.println(Sides[i]);
		}
	}
	public boolean IfPitagoras() {
		if(!this.ifTriangle()) {
			return false;
		}
		if(Math.pow(this.first_side,2)+Math.pow(this.secound_side,2) == Math.pow(this.third_side,2)) {
			return true;
	}
			else {
				if(Math.pow(this.first_side,2)+Math.pow(this.third_side,2) == Math.pow(this.secound_side,2)) {
					return true;
				}
				else
				{
					if(Math.pow(this.third_side,2)+Math.pow(this.secound_side,2) == Math.pow(this.first_side,2)) {
						return true;
					}
					else {
						return false;
					}
				}
			}
	}
	public boolean Angle() {
		if(!this.ifTriangle()) {
			return false;
		}
		if(Math.pow(this.first_side,2)+Math.pow(this.secound_side,2) < Math.pow(this.third_side,2)) {
			return true;
	}
			else {
				if(Math.pow(this.first_side,2)+Math.pow(this.third_side,2) < Math.pow(this.secound_side,2)) {
					return true;
				}
				else
				{
					if(Math.pow(this.third_side,2)+Math.pow(this.secound_side,2) < Math.pow(this.first_side,2)) {
						return true;
					}
					else {
						return false;
					}
				}
			}
	}
	public static void main(String[] args)
	{
		Triangle triangleGood = new Triangle(3.,4.,5.);
		Triangle triangleBad = new Triangle(7.,5.,1.);
		System.out.println(triangleGood.ifTriangle());
		System.out.println(triangleGood.TriangleSquare());
		triangleGood.GetArrangedSides();
		System.out.println(triangleGood.IfPitagoras());
		System.out.println(triangleGood.Angle());
		System.out.println(triangleBad.ifTriangle());
		System.out.println(triangleBad.TriangleSquare());
		triangleBad.GetArrangedSides();
		System.out.println(triangleBad.IfPitagoras());
		System.out.println(triangleBad.Angle());
	}
	}