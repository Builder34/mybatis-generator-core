package org;

import org.junit.Test;
import org.mybatis.generator.api.ShellRunner;

public class GeneratorTest {

	@Test
	public void generatorTest(){
		/**
		 * 查看方法可以知道"-configfile"为接配置文件，"-overwrite"为是否覆盖相同的生成文件
		 * */
		ShellRunner.main(new String[]{"-configfile","F:\\Workspaces\\Eclipse-EE\\mybatis-generator-core\\mybatis-generator-config.xml","-overwrite"}) ;
	}
}
