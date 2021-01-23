package blockchain;

public class FirstBlockchain {
 public static void main(String[] args) {
	 int genesis=0;

 String tra1 = "Ahmet send 10 btc to Mehmet";
	
	System.out.println(blockMaker(genesis, tra1));
	
}
 static  int blockMaker(int pre,String tra) {
	String a = String.valueOf(pre)+tra;
	return a.hashCode();
 }
 
}
