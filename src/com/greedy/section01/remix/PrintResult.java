package com.greedy.section01.remix;

import java.util.List;

import com.greedy.common.MusicDTO;

public class PrintResult {

	public void printMusicList(List<MusicDTO> musicList) {
		for(MusicDTO music : musicList) {
			System.out.println(music);
		}
	}

	public void printMusicList(MusicDTO music) {
		System.out.println(music);

	}

	public void printErrorMessage(String errorCode) {
		String errorMessage = "";
		switch(errorCode) {
		case "selectList" : errorMessage = "음악 목록 조회에 실패하였습니다."; break;
		case "selectOne" : errorMessage = "음악 조회에 실패하였습니다."; break;
		case "insert" : errorMessage = "음악 등록에 실패하였습니다."; break;
		case "update" : errorMessage = "음악 수정에 실패하였습니다."; break;
		case "delete" : errorMessage = "음악 삭제에 실패하였습니다."; break;
		}

		System.out.println(errorMessage);

	}

	public void printSuccessMessage(String successCode) {

		String successMessage = "";
		switch(successCode) {
		case "insert" : successMessage = "음악 등록에 성공하였습니다."; break;
		case "update" : successMessage = "음악 수정에 성공하였습니다."; break;
		case "delete" : successMessage = "음악 삭제에 성공하였습니다."; break;
		}

		System.out.println(successMessage);

	}

}