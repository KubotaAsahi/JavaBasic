package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		
		car1.color = "赤";
		
		car1.gasoline = 50;
		
		System.out.println(300);
		int i = 300;
		int sum = 0;
		
		System.out.println(car1.color);
			System.out.println(" ");
		
		while(true) {
			
			sum++;
			
			System.out.println(i -= car1.run());
			
			
			if(car1.gasoline == 0) {
				
				System.out.println("目的地に到着できませんでした");
				
				break;
				
			}
			
			if(i <= 0) {
				
				System.out.println("目的地にまで"+sum+"時間かかりました。残りのガソリンは、"+car1.gasoline+"リットルです");
				
				break;
			}
			
			
		}
		
		
		Car car2 = new Car();
		
		car2.color = "青";
		
		car2.gasoline = 50;
		
		System.out.println(300);
		int l = 300;
		int num = 0;
		
		System.out.println(car2.color);
		System.out.println(" ");
		
		while(true) {
			
			num++;
			
			System.out.println(l -= car2.run());
			
			
			if(car2.gasoline == 0) {
				
				System.out.println("目的地に到着できませんでした");
				
				break;
				
			}
			
			if(l <= 0) {
				
				System.out.println("目的地にまで"+num+"時間かかりました。残りのガソリンは、"+car2.gasoline+"リットルです");
				
				break;
			}
		}
	
		Car car3 = new Car();
		
		car3.color = "黄色";
		
		car3.gasoline = 50;
		
		System.out.println(300);
		int p = 300;
		int aum = 0;
		
		System.out.println(car3.color);
		System.out.println(" ");
		
		while(true) {
			
			aum++;
			
			System.out.println(p -= car3.run());
			
			
			if(car3.gasoline == 0) {
				
				System.out.println("目的地に到着できませんでした");
				
				break;
				
			}
			
			if(p <= 0) {
				
				System.out.println("目的地にまで"+aum+"時間かかりました。残りのガソリンは、"+car3.gasoline+"リットルです");
				
				break;
			}
		}
	}
}	

