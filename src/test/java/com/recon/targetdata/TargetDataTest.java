package com.recon.targetdata;
import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("configs/target_db.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class TargetDataTest {

	@Test
	@Scenario("tests/targetdata/target_automated_test.json")
	public void testScenario() throws Exception {
	}

}
