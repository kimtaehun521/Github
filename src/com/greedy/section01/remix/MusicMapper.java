package com.greedy.section01.remix;

import java.util.List;
import java.util.Map;

import com.greedy.common.MusicDTO;
import com.greedy.common.SearchMusic;

public interface MusicMapper {

	List<MusicDTO> selectAllMusic();

	MusicDTO selectMusicByCode(int code);

	int inputMusic(MusicDTO music);

	int updateMusic(MusicDTO music);

	int deleteMusic(int code);

	List<MusicDTO> searchMusicByRandomMusicCode(Map<String, List<Integer>> music);

	List<MusicDTO> searchMusicBySupCategory(SearchMusic searchMusic);

}