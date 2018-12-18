package shallowclone;

/**
 * Created by sunmood on 2018/12/16.
 * 日报原型类
 */
public class DailyReport implements Cloneable {
    private String title;
    private String content;
    private Attachment attachment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public DailyReport clone(){
        Object object;

        try {
            object = super.clone();
            return (DailyReport) object;
        } catch (CloneNotSupportedException e){
            System.out.println("不支持复制！");
            return null;
        }
    }

}
