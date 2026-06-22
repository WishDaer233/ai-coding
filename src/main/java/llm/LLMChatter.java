package llm;

import llm.models.ModelManager;

/**
 * 对外接口
 */
public class LLMChatter extends AbstractChatter{

    private ModelManager modelManager;

    public LLMChatter(){
        this.modelManager = ModelManager.getInstance();
    }

    @Override
    public void doChat(String message, String modelKey) {
        //对输入的message进行添加系统级提示词
        preHandle(message);

        String chatResult = this.modelManager.chatWithModel(message, modelKey);

        //对输出结果进行包装整理
        postHandle(chatResult);
    }

    //前置处理
    private void preHandle(String message){

    }

    //后置处理
    private void postHandle(String chatResult){

    }
}
