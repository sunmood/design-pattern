/**
 * Created by sunmood on 2018/12/16.
 * 客户端测试类，浅克隆
 */
public class Client {
    public static void main(String[] args) {
        DailyReport dailyReport = new DailyReport();
        dailyReport.setContent("周一日报内容");
        dailyReport.setTitle("周一日报");

        System.out.println("************日报***********");
        System.out.println("标题：" + dailyReport.getTitle());
        System.out.println("内容：" + dailyReport.getContent());
        System.out.println("附件：" + dailyReport.getAttachment());
        System.out.println("---------------------------");

        DailyReport dailyReportNew;
        dailyReportNew = dailyReport.clone();
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
