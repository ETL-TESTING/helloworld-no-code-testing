package com.cherrypick;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.Scenarios;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodePackageRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@Scenarios({
		@Scenario("cherrypick/sample_test_scenario.json"),
		//@Scenario("cherrypick/sample_test_scenario2.json"),
		//@Scenario("cherrypick/sample_test_scenario3.json"),
		//@Scenario("cherrypick/sample_test_scenario4.json"),
})
@TargetEnv("configs/host.properties")
@RunWith(ZeroCodePackageRunner.class)
public class CherryPickTest {
}

