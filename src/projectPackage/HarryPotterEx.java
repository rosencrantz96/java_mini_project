package projectPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class HarryPotterEx {
	
	private static ArrayList<BasicInfo> information = new ArrayList<BasicInfo>();
	private static ArrayList<BasicInfo> information2 = new ArrayList<BasicInfo>();
	
	private static ArrayList<Novels> findNovelInfo = new ArrayList<Novels>();
	private static ArrayList<Movies> findmovieInfo = new ArrayList<Movies>();
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 객체 생성
		Novels nhp1 = new Novels(1, "마법사의 돌");
		Novels nhp2 = new Novels(2, "비밀의 방");
		Novels nhp3 = new Novels(3, "아즈카반의 죄수");
		Novels nhp4 = new Novels(4, "불의 잔");
		Novels nhp5 = new Novels(5, "불사조 기사단");
		Novels nhp6 = new Novels(6, "혼혈왕자");
		Novels nhp7 = new Novels(7, "죽음의 성물");
		
		nhp1.origdate = "1997년 6월 26일";
		nhp2.origdate = "1998년 7월 2일";
		nhp3.origdate = "1999년 7월 8일";
		nhp4.origdate = "2000년 7월 8일";
		nhp5.origdate = "2003년 6월 21일";
		nhp6.origdate = "2005년 7월 16일";
		nhp7.origdate = "2007년 7월 21일";
		
		findNovelInfo.add(nhp1);
		findNovelInfo.add(nhp2);
		findNovelInfo.add(nhp3);
		findNovelInfo.add(nhp4);
		findNovelInfo.add(nhp5);
		findNovelInfo.add(nhp6);
		findNovelInfo.add(nhp7);

		Movies mhp1 = new Movies(1, "마법사의 돌");
		Movies mhp2 = new Movies(2, "비밀의 방");
		Movies mhp3 = new Movies(3, "아즈카반의 죄수");
		Movies mhp4 = new Movies(4, "불의 잔");
		Movies mhp5 = new Movies(5, "불사조 기사단");
		Movies mhp6 = new Movies(6, "혼혈왕자");
		Movies mhp7 = new Movies(7, "죽음의 성물 1부");
		Movies mhp8 = new Movies(8, "죽음의 성물 2부");
		
		mhp1.releaseDate = 2001;
		mhp2.releaseDate = 2002;
		mhp3.releaseDate = 2004;
		mhp4.releaseDate = 2005;
		mhp5.releaseDate = 2007;
		mhp6.releaseDate = 2009;
		mhp7.releaseDate = 2010;
		mhp8.releaseDate = 2011;
		
		mhp1.director = "크리스 콜럼버스";
		mhp2.director = "크리스 콜럼버스";
		mhp3.director = "알폰소 쿠아론";
		mhp4.director = "마이크 뉴얼";
		mhp5.director = "데이비드 예이츠";
		mhp6.director = "데이비드 예이츠";
		mhp7.director = "데이비드 예이츠";
		mhp8.director = "데이비드 예이츠";
		
		findmovieInfo.add(mhp1);
		findmovieInfo.add(mhp2);
		findmovieInfo.add(mhp3);
		findmovieInfo.add(mhp4);
		findmovieInfo.add(mhp5);
		findmovieInfo.add(mhp6);
		findmovieInfo.add(mhp7);
		findmovieInfo.add(mhp8);
		
		BasicInfo basicInfo1 = new Novels(1, "마법사의 돌");
		BasicInfo basicInfo2 = new Novels(2, "비밀의 방");
		BasicInfo basicInfo3 = new Novels(3, "아즈카반의 죄수");
		BasicInfo basicInfo4 = new Novels(4, "불의 잔");
		BasicInfo basicInfo5 = new Novels(5, "불사조 기사단");
		BasicInfo basicInfo6 = new Novels(6, "혼혈왕자");
		BasicInfo basicInfo7 = new Novels(7, "죽음의 성물");
		
		information.add(basicInfo1);
		information.add(basicInfo2);
		information.add(basicInfo3);
		information.add(basicInfo4);
		information.add(basicInfo5);
		information.add(basicInfo6);
		information.add(basicInfo7);
		
		BasicInfo basicInfo8 = new Movies(1, "마법사의 돌");
		BasicInfo basicInfo9 = new Movies(2, "비밀의 방");
		BasicInfo basicInfo10 = new Movies(3, "아즈카반의 죄수");
		BasicInfo basicInfo11 = new Movies(4, "불의 잔");
		BasicInfo basicInfo12 = new Movies(5, "불사조 기사단");
		BasicInfo basicInfo13 = new Movies(6, "혼혈왕자");
		BasicInfo basicInfo14 = new Movies(7, "죽음의 성물 1부");
		BasicInfo basicInfo15 = new Movies(8, "죽음의 성물 2부");
		
		information2.add(basicInfo8);
		information2.add(basicInfo9);
		information2.add(basicInfo10);
		information2.add(basicInfo11);
		information2.add(basicInfo12);
		information2.add(basicInfo13);
		information2.add(basicInfo14);
		information2.add(basicInfo15);
		
		boolean start = true;
		while (start) {
			System.out.println("========== 해리포터 시리즈를 알아보자! ===========");
			System.out.println("1. 기본 정보 | 2. 소설 해리포터 | 3. 영화 | 4. 종료");
			System.out.println("선택하세요>");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				BasicInfo basicInfo = new BasicInfo();
				basicInfo.showBasicInfo();
				System.out.println("");
			} if (selectNo == 2) {
				System.out.println("============= 소설 해리포터 시리즈 =============");
				System.out.println("1. 시리즈 제목이 궁금해요 | 2. 책의 출판일이 궁금해요");
				System.out.println("선택하세요>");
				int selectNo2 = scanner.nextInt();
				if (selectNo2 == 1) {
					System.out.println("");
					showNovelListAll();
					System.out.println("");
				} else if (selectNo2 == 2) {
					System.out.println("");
					findNovelInfoAll();
					System.out.println("");
				} 
			} else if (selectNo == 3) {
				System.out.println("============= 영화 해리포터 시리즈 =============");
				System.out.println("1. 시리즈 제목이 궁금해요 | 2. 영화 개봉년도와 감독이 궁금해요");
				System.out.println("선택하세요>");
				int selectNo3 = scanner.nextInt();
				if (selectNo3 == 1) {
					System.out.println("");
					showMovieListAll();
					System.out.println("");
				} else if (selectNo3 == 2) {
					System.out.println("");
					findmovieInfoAll();
					System.out.println("");
				} 
			} else if (selectNo == 4) {
				start = false; 
			}
			
		}
		System.out.println("프로그램 종료");
	}

	private static void findmovieInfoAll() {
		for(Movies movies : findmovieInfo) {
			System.out.println(movies.findWorks());
		}
	}

	private static void findNovelInfoAll() {
		for(Novels novels : findNovelInfo) {
			System.out.println(novels.findWorks());
		}
	}

	private static void showMovieListAll() {
		for (BasicInfo information : information2) {
			information.showList();
		}
	}

	private static void showNovelListAll() {
		for (BasicInfo information : information) {
			information.showList();
		}
	}

}
