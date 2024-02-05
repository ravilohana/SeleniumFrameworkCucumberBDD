package utils;


import constants.EnvType;


import java.util.Properties;

public class ConfigLoader {

    private final Properties properties;

    private static ConfigLoader configLoader;

    String filePathStage = System.getProperty("user.dir") + "\\src\\test\\resources\\stage_config.properties";
    String filePathProd = System.getProperty("user.dir") + "\\src\\test\\resources\\prod_config.properties";

    private ConfigLoader(){
        String env = System.getProperty("env",String.valueOf(EnvType.STAGE));
        switch (EnvType.valueOf(env)){
            case PROD -> properties = PropertyUtils.propertyLoader(filePathProd);
            case STAGE -> properties = PropertyUtils.propertyLoader(filePathStage);
            default -> throw new IllegalStateException("INVALID ENV: " + env);
        }

    }

    public static ConfigLoader getInstance(){
        if(configLoader == null){
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseURL(){
        String prop = properties.getProperty("baseURL");
        if(prop !=null){
            return prop;
        }
        else {
            throw  new RuntimeException("Property baseURL is not specified at file path: " + filePathStage);
        }
    }
}
