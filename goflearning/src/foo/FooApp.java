package foo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.TreeMap;

import factory.AFactory;
import factory.CommonToolFactory;
import factory.EnhToolFactory;
import foo.model.FooModel;

public class FooApp {

	public static byte getmiddle(byte a[], byte lo, byte hi)
	{
		byte key = a[lo];
		while(lo < hi)
		{
			while(a[hi] >= key && hi > lo)
			{
				hi --;
			}
			a[lo] = a[hi];
			while(a[lo] <= key && hi > lo)
			{
				lo ++;
			}
			a[hi] = key;
		}
		return hi;
	}
	
	public  static void qsort(byte a[], byte lo, byte hi) {
		if(lo >= hi) return;
		
		byte index = getmiddle(a,lo,hi);
		qsort(a,lo,(byte)(index-1));
		qsort(a,(byte)(index+1),hi);
		
	}
	
	public static void popsort(byte[] a)
	{
		int len = a.length-1;
		for ( int i = 0; i < len ; i ++)
		{
			for (int j = 0; j < len - i ; j++)
			{
				if(a[j] > a [j+1])
				{					
					a[j] = (byte) (a[j] + a [j+1]);
					a[j+1] = (byte) (a[j] -a [j+1]);
					a[j]  = (byte) (a[j] -a [j+1]);
				}
			}
		}
		for(int i=0;i<a.length;i++)  
	        System.out.println(a[i]);  
		
	}
	
	public static void main(String[] args) throws Throwable {
		AFactory curFac = new CommonToolFactory();
		curFac.CreateProductA();
		curFac.CreateProductB();
		
		curFac = new EnhToolFactory();
		curFac.CreateProductA();
		curFac.CreateProductB();
	}

}
