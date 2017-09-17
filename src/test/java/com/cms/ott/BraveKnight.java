package com.cms.ott;

public class BraveKnight {

	private Quest quest;
	public BraveKnight(Quest quest){
		this.quest = quest;
	}
	public void embarkOnQuest(){
		quest.embark();
	}
}
