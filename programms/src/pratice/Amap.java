package pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class Amap {

	public static void main(String[] args) {
Map<String,Integer> s=new HashMap<>();
s.put("hello",123);
s.put("goat", 547);
s.put("bannana",55);
s.put("cacho", 76);
s.put(" ",4 );
System.out.println(s.get("hello"));
System.out.println(s);
System.out.println(s.containsKey("bannana"));
System.out.println(s.containsValue(76));
s.replace("hello",34);
System.out.println(s);
s.remove("goat");
System.out.println(s);
System.out.println(s.keySet());
System.out.println(s.values());
System.out.println(s.entrySet());
Map<String,Integer> d1=new TreeMap<>(s);
for(Map.Entry<String,Integer> al:d1.entrySet())
{
	System.out.println(al.getKey()+" "+ al.getValue());
}


	}


}
