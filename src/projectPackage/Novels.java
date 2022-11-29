package projectPackage;

public class Novels extends BasicInfo implements ShowEachWorks {
	// 필드
	public String origdate; 
	
	
	// 생성자
	public Novels() {}
	
	public Novels(int titleNo, String title) {
		super(titleNo, title);
		this.origdate = origdate;
	}

	@Override
	public String findWorks() {
		return titleNo + "편의 발간일은 " + origdate + "입니다.";
	}

	@Override
	public void showList() {
		System.out.println(titleNo + "권 제목: " + title);
	}
	
	

}
