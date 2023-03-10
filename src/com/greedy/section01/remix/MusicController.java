package com.greedy.section01.remix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.greedy.common.MusicDTO;
import com.greedy.common.SearchMusic;

public class MusicController {

	private final MusicService musicService;
	private final PrintResult printResult;

	public MusicController() {
		musicService = new MusicService();
		printResult = new PrintResult();
	}

	public void selectAllMusic() {

		List<MusicDTO> musicList = musicService.selectAllMusic();

		if(musicList != null ) {
			printResult.printMusicList(musicList);
		}else {
			printResult.printErrorMessage("selectList");
		}

	}

	public void selectMusicbyCode(Map<String, String> parameter) {

		int code = Integer.parseInt(parameter.get("code"));

		MusicDTO music = musicService.selectMusicByCode(code);

		if( music != null ) {
			printResult.printMusicList(music);
		}else {
			printResult.printErrorMessage("selectOne");
		}

	}

	public void registMusic(Map<String, String> parameter) {

		MusicDTO music = new MusicDTO();
		music.setArtist(parameter.get("artist"));
		music.setMusicName(parameter.get("name"));
		music.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));

		if(musicService.registMusic(music)) {
			printResult.printSuccessMessage("insert");
		}else {
			printResult.printErrorMessage("insert");
		}
	}

	public void modifyMusic(Map<String, String> parameter) {

		MusicDTO music = new MusicDTO();
		music.setMusicCode(Integer.parseInt(parameter.get("code")));
		music.setArtist(parameter.get("artist"));
		music.setMusicName(parameter.get("name"));
		music.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));

		if(musicService.modifyMusic(music)) {
			printResult.printSuccessMessage("update");
		} else {
			printResult.printErrorMessage("update");
		}
	}

	public void deleteMusic(Map<String, String> parameter) {

		int code = Integer.parseInt(parameter.get("code"));

		if(musicService.deleteMusic(code)) {
			printResult.printSuccessMessage("delete");
		} else {
			printResult.printErrorMessage("delete");
		}
	}

	public void foreachSubMenu() {

		Scanner sc = new Scanner(System.in);
		MusicService musicService = new MusicService();

		do {
			System.out.println("===== foreach ?????? ?????? =====");
			System.out.println("1. ????????? ?????? 3??? ???????????? ");
			System.out.println("9. ?????? ????????? ???????????? ");
			System.out.println("?????? ????????? ??????????????? : ");

			int no = sc.nextInt();

			switch(no) {
			case 1 : musicService.searchMusicByRandomMusicCode(createRandomMusicCodeList()); break;
			case 9 : return;
			}
		} while(true);


	}

	private List<Integer> createRandomMusicCodeList() {

		Set<Integer> set = new HashSet<>();
		while(set.size() < 3) {
			int temp = ((int) (Math.random() * 9)) + 1;
			set.add(temp);
		}
		List<Integer> list = new ArrayList<>(set);

		return list;
	}

	public void chooseSubMusic() {

		Scanner sc = new Scanner(System.in);
		MusicService musicService = new MusicService();

		do {
			System.out.println("===== choose ?????? ?????? =====");
			System.out.println("1. ???????????? ?????? ????????? ?????? ????????????(?????????, ??????, ?????????, ?????????)");
			System.out.println("9. ?????? ?????????");
			System.out.print("?????? ????????? ??????????????? : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 : musicService.searchMusicBySupCategory(inputSupCategory()); break;
			case 9 : return;
			}

		} while(true);


		}

	private static SearchMusic inputSupCategory() {

		Scanner sc = new Scanner(System.in);
		System.out.print("?????? ????????? ??????????????????(?????????, ??????, ?????????, ?????????) : ");
		String value = sc.nextLine();

		return new SearchMusic ("category", value);
	}
}


