//.java���ļ�
package Shiyan;
import java.io.*;
public class Zy {

	public static void main(String[] args) {
		File f = new File("D:/java");
		ff(f);
	}
	public static void ff(File f){
		if(f.isDirectory()){//���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼
			File[] fi = f.listFiles();//����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���
			for(File fq:fi){
				ff(fq);
			}
		}else if(f.getName().endsWith("java")){
			System.out.println(f.getAbsolutePath());// ���ش˳���·�����ľ���·�����ַ�����
		}
	}

}
