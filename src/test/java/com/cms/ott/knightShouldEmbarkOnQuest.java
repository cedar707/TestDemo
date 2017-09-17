package com.cms.ott;

public class knightShouldEmbarkOnQuest {

	@Test
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class);
		BraveKnight kNight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest,times(1).embark());
	}
	
	@Configuration
	public class KnightConfig{
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest(){
		return new SlayDragonQuest(System.out);
	}
}
