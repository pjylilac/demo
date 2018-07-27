import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

/**
 * mq 工具类
 *
 * @author Richared
 */
public class MqUtils {


    public static Connection getConnection() throws IOException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("207.148.92.175");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/pjylilac");

        connectionFactory.setUsername("pjylilac");
        connectionFactory.setPassword("123456");

        return connectionFactory.newConnection();
    }


}
