package sample;

public class Sample1 {

	  public static void main(String[] args) {
	        // ① 財布インスタンスを作成
	        Wallet wallet = new Wallet();
	        wallet.money = 1000;

	        // ② 顧客インスタンスを作成
	        Customer customer = new Customer();
	        customer.wallet = wallet;

	        // ③ 顧客インスタンスの財布中身の金額を出力
	        System.out.println("財布の中身は" + customer.wallet.money + "円");
	    }


}
