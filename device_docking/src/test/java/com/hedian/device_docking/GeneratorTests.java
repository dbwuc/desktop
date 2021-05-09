package com.hedian.device_docking;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.hedian.constant.TableNameConstant;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GeneratorTests {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");//获取项目根路径
        gc.setOutputDir(projectPath + "/src/main/java");//生成文件的输出目录
        gc.setAuthor("HC");//作者 - 开发人员
        gc.setOpen(false);//是否打开输出目录(默认值：null)
        gc.setServiceName("%sService"); //去除前缀
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/srbsh_device_test?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&nullCatalogMeansCurrent=true&allowMultiQueries=true");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("HC@3018");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //pc.setModuleName(scanner("模块名"));
        pc.setParent("com.hedian");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        // 公共父类
        //strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");
        // 写于父类中的公共字段
        //strategy.setSuperEntityColumns("id");
        strategy.setInclude(TableNameConstant.TABLES_NAME.split(",")); //需要生成的表
        strategy.setControllerMappingHyphenStyle(true); //url驼峰命名转换
        strategy.setTablePrefix("flow_nv_special_equipment_"); //去前缀
        mpg.setStrategy(strategy);
        mpg.execute();
    }
}
