package deepclone;

import java.io.*;

/**
 * Created by sunmood on 2018/12/16.
 * 日报原型类
 */
public class DailyReport implements Serializable {
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

    /**
     * 使用序列化技术实现深克隆
     * @return
     */
    public DailyReport deepClone() throws IOException, ClassNotFoundException{
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (DailyReport) ois.readObject();
    }

}
