package com.cherrypick;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.Scenarios;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodePackageRunner;
import org.junit.runner.RunWith;

@Scenarios({
		@Scenario("cherrypick/sample_test_scenario.json"),

		// **** Add more scenarios below, uncomment one or more to run *** //
		//@Scenario("cherrypick/sample_test_scenario3.json"),
		//@Scenario("cherrypick/sample_test_scenario4.json"),
		// @Scenario("yaml/reconciliation_automated_test.yml"), //<-- use "source_db.properties" for this test
})
@TargetEnv("configs/host.properties")
// @TargetEnv("configs/source_db.properties")
@RunWith(ZeroCodePackageRunner.class)
public class CherryPickTest {
}

