package sample;

public class Cat {

	
	String name;        // 名前
    String owner;       // 飼い主

    // コンストラクタ
    Cat(String name) {
        this.name = name;
        this.owner = "佐川真司";
        System.out.println(owner + "の" + name);
    }

	
}
