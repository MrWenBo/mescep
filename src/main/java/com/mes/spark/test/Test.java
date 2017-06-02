package com.mes.spark.test;



public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*JavaRDD<String> textFile = sc.textFile("hdfs://...");
		JavaPairRDD<String, Integer> counts = textFile
		    .flatMap(s -> Arrays.asList(s.split(" ")).iterator())
		    .mapToPair(word -> new Tuple2<>(word, 1))
		    .reduceByKey((a, b) -> a + b);
		counts.saveAsTextFile("hdfs://...");*/
		
/*		List<Integer> l = new ArrayList<>(NUM_SAMPLES);
		for (int i = 0; i < NUM_SAMPLES; i++) {
		  l.add(i);
		}

		long count = sc.parallelize(l).filter(i -> {
		  double x = Math.random();
		  double y = Math.random();
		  return x*x + y*y < 1;
		}).count();
		System.out.println("Pi is roughly " + 4.0 * count / NUM_SAMPLES);*/

	}

}
