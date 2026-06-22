package llm;

/**
 * 抽象聊天类
 */
public abstract class AbstractChatter implements Chatter{

    @Override
    public void chat(String message, String modelKey) {
        try {
            doChat(message, modelKey);
        }catch (Exception e){
            //此处只接收系统级别报错
        }
    }

    abstract public void doChat(String message, String modelKey);
}
