package org.mve;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.concurrent.TimeUnit;

public class Main
{
	public static void main(String[] args) throws Throwable
	{
		Options opt = new OptionsBuilder()
			.include(ReflectionFX.class.getName())
			.warmupIterations(3)
			.warmupBatchSize(1000)
			.warmupTime(TimeValue.seconds(1))
			.measurementIterations(10)
			.measurementBatchSize(1000)
			.measurementTime(TimeValue.seconds(1))
			.timeUnit(TimeUnit.NANOSECONDS)
			.mode(Mode.AverageTime)
			.forks(1)
			.build();
		new Runner(opt).run();
	}
}
