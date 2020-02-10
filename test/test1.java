package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;

public class test1 {

	public static void main(String[] args) throws Exception {
//		test2 t=new test2();
//		t.hashTable();
		
		DataInputStream f=new DataInputStream(
				new BufferedInputStream(
				new FileInputStream("hello.txt")));
		
		int num=f.read();
		System.out.println(num);
		DataOutputStream f2=new DataOutputStream(
				new BufferedOutputStream(
				new FileOutputStream("hello.txt")));
		//int number=f2.write();
		
		BufferedReader bf=new BufferedReader(
				new InputStreamReader(
						new FileInputStream("hello.txt")));
		String read=bf.readLine();
		System.out.println(read);
		
		BufferedReader bf2=new BufferedReader(
				new FileReader("hello.txt"));
		String read2=bf2.readLine();
		System.out.println(read2);
		//InputStream in=new FileInputStream();
		//char text=(char)in.read();
		//System.out.println(in.read());
		
		

	}
	public void print(){
		System.out.println("A");
	}

}
class test2 extends test1{
	public void print(){
		System.out.println("B");
	}
	
	public void hashTable() {
//		Hashtable h=new Hashtable();
//		h.put("age", 23);
//		h.put("name","hashika");
//		//h.clear();
//		System.out.print(h.contains(23));
//		
//		System.out.print(h.get("age"));
//		
//		Vector v=new Vector(3,2);
//		v.addElement(2);
//		v.addElement(4);
//		
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		v.insertElementAt("hashika",2);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
		
		
		
	}
}
//	class Queue extends Vector{
//		
////		public final void add(Object object) {
////			addElement(object);
////		}
////		public final Object peek() {
////			return firstElement();
////		}
////		public final Object next() {
////			Object result=firstElement();
////			removeElement(result);
////			return result;
////		}
////	}
//}
