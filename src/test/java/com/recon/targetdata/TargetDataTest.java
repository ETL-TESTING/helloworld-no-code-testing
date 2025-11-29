package com.recon.targetdata;
import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("configs/database.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class TargetDataTest {

	@Test
	@Scenario("tests/reconciliation/reconciliation_automated_test.json")
	public void testDbCsvLoadWithHeaders() throws Exception {
	}

	@Test
	@Scenario("tests_yaml/reconciliation_automated_test.yml")
	public void testDbCsvLoadWithHeaders_YAML() throws Exception {
	}

}
