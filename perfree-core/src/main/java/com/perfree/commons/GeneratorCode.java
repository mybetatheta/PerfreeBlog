package com.perfree.commons;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据数据库表信息一键生成mapperXml/mapper接口/model实体类代码
 */
public class GeneratorCode {
    public static void main(String[] args) {
        // 数据库连接信息配置
        FastAutoGenerator fastAutoGenerator = FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/perfree?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                "root", "215607..");

        // 设置作者名/是否开启Swagger/输出路径
        fastAutoGenerator.globalConfig(builder -> {
                builder.author("Perfree").enableSwagger().outputDir("D://genCode").dateType(DateType.ONLY_DATE);
        });

        // 设置生成的代码信息
        Map<OutputFile, String> pathInfo = new HashMap<>();
        pathInfo.put(OutputFile.xml, System.getProperty("user.dir") + "/perfree-web/src/main/resources/mapper");
        pathInfo.put(OutputFile.mapper, System.getProperty("user.dir") + "/perfree-web/src/main/java/com/perfree/mapper");
        pathInfo.put(OutputFile.entity, System.getProperty("user.dir") + "/perfree-core/src/main/java/com/perfree/model");
        pathInfo.put(OutputFile.service,  System.getProperty("user.dir") + "/perfree-core/src/main/java/com/perfree/service");
        pathInfo.put(OutputFile.serviceImpl, System.getProperty("user.dir") + "/perfree-web/src/main/java/com/perfree/service/impl");
        fastAutoGenerator.packageConfig(builder -> {
                builder.parent("com.perfree").xml("mapper").entity("model").mapper("mapper").service("service").serviceImpl("service.impl").pathInfo(pathInfo).build();
        });

        // 设置要生成哪些表,增加addInclude即可,如果全部生成,则删除addInclude
        fastAutoGenerator.strategyConfig(builder -> {
                builder.addTablePrefix("p_");
        });

        fastAutoGenerator.templateConfig(builder -> {
            builder.disable(TemplateType.CONTROLLER)
                    .build();
        });

        fastAutoGenerator.strategyConfig(builder -> {
            builder.serviceBuilder().formatServiceFileName("%sService").formatServiceImplFileName("%sServiceImpl").build();
        });

        fastAutoGenerator.templateEngine(new FreemarkerTemplateEngine()).execute();
    }
}
