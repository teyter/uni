public class Sivalningur {
    public static void main(String args[]) {
	double rad = Double.parseDouble(args[0]);	
	double haed = Double.parseDouble(args[1]);
	double fs = (2*Math.PI*Math.pow(rad,2)+2*Math.PI*haed*rad);
        double rs = Math.PI*haed*Math.pow(rad,2);

	System.out.println("Flatarmál sívalningsins er: " + fs);
	System.out.println("Rúmmál sívalningsins er: " + rs);

	}
}
