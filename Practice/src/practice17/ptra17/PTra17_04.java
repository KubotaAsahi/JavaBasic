/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */
		
		//文字列を配列に一文字ずつセット
		char[] charArray = str.toCharArray();
		for (char ch : charArray) {
			System.out.print(ch);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
//		char data[] = str.toCharArray();
//		
		//配列数を取得
//		int num = data.length;
//		
//		for(int i = 0; i <= num - 1; i++) {
//			
//			try {
//				
//				Thread.sleep(1000);
//				
//			}catch (InterruptedException e) {
//				
//				System.out.println("エラーが起きました");
//				
//			}
//			System.out.print(data[i]);
			}	
		}
	}
}
