package day15.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BfReaderEx {

	public static void main(String[] args) {
		
		//빠른입력
//		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
//		System.out.print("입력해봐>");
//		String str = br.readLine(); //한줄 받기
//		System.out.println(str);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello4.txt";
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader( path ));
			//한줄씩 읽기
			String str;
			while( (str = br.readLine() ) != null ) { //더이상 읽을게 없으면 null
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}
