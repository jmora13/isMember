
public class Member {
	public static boolean isMember(String[] array, String name, int n){
		if(array[n].equals(name)){
			return true;
		} else{	
			return isMember(array,name, ++n);
		}
	}

	public static void main(String[] args){
		Member member = new Member();
		String[] memberNames = new String[]{"a","bob","c","d","e","f"};
		//System.out.println(memberNames[1]);
		System.out.println(isMember(memberNames,"e", 0));
	}
}
