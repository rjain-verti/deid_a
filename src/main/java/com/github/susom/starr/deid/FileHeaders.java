package com.github.susom.starr.deid;

public class FileHeaders {
	private String id;
	private String transcription;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTranscription() {
		return transcription;
	}
	public void setTranscription(String transcription) {
		this.transcription = transcription;
	}
	public FileHeaders(String id, String transcription) {
		super();
		this.id = id;
		this.transcription = transcription;
	}
	public FileHeaders() {
		super();
	}
	
}
