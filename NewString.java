
public class NewString {

	public static void main(String[] args) {
		
		String str1= new String("ankur");
		String str2= new String("aman");
		StringBuffer str3=new StringBuffer("raman ");
		StringBuffer str4=new StringBuffer("vivek");
		StringBuilder str5=new StringBuilder("ram ");
		StringBuilder str6= new StringBuilder("shyam");
		
		str1.concat(str2);
		System.out.println(str1);
		str3.append(str4);
		System.out.println(str3);
		str5.append(str6);
		System.out.println(str5);
	}

}
