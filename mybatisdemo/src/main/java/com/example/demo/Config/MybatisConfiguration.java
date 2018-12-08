package com.example.demo.Config;

import com.example.demo.Mapper.EmployeeMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by curry on 18-12-8.
 */
@Configuration
@MapperScan(basePackageClasses = {EmployeeMapper.class})
public class MybatisConfiguration {

    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }

}
