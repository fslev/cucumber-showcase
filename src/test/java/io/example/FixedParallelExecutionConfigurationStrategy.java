package io.example;

import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

public class FixedParallelExecutionConfigurationStrategy implements ParallelExecutionConfiguration, ParallelExecutionConfigurationStrategy {
    private static final int FIXED_PARALLELISM = 3;

    static {
        System.out.println("THREADS: " + FIXED_PARALLELISM);
    }

    @Override
    public ParallelExecutionConfiguration createConfiguration(final ConfigurationParameters configurationParameters) {
        return this;
    }

    @Override
    public int getParallelism() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getMinimumRunnable() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getMaxPoolSize() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getCorePoolSize() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getKeepAliveSeconds() {
        return 30;
    }
}
