package com.greedy.section01.remix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		MusicController musicController = new MusicController();

		do {
			System.out.println("===== 플레이리스트 =====");
			System.out.println("1. 플레이리스트 전체 조회 ");
			System.out.println("2. 음악 코드로 음악 조회 ");
			System.out.println("3. 새로운 노래 추가 ");
			System.out.println("4. 음악 수정 ");
			System.out.println("5. 음악 삭제 ");
			System.out.println("6. foreach로 랜덤 플레이리스트 조회하기");
			System.out.println("7. choose 확인하기 ");
			System.out.println("음악 관리 번호 입력 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 : musicController.selectAllMusic(); break;
			case 2 : musicController.selectMusicbyCode(inputMusicCode()); break;
			case 3 : musicController.registMusic(inputMusic()); break;
			case 4 : musicController.modifyMusic(inputModifyMusic()); break;
			case 5 : musicController.deleteMusic(inputMusicCode()); break;
			case 6 : musicController.foreachSubMenu(); break;
			case 7 : musicController.chooseSubMusic(); break;
			default : System.out.println("잘못 된 메뉴를 선택하셨습니다.");
			}
		}while(true);

	}


	private static Map<String, String> inputMusicCode() {

		Scanner sc = new Scanner(System.in);
		System.out.println("음악 코드 입력 : ");
		String code = sc.nextLine();

		Map<String, String> parameter = new HashMap<>();
		parameter.put("code", code);

		return parameter;
	}
	private static Map<String, String> inputMusic() {

		Scanner sc = new Scanner(System.in);
		System.out.println("가수 이름 : ");
		String artist = sc.nextLine();
		System.out.println("노래 제목 : ");
		String name = sc.nextLine();
		System.out.print("음악 카테고리 코드 : ");
		String categoryCode = sc.nextLine();

		Map<String, String> parameter = new HashMap<>();
		parameter.put("artist", artist);
		parameter.put("name", name);
		parameter.put("categoryCode", categoryCode);

		return parameter;
	}

	private static Map<String, String> inputModifyMusic() {

		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 음악 코드 : ");
		String code = sc.nextLine();
		System.out.print("수정할 가수 이름 : ");
		String artist = sc.nextLine();
		System.out.print("수정할 노래 제목 : ");
		String name = sc.nextLine();
		System.out.print("수정할 카테고리 코드 : ");
		String categoryCode = sc.nextLine();

		Map<String, String> parameter = new HashMap<>();
		parameter.put("code", code);
		parameter.put("artist", artist);
		parameter.put("name", name);
		parameter.put("categoryCode", categoryCode);

		return parameter;
	}

}