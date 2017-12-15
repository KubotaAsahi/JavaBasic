package practice18.entity;

public class Player {
	
	private String position;
	private String name;
	private String count;
	private String team;
	
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	public String getTram() {
		return this.team;
	}
	public void setTram(String tram) {
		this.team = tram;
	}
	/* 		toString()	：	Objectクラスのオーバーライド
	* 		各フィールドの値を、カンマ区切りの文字列で取得する
	* 
	*		 String[] str=line.split(",",0);これは使わない。
	*/
	
	public String toString() {
		
//		String[] strs = new String[4];
//		strs[0] = this.position;
//		strs[1] = this.name;
//		strs[2] = this.count;
//		strs[3] = this.team;
		return this.position + "," + this.name + "," + this.count + "," +this.team;
		
	}
	

	
}

