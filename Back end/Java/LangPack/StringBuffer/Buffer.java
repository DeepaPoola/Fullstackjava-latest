class Buffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Rahul");
		StringBuffer s = new StringBuffer("Rahul");
		sb.append("Gandhi");
		StringBuffer a=s.append("Gandhi");
		System.out.println(sb);
		System.out.println(a);

	}

}
