package com.example.string.wordcount;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class SplitWordCount {

	public static void main(String[] args) {
		List<String> terms = Arrays.asList("Coding is great", "Search engine are great", "Google is nice search engine",
				"Bing is also nice search enginr");
		TopOccurance topOccurance = new TopOccurance(5);
		terms.parallelStream()
				.flatMap(s -> Arrays.asList(s.split(" ")).stream())
				.collect(Collectors.toConcurrentMap(w -> w.toLowerCase(), w -> 1, Integer::sum))
				.forEach((s, integer) -> topOccurance.add(new WordCount(s, integer)));
		System.out.println(topOccurance);
	}

	static class TopOccurance {

		private final PriorityQueue<WordCount> minHeap;
		private final int maxSize;
		
		public TopOccurance(int maxSize) {
			this.maxSize = maxSize;
			this.minHeap = new PriorityQueue<WordCount>(Comparator.comparingInt(wc->wc.count));
		}
		
		public void add(WordCount data) {
			if(minHeap.size()<maxSize) {
				minHeap.offer(data);
			}else if(minHeap.peek().count < data.count) {
				minHeap.poll();
				minHeap.offer(data);
			}
		}
		
		public String toString() {
			return "TopOccurance { minHeap ==>"+ minHeap + " maxSize ==>"+maxSize + "}"; 
		}
	}
	
	static class WordCount {

		protected final String word;
		protected final int count;

		WordCount(String word,int count){
			this.word = word;
			this.count = count;
		}

		public String toString() {
			return "WordCount { word ==>" + word + " count ==>" + count + "}";
		}
	}
}
