package my.util;
import java.util.*;
public class Common{
	//int型配列をシャッフルするメソッド
	public static void arrShuffle(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index=new Random().nextInt(arr.length-i);
			int temp=arr[index];
			arr[index]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	public static int[] arrClone(int[] arr){
		//配列のクローンを返却する
		int[] aClone=new int[arr.length];
		for(int i=0;i<aClone.length;i++){
			aClone[i]=arr[i];
		}
		return aClone;
	}
	public static void arrSort(int[] arr){
		//配列を昇順に並び替える
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void arrSort(int[] arr,boolean isDesc){
		//第二引数でtrueが渡されると配列を昇順に並び替える
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(isDesc=true){
					if(arr[i]<arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	}
	public static int[] arrRandomRange(int min,int max,int count){
		//要素数と指定範囲を受け取り、指定範囲の乱数で埋め尽くした配列を返す
		int[] nums=new int[count];
		for(int i=0;i<nums.length;i++){
				nums[i]=new Random().nextInt(max*2+1)+min;
		}
		return nums;
	}
}
