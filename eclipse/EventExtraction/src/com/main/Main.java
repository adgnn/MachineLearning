package com.main;

import com.event.TriggerScore;

public class Main {

	public static void main(String[] args) {

		// String excelPath="C:\\Users\\chenbin\\Desktop\\event.xls";
		// String outPath="C:\\Users\\chenbin\\Desktop\\eventOut.xls";

//		String triggerWordPath=System.getProperty("user.dir") + "/corpous/cec/CEC_Train_Corpous/triggerWord.txt";
//		Map<EventEnum, List<String>> triggerMap=CECTxtDeal.readTriggerWord(triggerWordPath);
//		System.out.println(triggerMap);

		
		//new TriggerLarger();
		//System.out.println(TriggerLarger.getType2wordsMap());
		
//		String path=System.getProperty("user.dir") + "/corpous/cec/CEC_Train_Corpous/cecCorpous.txt";
//		CECTxtDeal.cecParticiple(path);
		
//		String path = System.getProperty("user.dir") + "/corpous/cec/CEC_Train_Corpous/eventOut.xls";
//		Map<EventEnum, Map<String, Integer>> originType2WordAndCountMap = EventParser.parseEvent(path);
//		Iterator<EventEnum> iterator = originType2WordAndCountMap.keySet().iterator();
//		while (iterator.hasNext()) {
//
//			EventEnum key = iterator.next();
//			System.out.println(key);
//			Map<String, Integer> value = originType2WordAndCountMap.get(key);
//			//System.out.println(value);
//			
//			value=sortByValue(value);
//			System.out.println(value);
//
//			// String key=(String)iterator.next();
//			// System.out.println(key);
//			// System.out.println(denoterMap.get(key));
//		}

		// System.out.println(originType2WordAndCountMap);

//		 String projectRootPath=System.getProperty("user.dir")+"/corpous/cec/";
//		////
//		 String xmlFolderPath=projectRootPath+"/CEC_Train_Corpous/";
//		 String cecCorpous=projectRootPath+"/CEC_Train_Corpous/cecCorpous.txt";
//		
//		//
//		 CECTxtDeal.cecCorpousExtract(xmlFolderPath,cecCorpous);

		
//		String content="8月19日晚，315国道德令哈段(480KM+700M)发生一起交通事故";
//		String result=NlpirMethod.NLPIR_ParagraphProcess(content,1);
//		System.out.println(result);

		// NlpirMethod.NLPIR_FileProcess(cecCorpous, sResultFilename, 1);

		// String
		// denoterTxt=projectRootPath+"/corpous/CEC_Train_Corpous/denoter.txt";
		// CECTxtDeal.getDenoter(xmlFolderPath, denoterTxt);

		// HashMap<String, List<String>>
		// denoterMap=FileUtil.orderTxtFile(denoterTxt, "UTF-8");
		//
		// Iterator<String> iterator = denoterMap.keySet().iterator();
		// while (iterator.hasNext()){
		// String key=(String)iterator.next();
		// System.out.println(key);
		// System.out.println(denoterMap.get(key));
		// }

		// new TriggerLarger();
		// System.out.println(TriggerLarger.word2typeMap);

		// String
		// train_seq_path=System.getProperty("user.dir")+"/corpous/cec/CEC_Train_Corpous/cecResult.txt";
		// //System.out.println("3\t"+train_seq_path);
		// File file = new File(train_seq_path);
		// TriggerScorePre.splitSentece(file);

//		String test_seq_path=System.getProperty("user.dir")+"/corpous/cec/CEC_Train_Corpous/cecResult.txt";
//		File file = new File(test_seq_path);
//		TestTriggerScoreCalculate.parseTest(file);

//		System.out.println(TriggerLarger.getType2wordsMap());
//		new TriggerScorePre();
		
		
		//Map<String, Double> sorceMap=TriggerScore.getSorceMap();
		System.out.println(TriggerScore.getSorceMap());
	}



}
