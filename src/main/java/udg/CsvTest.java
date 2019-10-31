package udg;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.SCPClient;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by wdy on 2018/3/12.
 */
public class CsvTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("任务开始");

                String ip = "10.159.42.10";
                int port = 8080;
                String username = "terminus";
                String passowrd = "Duandian@123";
                Connection conn = new Connection(ip, port);
                try {
                    conn.connect();
                    boolean isAuthed = conn.authenticateWithPassword(username, passowrd);
                    SCPClient scpClient = conn.createSCPClient();
                    File file = new File("/home/terminus/....down");
                    while (file.exists()) {
                        scpClient.get("/home/terminus/yin.csv", "/Users/wdy");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 参数：1、任务体 2、首次执行的延时时间
        //      3、任务执行间隔 4、间隔时间单位
        service.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.DAYS);
    }

}



