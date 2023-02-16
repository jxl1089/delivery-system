package board;

import java.awt.Button;

public class Boarder {
	
	
	String quest_id;
	String user_id;
	String user_name;
	String quest_detail;
	int quest_price;
	public boolean isButton() {
		return button;
	}
	public void setButton(boolean button) {
		this.button = button;
	}
	boolean button;
	
	
	
	
	public String getQuest_id() {
		return quest_id;
	}
	public void setQuest_id(String quest_id) {
		this.quest_id = quest_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getQuest_detail() {
		return quest_detail;
	}
	public void setQuest_detail(String quest_detail) {
		this.quest_detail = quest_detail;
	}
	public int getQuest_price() {
		return quest_price;
	}
	public void setQuest_price(int quest_price) {
		this.quest_price = quest_price;
	}
	
	
}