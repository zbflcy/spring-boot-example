package springboot.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by curry on 18-12-6.
 */
@RestController
public class HelloController {

    @Value("${spring.datasource.driver-class-name}")
    String driverclass;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;
    @Value("${spring.datasource.url}")
    String url;

    @Autowired
    JdbcTemplate jdbcTemplate;


    @GetMapping(value = "/testDatasource")
    public Map<String, Object> testDataSource() throws ClassNotFoundException, SQLException {
        Map<String, Object> map = new HashMap<>();
        Class.forName(driverclass);

        Connection connection = DriverManager.getConnection(url, username, password);
        Assert.notNull(connection);
        connection.close();


        return map;
    }


    @GetMapping(value = "/getdata")
    @ResponseBody
    public List<Map<String, Object>> getdata() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * from department");
        return maps;
    }

}
