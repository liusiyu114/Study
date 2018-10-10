package com.siyu.interviewquestion;

import org.apache.commons.lang3.StringUtils;

/**
 * @author siyu
 * @version V1.0
 * @Package test
 * @Class: Base
 * @Description: TODO
 * @date 2018/8/25 16:02
 */
public class Base {
    private static final String[] strs = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public String toNumber(String params){
        String ret = "";
        String param =  "";
        int paramSize = 0;
        while(params.length()>paramSize){
            param = params.substring(paramSize, paramSize+3);
            String tempStr = this.isExists(param);
            if(StringUtils.isNotBlank(tempStr)){
                ret += tempStr;
            }else{
                param = params.substring(paramSize, paramSize+4);
                tempStr = this.isExists(param);
                if(StringUtils.isNotBlank(tempStr)){
                    ret += tempStr;
                }else{
                    param = params.substring(paramSize, paramSize+5);
                    tempStr = this.isExists(param);
                    ret += tempStr;
                }
            }
            paramSize += param.length();
        }
        return ret;
    }

    public String isExists(String param){
        String ret = "";
        for(int i = 0; i<strs.length; i++){
            if(strs[i].equals(param)){
                ret = String.valueOf(i);
                break;
            }
        }
        return ret;
    }

    public String toNumber1(String params){
        String ret = "";
        String param =  "";
        while(StringUtils.isNotBlank(params)){
            param = params.substring(0, 3);
            String tempStr = this.isExists(param);
            if(StringUtils.isNotBlank(tempStr)){
                ret += tempStr;
            }else{
                param = params.substring(0, 4);
                tempStr = this.isExists(param);
                if(StringUtils.isNotBlank(tempStr)){
                    ret += tempStr;
                }else{
                    param = params.substring(0, 5);
                    tempStr = this.isExists(param);
                    ret += tempStr;
                }
            }
            params = params.substring(param.length(),params.length());
        }
        return ret;
    }
}
