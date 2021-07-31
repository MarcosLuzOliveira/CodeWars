
public class JadenCasingStrings {
	public class JadenCase {

		public String toJadenCase(String phrase) {
			// TODO put your code below this comment
			if(phrase == null || phrase == ""){
				return null;
			}
			String x[] = phrase.split(" ");
			String res = "";
			for(int i = 0; i <= x.length; i++) {
				x[i] = x[i].replace(x[i].charAt(0), Character.toUpperCase(x[i].charAt(0)));
				res += String.format("%s ",x[i]);
			}
			    
			res= res.trim();
			System.out.print(res);
			    
			return res;
		}
	}
}
