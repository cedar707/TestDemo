package com.cms.ott;

public class DamselRescuingKnight {

	private RescueDamselQuest quest;
	public DamselRescuingKnight(){
		this.quest = new RescueDamselQuest();
	}
	
	public void embarkOnQuest(){
		quest.embark();
	}
}
