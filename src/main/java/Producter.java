import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;

public class Producter {
    public static final String QUEUE = "testMQ";
    public static void main(String[] args) throws IOException {


    }

    public static void oldMethod() throws IOException {
        String msg = "hello word !!";
        Connection connection = MqUtils.getConnection();
        //获取通道
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE,false,false,false,null);
        channel.basicPublish("",QUEUE,null,msg.getBytes());

        System.out.println("===send message== " + msg);

        channel.close();
        connection.close();
    }
}
