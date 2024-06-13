package day15.api.io.directory;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		
		/*
		 * 자바에서는 외부경로로 폴더를 생성할 때 File클래스를 사용합니다.
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\뉴폴더";
		
		try {
			File file = new File(path);
			
			//폴더가 있는지 확인하고 생성
//			if( !file.exists() ) { //존재하면 true, 존재하지 않으면 false
//				file.mkdir();
//			} else {
//				System.out.println("폴더가 존재함");
//			}
			
			//폴더삭제
			if( file.exists() ) {
//				file.delete(); //빈폴더일때 삭제
				file.deleteOnExit(); 
				/*
				 * 	delete(): 임시 파일이나 더 이상 필요하지 않은 파일을 즉시 삭제해야 하는 경우 사용합니다.
					deleteOnExit(): 프로그램 종료 전에 파일을 삭제해야 하지만 즉시 삭제가 중요하지 않은 경우 사용합니다. 
					예를 들어, 로그 파일이나 백업 파일과 같은 경우 deleteOnExit()를 사용하는 것이 더 안전합니다.
				 */
				System.out.println("폴더삭제성공");
			} else {
				System.out.println("폴더삭제실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
