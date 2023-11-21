package EnumEx;

enum Gender1{
	MALE,FEMALE,OTHER,NEWGENDER;
	Gender1(){
		System.out.println("constructor");
	}
} //order of constant
class EnumDemo{
public static  void main(String[] args){
		Gender1[] g  = Gender1.values();
		for(Gender1 g1:g){
		System.out.println(g1.ordinal());
		}
	
	}
}
//swtich - allowed value - byte, short, Char, Integer and enum, String