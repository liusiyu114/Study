package com.siyu.interviewquestion;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*已知:zero, one, two, three, four, five, six, seven, eight, nine分别对应0, 1, 2, 3, 4, 5, 6, 7, 8, 9对一段
        只含有这几种字符串的字符串进行转换.如:
        输入:nineeightsevensixfivefourthreetwoonezero
        输出:987654321
        数字的先后顺序不考虑。

解题思路:第一、怎么存储常量字符串和数据对应关系。 (string[], list, map)
        第二、如何分割对于输入的字符串，获得出有数字对应的子字符串。
        第三、 如何对子字符串进行匹配，寻找下一个。
reference:https://blog.csdn.net/sxb0841901116/article/details/20875915, https://www.cnblogs.com/learnapi/p/8551358.html,
        https://blog.csdn.net/taozoule/article/details/71108164
*/


public class Main12 {
    private static final List<String> list = new ArrayList<String>();
    private static String[] strs = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static Map<String, String> map = new HashMap<>();
    static {
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");

        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
    }

    public static void main(String[] args) {

        Main12 m = new Main12();
        String param = "eightninefivezero";
        System.out.println(m.toNumber(param));

        String param1 = "zerosixninefivetwo";
        System.out.println(m.toNumber1(param1));

        String param2 = "eightninefivezerozerosixninefivetwo";
        System.out.println(m.toNumber2(param2));
    }

    public String toNumber(String param) {
        String result = "";//返回值
        String str = "";
        int paramSize  = 0;
        while (param.length() > paramSize) {
            str = param.substring(paramSize, paramSize + 3);
            if (list.contains(str)) {
                result += String.valueOf(list.indexOf(str));
            } else {
                str = param.substring(paramSize, paramSize + 4);
                if(list.contains(str)){
                    result += list.indexOf(str);
                }else{
                    str = param.substring(paramSize, paramSize + 5);
                    result += String.valueOf(list.indexOf(str));
                }
            }
            paramSize += str.length();
        }
        return result;
    }

    public String toNumber1(String param){
        String ret = "";
        String str = "";
        int paramSize = 0;
        while (param.length() > paramSize){
            str = param.substring(paramSize, paramSize+3);
            String temp = this.getIndex(str);
            if(StringUtils.isNotBlank(temp)){
                ret += temp;
            }else{
                str = param.substring(paramSize, paramSize+4);
                temp = this.getIndex(str);
                if(StringUtils.isNotBlank(temp)){
                    ret += temp;
                }else{
                    str = param.substring(paramSize, paramSize+5);
                    temp = this.getIndex(str);
                    ret += temp;
                }
            }
            paramSize += str.length();
        }
        return ret;
    }

    public String getIndex(String param){
        String ret = "";
        for(int i = 0; i<strs.length; i++){
            if(strs[i].equals(param)){
                ret = String.valueOf(i);
                break;
            }
        }
        return ret;
    }

    public String toNumber2(String param){
        String ret = "";
        String str = "";
        int paramSize = 0;
        while(param.length() > paramSize){
            str = param.substring(paramSize, paramSize+3);
            if(map.containsKey(str)){
                ret += map.get(str);
            }else{
                str = param.substring(paramSize, paramSize+4);
                if(map.containsKey(str)){
                    ret += map.get(str);
                }else{
                    str = param.substring(paramSize, paramSize+5);
                    ret += map.get(str);
                }
            }
            paramSize += str.length();
        }
        return ret;
    }

}
