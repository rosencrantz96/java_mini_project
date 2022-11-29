package projectPackage;


public class BasicInfo extends ShowAllTitles {
	//필드
	int titleNo;
	String title;
	String mainChar;
	String writer;
	String mainActor;
	
	// 생성자
	public BasicInfo() {
		initInfo();
	}
	
	BasicInfo(int titleNo, String title) {
		this.titleNo = titleNo;
		this.title = title;
		initInfo();
	}

	void initInfo() {
		writer = "J.K 롤링";
		mainChar = "해리 포터, 헤르미온느 그레인저, 론 위즐리";
		mainActor = "다니엘 래드클리프, 루퍼트 그린트, 엠마 왓슨";
	}

	@Override
	public void showList() {
		System.out.println(titleNo + "편 제목: " + title); 
	}
	
	public void showBasicInfo() {
		System.out.println("해리포터 시리즈의 작가는 " + writer + "입니다.");
		System.out.println("주인공은 " + mainChar + " 삼인방이며, 이들을 연기한 배우들의 이름은 " + mainActor + "입니다.");
	}
 
	
}
