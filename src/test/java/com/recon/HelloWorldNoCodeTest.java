package com.recon;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
@TargetEnv("configs/host.properties") //<-------- Host configurations
@RunWith(ZeroCodeUnitRunner.class)   // <---------Runner
public class HelloWorldNoCodeTest {

    @Test
    @Scenario("helloworld/hello_world_scenario.json") // <--------- Test scenario
    public void testGet() throws Exception {
    }
}

