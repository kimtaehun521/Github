package com.greedy.common;

public class MusicDTO {

	private String artist;
	private int musicCode;
	private String musicName;
	private int categoryCode;
	private String downloadAbleStatus;

	public MusicDTO() {}

	public MusicDTO(String artist, int musicCode, String musicName, int categoryCode, String downloadAbleStatus) {
		super();
		this.artist = artist;
		this.musicCode = musicCode;
		this.musicName = musicName;
		this.categoryCode = categoryCode;
		this.downloadAbleStatus = downloadAbleStatus;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getMusicCode() {
		return musicCode;
	}

	public void setMusicCode(int musicCode) {
		this.musicCode = musicCode;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getDownloadAbleStatus() {
		return downloadAbleStatus;
	}

	public void setDownloadAbleStatus(String downloadAbleStatus) {
		this.downloadAbleStatus = downloadAbleStatus;
	}

	@Override
	public String toString() {
		return "MusicDTO [artist=" + artist + ", musicCode=" + musicCode + ", musicName=" + musicName
				+ ", categoryCode=" + categoryCode + ", downloadAbleStatus=" + downloadAbleStatus + "]";
	}




}