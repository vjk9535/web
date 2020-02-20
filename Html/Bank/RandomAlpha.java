
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RandomAlpha {
	static String getAlphaNumericString(int n) {
String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
StringBuilder sb = new StringBuilder(n);
for(int i=0;i<n;i++) {
	int index = (int)(AlphaNumericString.length()*Math.random());
	sb.append(AlphaNumericString.charAt(index));
	
}
return sb.toString();
}
	 
	public static void main(String[] args) {
		int n=30;
		String vr = new String(RandomAlpha.getAlphaNumericString(n));
		try(PrintStream out = new PrintStream(new FileOutputStream("JavaFile25.txt"))){
	out.print(vr);
	}catch(Exception e) {
}
}
}