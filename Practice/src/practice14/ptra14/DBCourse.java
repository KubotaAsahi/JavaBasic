package practice14.ptra14;

public class DBCourse implements Course{

	public String getCourseName() {

		return PREFIX + "DB基礎";
	}

	public String[] getCourseUnit() {

		return new String[] {
				"DB基礎"
				,"SQL基礎"
				,"正規化"
				,"SQL応用"
		};

//		String[] sum = new String[4];
//
//		sum[0] = "DB基礎";
//		sum[1] = "SQL基礎";
//		sum[2] = "正規化";
//		sum[3] = "SQL応用";
//
//		return sum;

	}


}

/*
 * ★ common.Courseを実装した、DBCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】DB基礎」
 * 単元
 * 		DB基礎
 * 		SQL基礎
 * 		正規化
 * 		SQL応用
 */