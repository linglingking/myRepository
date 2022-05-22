package com.wjl.demo;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		FastAutoGenerator.create("jdbc:mysql://localhost:3306/wjl?useUnicode=true&characterEncoding=UTF-8&useSSL=false", "root", "123456")
				.globalConfig(builder -> {
					builder.author("wjl") // 设置作者
							.enableSwagger() // 开启 swagger 模式
							.fileOverride() // 覆盖已生成文件
							.outputDir("D:\\workspacetest\\demo\\src\\main\\java"); // 指定输出目录
				})
				.packageConfig(builder -> {
					builder.parent("com.wjl.demo") // 设置父包名
							.moduleName("system") // 设置父包模块名
							.pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\workspacetest\\demo\\src\\main\\resources")); // 设置mapperXml生成路径
				})
				.strategyConfig(builder -> {
					builder.addInclude("st_product") // 设置需要生成的表名
							.addTablePrefix("t_", "c_"); // 设置过滤表前缀
				})
				.templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
				.execute();
	}

}
