package EnumEx;

 enum Gender {
  MALE,FEMALE,OTHER;
}
public class Demo{
public static void main(String args[])
{
	Gender g=Gender.MALE;
	switch(g) {
	case MALE:
		System.out.println("Male constant value");
	break;
   case FEMALE:
	System.out.println("FEMale constant value");
     break;
	default:
		System.out.println("Other Constant Value");
        break;
}
}
}
