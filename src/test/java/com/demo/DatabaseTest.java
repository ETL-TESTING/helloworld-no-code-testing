package com.demo;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("configs/staging_db.properties") //<-------- Host configurations
@RunWith(ZeroCodeUnitRunner.class)   // <---------Runner
public class DatabaseTest {

    @Test
    @Scenario("demo/database/db_automated_test.json") // <--------- Test scenario
    public void testDemo() throws Exception {
    }
}

