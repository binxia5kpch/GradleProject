package com.myprogram.test.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kpc on 2017/8/2.
 *
 *   小明是阿里巴巴的质量工程师，他每天的核心工作就是保障所负责系统的线上产品质量和工程师的代码质量。他在工作中发现，开发同学的代码经常会出现相互拷贝或者自我拷贝的情况，
     这种重复（限定2个字母及以上才为重复）情况不符合编码DRY（Don’t+Repeat+Yourself）原则。
     所以小明需要找到哪段代码重复程度（重复的字符串*重复次数）最高。比如有一段代码为：abcabcabab。
     重复的大于等于2的字符串有：ab、bc、ca、abc、bca、cab，对应的重复次数分别为4，2，2，2，2，2，。重复程度分别为：2*4，2*2，2*2，3*2，3*2，3*2。重复程度最大的即8，对应的字符串为ab。
     你是否可以帮小明，通过代码来帮他实现这一目标？
     输入描述
     输入数据包含1行，为一段字符串（仅为可见英文字符，如数字、字母、符号，不考虑中文、换行、空格、Tab等）.长度在4到2000之间。
     输出描述
     输出重复程度最大的字符串。如果有并列第一的情况，请换行按出现的先后顺序，全部输出所有重复字符串。
     输入样例
     abcabcabab
     输出样例
     ab

 */
public class GetMaxRepStr {
    public static void main(String[] args) {
        String str = "abcabcabab";
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
