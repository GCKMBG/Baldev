import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.*;
import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.lang.*;
import java.util.*;
import java.beans.Visibility;

public class ApiRead{
  public static void main(String[] args) {
    try {
      URL url=new URL("https://api.thingspeak.com/channels/875453/feeds.json?api_key=1DSQ7R1XTT1OK0Z1&results=20");
      URLConnection con= url.openConnection(); 
      HttpURLConnection dat=(HttpURLConnection) url.openConnection();
      dat.setRequestMethod("GET");
      InputStreamReader in=new InputStreamReader(dat.getInputStream());
            Scanner sc=new Scanner(in);
      String st=""; 
      while(sc.hasNextLine()){
        st+=sc.nextLine();         
      }
      sc.close();         
     JSONParser pas=new JSONParser();
        JSONObject obj1=(JSONObject) pas.parse(st);
        JSONObject obj2=(JSONObject) obj1.get("channel");
        JSONArray obj3=(JSONArray) obj1.get("feeds"); 
        File  f=new File("jsondata.text");
        f.createNewFile(); 
        FileWriter w=new FileWriter("jsondata.text",false);     
       w.write("id is = "+obj2.get("id"));
       System.out.println("\n");
       w.write("\n Name is ="+obj2.get("name"));
       System.out.println("\n");
       w.write("\n Field1 is = "+obj2.get("field1")); 
       System.out.println("\n");     
  
 for(int i=0;i<obj3.size();i++){
  JSONObject obj4=(JSONObject) obj3.get(i);
  w.write( "\n Field1 is = "+obj4.get("field1")); 
      
 }
      
 w.close();    
    } catch (Exception e) {
      // TODO: handle exception
    }
    
  }
}
