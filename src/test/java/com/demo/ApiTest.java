package com.demo;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("configs/host.properties") //<-------- Host configurations
@RunWith(ZeroCodeUnitRunner.class)   // <---------Runner
public class ApiTest {

    @Test
    @Scenario("demo/http/http_api_automated_test.json") // <--------- Test scenario
    public void testGet() throws Exception {
    }
}

