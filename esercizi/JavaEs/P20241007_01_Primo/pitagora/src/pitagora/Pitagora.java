package pitagora;

public class Pitagora {
	public static void main(String[] args) {
		double cat1 = 45.3;
		double cat2 = 67.2;
		double hyp = Math.sqrt(cat1 * cat1 + cat2 * cat2);

		double area = cat1 * cat2 / 2;

		double perimetro = cat1 + cat2 + hyp;

		double raggio = hyp * 3. / 4.;

		double circonferenza = 2. * raggio * Math.PI;

		double areac = Math.PI * raggio * raggio;
		areac = Math.PI * Math.pow(raggio, 2);

		System.out.println("Trigonometria");
		double a = Math.sin(45);
		System.out.println(a);
		double b = Math.sin(Math.PI / 4);
		System.out.println(b);

		TriangoloRettangolo tr = new TriangoloRettangolo(3, 4);

		System.out.println("Ipotenusa: " + tr.getHyp());
		System.out.println("Area: " + tr.getArea());

		tr.setCat1(6);
		System.out.println("Ipotenusa: " + tr.getHyp());
		System.out.println("Area: " + tr.getArea());

		TriangoloRettangolo tr1 = new TriangoloRettangolo(900, 0.2);
		tr1.setCat2(9876);
	}

}
