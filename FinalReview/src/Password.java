import java.util.*;

public class Password {
	public static final int WEAK = 3;
	public static final int STRONG = 1;
	public final static int MEDIUM = 2;
	public final static int INVALID = 4;
	private String password;

	public Password(String s){
		this.password = s;
	}
	
	public boolean longEnough(int n){
		return(password.length() >= n);
	}
	
	public boolean containsOneOf(String chars){
		int counter=0;
		char[] temp;
		
		temp = chars.toCharArray();

		for(int i=0; i < temp.length ;i++){
			String s = Character.toString(temp[i]);
			if(password.contains(s)){
				counter++;
			}
		}
		
		return(counter>1);
	}
	
	public boolean containsNoneOf(String chars){
		int counter=0;
		char[] tempChars;
		
		tempChars = chars.toCharArray();

		for(int i=0; i < tempChars.length ;i++){
			String s = Character.toString(tempChars[i]);
			
			if(password.contains(s)){
				counter++;
			}
		}
		
		return(counter==0);
	}
	
	public boolean containsUpperCase(){
		
		return (password.contains("Q")||
				password.contains("W")||
				password.contains("E")||
				password.contains("R")||
				password.contains("T")||
				password.contains("Y")||
				password.contains("U")||
				password.contains("I")||
				password.contains("O")||
				password.contains("P")||
				password.contains("A")||
				password.contains("S")||
				password.contains("D")||
				password.contains("F")||
				password.contains("G")||
				password.contains("H")||
				password.contains("J")||
				password.contains("K")||
				password.contains("L")||
				password.contains("Z")||
				password.contains("X")||
				password.contains("C")||
				password.contains("V")||
				password.contains("B")||
				password.contains("N")||
				password.contains("M")
				);
	}
	
	public boolean containsLowerCase(){
		return (password.contains("q")||
				password.contains("w")||
				password.contains("e")||
				password.contains("r")||
				password.contains("y")||
				password.contains("t")||
				password.contains("u")||
				password.contains("i")||
				password.contains("o")||
				password.contains("p")||
				password.contains("a")||
				password.contains("s")||
				password.contains("d")||
				password.contains("f")||
				password.contains("g")||
				password.contains("h")||
				password.contains("j")||
				password.contains("k")||
				password.contains("l")||
				password.contains("z")||
				password.contains("x")||
				password.contains("c")||
				password.contains("v")||
				password.contains("b")||
				password.contains("n")||
				password.contains("m")
				);
	}
	
	public boolean containsDigits(){
		return(password.contains("1")||
				password.contains("2")||
				password.contains("3")||
				password.contains("4")||
				password.contains("5")||
				password.contains("6")||
				password.contains("7")||
				password.contains("8")||
				password.contains("9")||
				password.contains("0")
				);
	}
	
	public boolean containsSymbols(){
		return( password.contains("!")||
				password.contains("@")||
				password.contains("#")||
				password.contains("$")||
				password.contains("%")||
				password.contains("^")||
				password.contains("&")||
				password.contains("*")||
				password.contains("(")||
				password.contains(")"));
	}
	
	public int safetyLevel(){
		
		int temp=0;
		
		if(password.length()<8  || password.contains("/") || password.contains(".")){
			return 4;
		}
		
		if(password.length()>=8 && ((this.containsDigits() && !(this.containsUpperCase()) )||  (this.containsUpperCase()) && !(this.containsDigits()))){
			temp = 3;
		}
		
		if(password.length()>=8 && this.containsUpperCase() && this.containsLowerCase() && this.containsDigits()){
			temp = 2;
		}
	
		if(this.containsUpperCase() && this.containsDigits() && this.containsLowerCase() && this.containsSymbols() && (password.length()>9)){
			temp = 1;
		}
		
		return temp ;
		
	}

}
