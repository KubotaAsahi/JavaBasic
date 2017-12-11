package practice14.ptra14;

public interface Course {
	String PREFIX = "【Eラーニング】";

	/**
	 * コースの名称を取得します。
	 * 例）Java、DB基礎、IT基礎　など
	 * @return	単元の名称
	 */
	String getCourseName();

	/**
	 * コースの単元を取得します
	 * 例）プログラミングの書き方、式と演算子　など
	 * @return
	 */
	String[] getCourseUnit();
}
