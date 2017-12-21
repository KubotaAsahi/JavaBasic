/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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

        Collections.shuffle(playerList);

       int count1 = 0;
       int count2 = 0;
       int count3 = 0;
       int count4 = 0;
       
       ArrayList<Player> ListGk = new ArrayList<>();
       ArrayList<Player> ListDf = new ArrayList<>();
       ArrayList<Player> ListMf = new ArrayList<>();
       ArrayList<Player> ListFw = new ArrayList<>();

        for(int i = 0;i < playerList.size();i++) {
        	Player player;
        	player = playerList.get(i);

        	if(player.getPosition().equals("GK") && count1 < 1 ) {
        		
        		ListGk.add(player);
        		
        		
        		count1++;
        		
        		
        	}else if(player.getPosition().equals("DF") && count2 < 4 ) {
        		
        		ListDf.add(player);
        		
        		count2++;
        		
        		
    		}else if(player.getPosition().equals("MF") && count3 < 4 ) {
    			
    			ListMf.add(player);
    			
    			count3++;
    			
    			
    		}else if(player.getPosition().equals("FW") && count4 < 2 ) {
    			
    			ListFw.add(player);
    			
    			count4++;
    			
    			
    		}
        }
		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        
        
        	for(Player GK:ListGk) {
        		System.out.println(GK);
        	}
        	for(Player DF : ListDf) {
            	System.out.println(DF);
            }
        	for(Player MF : ListMf) {
            	System.out.println(MF);
            }
        	for(Player FW : ListFw) {
            	System.out.println(FW);
            }
        	
        
        
        
	}
}
