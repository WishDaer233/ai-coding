package llm.models;

/**
 * 千问模型
 */
public class QWModel implements Model{

    //POST https://dashscope.aliyuncs.com/api/v1/services/aigc/text-generation/generation

    @Override
    public void sendMessage(String message, String modelName) {
        //构建与LLM的交流通道，并获取最后的返回结果
    }
}
