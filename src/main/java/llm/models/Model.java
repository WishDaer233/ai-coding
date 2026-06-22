package llm.models;

public interface Model {

    //发送message
    void sendMessage(String message, String modelName);
}
