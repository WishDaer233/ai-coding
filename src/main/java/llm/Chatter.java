package llm;

/**
 * LLM聊天者
 */
public interface Chatter {

    /**
     * 聊天
     * @param message 用户发送的消息
     * @param modelKey 所选的model
     */
    void chat(String message, String modelKey);
}