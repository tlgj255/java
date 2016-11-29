import java.util.Scanner;

import java.io.BufferedInputStream;
import java.net.URL;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class BoxOffice {
	public static void main(String[] args) {
	   // TODO Auto-generated method stub
	   try {
	       new BoxOffice();
	   } catch (Exception e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	   }
	}
public BoxOffice() throws Exception{
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonobject = (JSONObject)jsonparser.parse(readUrl());
    JSONObject json =  (JSONObject) jsonobject.get("boxOfficeResult");
    JSONArray array = (JSONArray)json.get("dailyBoxOfficeList");
    for(int i = 0 ; i < array.size(); i++){      
        JSONObject entity = (JSONObject)array.get(i);
        String movieNm = (String) entity.get("movieNm");
        String showCnt = (String) entity.get("audiCnt");
        System.out.println(movieNm+" "+showCnt);
    }    
}
private static String readUrl() throws Exception {
	Scanner sc = new Scanner(System.in);
	int a;
	System.out.println("찾고 싶은 날짜를 아래와 같은 형식으로 입력해주세요\n(yyyymmdd)");
	while(true){
		a = sc.nextInt();
		if(a>20030101){
			break;
		}
		System.out.println("다시 입력해주세요\n(yyyymmdd");
	}
   BufferedInputStream reader = null;
   try {
       URL url = new URL(
               "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/"
               + "searchDailyBoxOfficeList.json"
               + "?key=e6c7de84e2ebfdd787338fa4e579afd4"
               + "&targetDt="+a);
       reader = new BufferedInputStream(url.openStream());
       StringBuffer buffer = new StringBuffer();
       int i;
       byte[] b = new byte[4096];
       while( (i = reader.read(b)) != -1){
         buffer.append(new String(b, 0, i));
       }
       return buffer.toString();
   } finally {
       if (reader != null)
           reader.close();
   }
}
}
