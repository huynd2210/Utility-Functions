	//4 different functions to assess fitness of a text using quadgram/trigram/bigram and chi-score, requires dictionary/text corpus
  
  
  public static double fitness_bigram (String string){
		HashMap<String, Integer> bigramMap = new HashMap<String, Integer>();
		bigramMap = Ngrams.getBigram(string);
		HashMap<String, Integer> dataMap = new HashMap <String, Integer>();
		String File = "C:\\english_bigrams.txt"; //insert corpus/dictionary here
		BufferedReader br = null;
		FileReader fr = null;
		String line = "";
		double total_score = 0;
		try {
			fr = new FileReader(File);
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null ){
				String [] bigram = line.split(" ");
				int count = Integer.parseInt(bigram[1]);
				dataMap.put(bigram[0], count);	
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}finally {
			if (br != null){
				try{
					br.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		for (String key: bigramMap.keySet()){
			bigramMap.get(key);
			if (dataMap.get(key) != null){
				double bigram_count = bigramMap.get(key);
				double total_count = dataMap.get(key);
				double score = bigram_count/total_count;
				if (score == 0){
					score = 1;
				}
				score = Math.log10(score);
				total_score += score;
			}
		}
		return total_score;
	}
	public static double fitness_quadgram (String string){
		HashMap<String, Integer> quadgramMap = new HashMap<String, Integer>();
		quadgramMap = Ngrams.getQuadgram(string);
		HashMap<String, Integer> dataMap = new HashMap<String, Integer>();
		String File = "C:\\Woodchop\\english_quadgrams.txt";
		BufferedReader br = null;
		FileReader fr = null;
		String line = "";
		double total_score = 0;
		try {
			fr = new FileReader(File);
			br = new BufferedReader(fr);		
			while ((line = br.readLine()) != null){
				String [] quadgram = line.split(" ");
				int count = Integer.parseInt(quadgram[1]);
				dataMap.put(quadgram[0], count);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}finally {
			if (br != null){
				try{
					br.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		for (String key: quadgramMap.keySet()){
			quadgramMap.get(key);
				if (dataMap.get(key) != null){
					double quadgram_count = quadgramMap.get(key);
					double total_count = dataMap.get(key);
					double score = quadgram_count/total_count;
					if (score == 0){	
						score = 1;
					}
					score = Math.log10(score);
					total_score += score;
				}	
			}
		return total_score;
	}	
	private static double getCS(String input){
		HashMap<Character, Integer> map = letterfrequency(input);
		int value = 0;
		char key = 'a';
		double chi_score = 0, final_score = 0;
		double [] frequency = {0.08167,0.01492,0.02782,0.04253,0.12702,0.02228,0.02015,
				0.06094,0.06966,0.00153,0.00772,0.04025,0.02406,0.06749,0.07507,0.01929,
				0.00095,0.05987,0.06327,0.09056,0.02758,0.00978,0.02360,0.00150,0.01974,0.00074}; //distribution of letters in english
		for (int i = 0; i < 26; i++){  //Calculate chi_score for all 26 characters
			double result = input.length()*frequency[i];
			try {value = map.get((char)(key + i));} 
			catch (Exception e) {continue;}
			value = map.get((char)(key + i));
			chi_score = (Math.pow(value - result, 2))/result;
			final_score += chi_score;
			}
		return final_score;
	}
