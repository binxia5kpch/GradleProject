package com.myprogram.test.algorithm.sort;

/**
 * Created by kpc on 2017/8/2.
 * 堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        //int[] sortArr = {9,12,17,30,50,20,60,65,4,19};
        int[] sortArr = {1,9,12,17,30,50,20,60,65,4,19,3,8,2,3};
        heapSort(sortArr);
        printArr(sortArr);
    }

    private static void heapSort(int[] sortArr) {
        int len = sortArr.length;
        System.out.println("heapSort======>" + len);
        int[] tempArr = new int[len];
        //创建堆
        createHeap(sortArr,len);
        printArr(sortArr);
        //堆排序就是一个删除堆顶元素 加建堆的过程
        for(int i=len-1; i>=1; i--){  //建堆的次数，删除一个元素重新建一次堆，因为上面已经建过一次了 所以这里只需要建len-1次就行了,边界是1 所以最后范围是 1到len-1
            System.out.println("heapSort i==>" + i);
            swap(sortArr, 0, i);   //因为是数组没法像list那样移除了 所以这里将堆顶和堆底元素互换下次建堆，不要管最后一个元素就行了 这样就相当于移除了堆顶的元素
            System.out.print("交换后建堆前：");
            printArr(sortArr);
            createHeap(sortArr, i);
            printArr(sortArr);
        }
    }

    private static void createHeap(int[] sortArr,int len) {
        //int len = sortArr.length;
        //i=len/2-1 的解释--参考点数组只有3个节点的时候 只有一个非叶子节点
        for(int i=len/2-1;i>=0;i--){//建堆的过程其实是相当于调整非叶子节点的过程,从后往前调整，直到根节点调整完
            System.out.println("createHeap i== 》" + i);
            //调整的过程即为交换的过程，以小根堆为例，父节点比子节点大则需要交换
            //左子节点
            int left = sortArr[i*2+1];
            System.out.println("left="+left);
            //右节点
            int right = -1; //只支持正整数数组，如果还有负数则将数组分成两个数组排序后合并即可
            if((i*2+2)<len){
                right = sortArr[i*2+2];  //如果大于了就数组越界了
                System.out.println("right="+right);
            }
            //父节点
            int father = sortArr[i];
            System.out.println("father=" + father);
            if(left <= right || right== -1){ //right==-1 说明没有又节点 只需要判断左节点就行了
                if(father > left ) swap(sortArr,i,i*2+1); //小根堆 所以当父节点大的时候交换
            }else{
                if(father > right ) swap(sortArr,i,i*2+2);
            }
        }
    }

    private static void swap(int[] sortArr, int i, int i1) {
        int temp = sortArr[i];
        sortArr[i] = sortArr[i1];
        sortArr[i1] = temp;
    }

    private static void printArr(int[] sortArr){
        for(int i=0;i<sortArr.length;i++){
            System.out.print("==="+sortArr[i]);
        }
        System.out.println();
    }

    private static void println(String ps){
        System.out.println(ps);
    }
}
