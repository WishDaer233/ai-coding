package llm.models;

import java.util.HashMap;
import java.util.Map;

/**
 * 模型管理器
 */
public class ModelManager {

    private static volatile ModelManager instance;

    //模型map
    private final Map<String, Model> modelMap = new HashMap<>();

    public static ModelManager getInstance(){
        if(instance == null){
            synchronized (ModelManager.class) {
                if(instance == null) {
                    instance = new ModelManager();
                }
            }
        }
        return instance;
    }

    //与model进行对话
    public String chatWithModel(String message, String modelKey){
        //对modelKey进行处理，提取出模型数据
        String[] modelInfo = handleModelKey(modelKey);

        //获取对应模型
        Model model = getModel(modelInfo[0]);

        //与模型进行真正的交流
        model.sendMessage(message,modelInfo[1]);

        return "";
    }

    //根据模型信息获取对应模型
    private Model getModel(String modelType){
        return modelMap.get(modelType);
    }

    //处理模型key
    private String[] handleModelKey(String modelKey){
        return new String[]{};
    }
}
