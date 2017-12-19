/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> playerList = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
                String[] spritLine = line.split(",", 0);

                Player player = new Player();
                player.setPosition(spritLine[0]);
                player.setName(spritLine[1]);
                player.setCount(spritLine[2]);
                player.setTram(spritLine[3]);

                playerList.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

//        for(Player player : playerList) {
//        	if(!player.getTram().equals("レアル・マドリード") && !player.getTram().equals("バルセロナ")) {
//        		System.out.println(player);
//        	}
//        }

        for(int i = playerList.size(); i-->0;) {//この行を直す
        	Player player;
        	player = playerList.get(i);
        	if(player.getTram().equals("レアル・マドリード") || player.getTram().equals("バルセロナ")) {
        		

        		playerList.remove(i);

        	}
        }


		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player player : playerList) {
        	System.out.println(player);
        }
	}
}
