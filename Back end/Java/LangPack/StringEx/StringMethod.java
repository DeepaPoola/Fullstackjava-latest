class StringMethod{

	public static void main(String[] args) {
		String name= new String("Rahul Gandhi");
		//string length
		System.out.println(name.length());
		System.out.println(name.charAt(4));//return the char
		System.out.println(name.substring(0, 5));
		System.out.println(name.indexOf('l'));
		System.out.println(name.isEmpty());
		System.out.println(name.toUpperCase());

	}

}