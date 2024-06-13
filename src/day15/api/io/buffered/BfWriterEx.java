package day15.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BfWriterEx {

	public static void main(String[] args) {
		
		/*
		 * BufferedWriter클래스는 문자열 2바이트기반의 성능 향상 보조 스트림입니다.
		 * 빠른 출력에 사용됩니다. 
		 */
		
		//출력을 빠르게
//		Writer w = new OutputStreamWriter(System.out); //1바이트기반에 대이터를 writer타입으로 중간에서 바꿔주는 매개체
//		BufferedWriter bw = new BufferedWriter(w);	
//		bw.write("안녕하세요?");
//		bw.flush();

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello4.txt";

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(path));
			bw.write("안녕하세요?\n모두\n잠에서\n일어나");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
			}
		}
	}
}
