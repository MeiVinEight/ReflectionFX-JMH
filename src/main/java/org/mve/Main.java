package org.mve;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Main
{
	public static void main(String[] args) throws Throwable
	{
		Options opt = new OptionsBuilder()
			.include(ReflectionFX.class.getName())
			.warmupIterations(3)
			.warmupBatchSize(100000000)
			.measurementIterations(10)
			.measurementBatchSize(100000000)
			.mode(Mode.AverageTime)
			.forks(1)
			.build();
		new Runner(opt).run();
	}
}
