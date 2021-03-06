package com.itheilv.miaosha;

import com.itheilv.miaosha.util.MybatisPlusGeneratorUtil;
import com.itheilv.miaosha.util.PropertiesFileUtil;


/**
 * @author WSQ
 * @since 2020-09-25
 */
public class Generator {

    private static final String LIKE_TABLE = "user";
    private static final String PACKAGE_NAME = "com.itheilv.miaosha";
    private static final String MODULE = "";
    private static final String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
    private static final String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
    private static final String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
    private static final String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");

    /**
     * 自动代码生成
     *
     * @param args the args
     */
    public static void main(String[] args) {
        MybatisPlusGeneratorUtil.generator(LIKE_TABLE, PACKAGE_NAME, MODULE, JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
    }

}
