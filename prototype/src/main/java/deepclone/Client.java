package deepclone;

import java.io.IOException;

/**
 * Created by sunmood on 2018/12/16.
 * 客户端测试类，深克隆
 */
public class Client {
    public static void main(String[] args) {
        DailyReport dailyReport = new DailyReport();
        dailyReport.setContent("周一日报内容");
        dailyReport.setTitle("周一日报");
        dailyReport.setAttachment(new Attachment());

        System.out.println("************日报***********");
        System.out.println("标题：" + dailyReport.getTitle());
        System.out.println("内容：" + dailyReport.getContent());
        System.out.println("附件：" + dailyReport.getAttachment());
        System.out.println("---------------------------");

        DailyReport dailyReportNew = null;
        try {
            dailyReportNew = dailyReport.deepClone();
        } catch (Exception e) {
            System.out.println("克隆失败！");
        }
        dailyReportNew.setTitle("周二日报");

        System.out.println("************日报***********");
        System.out.println("标题：" + dailyReportNew.getTitle());
        System.out.println("内容：" + dailyReportNew.getContent());
        System.out.println("附件：" + dailyReportNew.getAttachment());
        System.out.println("---------------------------");

        System.out.println(dailyReport == dailyReportNew);
        System.out.println(dailyReport.getContent() == dailyReportNew.getContent());
        System.out.println(dailyReport.getTitle() == dailyReportNew.getTitle());
        System.out.println(dailyReport.getAttachment() == dailyReportNew.getAttachment());
    }
}
