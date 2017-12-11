package practice16;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) {
    	
    	Date date = new Date();
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日");

        /*
        * ★ 現在時刻を「YYYY年MM月DD日」形式で出力してください
        */
    	
    	String dateStr = simpleDateFormat.format(date);
    	
    	System.out.println(dateStr);
    }
}