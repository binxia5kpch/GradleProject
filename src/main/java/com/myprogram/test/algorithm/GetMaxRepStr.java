package com.myprogram.test.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/2.
 */
public class GetMaxRepStr {
    public static void main(String[] args) {
        String str = "abcabcaba";
        System.out.printf("getMaxRepStr="+getMaxRepStr(str));
    }

    public static List<String> getMaxRepStr(String input){
        int len = input.length();
        Map<String,Integer> subStrMap = new HashMap<String,Integer>();
        int maxRepLen = 0;
        for(int i=0;i<len;i++){
            for(int j=i+2;j<len;j++){  //只需要算一半的字符串就可以了，因为是用截取的字符串去匹配整个字符串，所以只要前一半没有就肯定后一半也不会有了
                if((j-i)>len/2){ //字串大于1/2的字符创长度的时候不可能出现重复的了
                    break;
                }
                String subStr = input.substring(i, j);
                System.out.println( "subStr="+subStr);
                int count = getSubStrCount(input,subStr);
                System.out.println( "subCount="+ count);
                if(count>1){
                    if(maxRepLen<count*subStr.length()) maxRepLen = count*subStr.length();
                    subStrMap.put(subStr,count*subStr.length());
                }
            }
        }
        System.out.println("subStrMap = "+subStrMap) ;
        return getMaxRepStrFromMap(subStrMap,maxRepLen);
    }

    public static int getSubStrCount(String input,String subStr){
        int index = input.indexOf(subStr);
        System.out.println("index one="+index) ;
        int count = 0;
        while(index != -1){
            count++;
            index = input.indexOf(subStr,index+subStr.length());
            System.out.println("index while="+index);
        }
        return count;
    }

    public static List<String> getMaxRepStrFromMap(Map<String,Integer> subStrMap,int maxRepLen){
        List<String> backList = new ArrayList<String>();
        for(String key:subStrMap.keySet()){
            if(subStrMap.get(key) == maxRepLen) backList.add(key);
        }
        return backList;
    }
}
