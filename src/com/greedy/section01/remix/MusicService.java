package com.greedy.section01.remix;

import static com.greedy.common.Template.getSqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.greedy.common.MusicDTO;
import com.greedy.common.SearchMusic;

public class MusicService {

	private MusicMapper musicMapper;

	public List<MusicDTO> selectAllMusic() {

		SqlSession sqlSession = getSqlSession();

		musicMapper = sqlSession.getMapper(MusicMapper.class);
		List<MusicDTO> musicList = musicMapper.selectAllMusic();

		sqlSession.close();

		return musicList;
	}

	public MusicDTO selectMusicByCode(int code) {

		SqlSession sqlSession = getSqlSession();

		musicMapper = sqlSession.getMapper(MusicMapper.class);

		MusicDTO music = musicMapper.selectMusicByCode(code);

		sqlSession.close();

		return music;
	}

	public boolean registMusic(MusicDTO music) {

		SqlSession sqlSession = getSqlSession();
		musicMapper = sqlSession.getMapper(MusicMapper.class);

		int result = musicMapper.inputMusic(music);

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0 ? true : false;
	}

	public boolean modifyMusic(MusicDTO music) {

		SqlSession sqlSession = getSqlSession();
		musicMapper = sqlSession.getMapper(MusicMapper.class);

		int result = musicMapper.updateMusic(music);

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0 ? true : false;
	}

	public boolean deleteMusic(int code) {

		SqlSession sqlSession = getSqlSession();
		musicMapper = sqlSession.getMapper(MusicMapper.class);

		int result = musicMapper.deleteMusic(code);

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0 ? true : false;
	}

	public void searchMusicByRandomMusicCode(List<Integer> randomMusicCodeList) {

		SqlSession sqlSession = getSqlSession();
		musicMapper = sqlSession.getMapper(MusicMapper.class);

		Map<String, List<Integer>> music = new HashMap<>();
		music.put("randomMusicCodeList", randomMusicCodeList);

		List<MusicDTO> musicList = musicMapper.searchMusicByRandomMusicCode(music);

		if(musicList != null && !musicList.isEmpty()) {
			for(MusicDTO musicDTO : musicList) {
				System.out.println(musicDTO);
			}
		} else {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}

		sqlSession.close();

	}

	public void searchMusicBySupCategory(SearchMusic searchMusic) {

		SqlSession sqlSession = getSqlSession();
		musicMapper = sqlSession.getMapper(MusicMapper.class);

		List<MusicDTO> musicList = musicMapper.searchMusicBySupCategory(searchMusic);

		if(musicList != null && !musicList.isEmpty()) {
			for(MusicDTO music : musicList) {
				System.out.println(music);
			}
		} else {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}

		sqlSession.close();

	}

}