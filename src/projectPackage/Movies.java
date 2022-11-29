package projectPackage;

public class Movies extends BasicInfo implements ShowEachWorks {
	// 필드
	public int releaseDate;
	public String director;
	

	// 생성자
	public Movies() {}
	
	public Movies(int titleNo, String title) {
		super(titleNo, title);
		this.releaseDate = releaseDate;
		this.director = director;
		
	}

	@Override
	public String findWorks() {
		return titleNo + "편의 개봉년도는 " + releaseDate + "년, 감독은 " + director + "입니다.";
		
	}

	@Override
	public void showList() {
		System.out.println(titleNo + "편 제목: " + title);
	}
	
	

}