package practice14.ptra14;


public class JavaCourse implements Course{

	public String getCourseName() {
		return PREFIX;
	}

	public String[] getCourseUnit(){
		String[] num = new String [7];
		
		num[0] = "式と演算";
		num[1] = "制御構文";
		num[2] = "メソッド";
		num[3] = "配列";
		num[4] = "オブジェクト指向";
		num[5] = "継承";
		num[6] = "高度な継承";
		
		return num;
	}
}
/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */
