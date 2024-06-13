package day13.api.lang.system;

import java.util.Properties;

public class SystemEx01 {

	public static void main(String[] args) {
		
		//시스템클래스는 static메서드로 전부 정의되어 있음
		//System.exit(0); //프로그램 종료
		//System.out.println("모지!?");
		
		Properties p = System.getProperties(); //운영체제 관련된 내용들을 얻을 수 있음.
		System.out.println(p);
		System.out.println();
		/*
		 * {java.specification.version=17, sun.cpu.isalist=amd64, sun.jnu.encoding=MS949, java.class.path=, 
		 * java.vm.vendor=Eclipse Adoptium, sun.arch.data.model=64, user.variant=, 
		 * java.vendor.url=https://adoptium.net/, java.vm.specification.version=17, os.name=Windows 11, 
		 * sun.java.launcher=SUN_STANDARD, user.country=KR, 
		 * sun.boot.library.path=C:\Users\ user\Desktop\course\java\eclipse\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.10.v20240120-1143\jre\bin, 
		 * sun.java.command=JavaAPI/day13.api.lang.system.SystemEx01, jdk.debug=release, sun.cpu.endian=little, 
		 * user.home=C:\Users\ user, user.language=ko, java.specification.vendor=Oracle Corporation, 
		 * jdk.module.path=C:\Users\ user\Desktop\course\java\workspace\JavaAPI\bin, java.version.date=2024-01-16, 
		 * java.home=C:\Users\ user\Desktop\course\java\eclipse\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.10.v20240120-1143\jre, 
		 * file.separator=\, java.vm.compressedOopsMode=Zero based, line.separator=
			, java.vm.specification.vendor=Oracle Corporation, java.specification.name=Java Platform API Specification, 
			jdk.module.main.class=day13.api.lang.system.SystemEx01, jdk.module.main=JavaAPI, user.script=, 
			sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.runtime.version=17.0.10+7, user.name=user, 
			stdout.encoding=UTF-8, path.separator=;, os.version=10.0, java.runtime.name=OpenJDK Runtime Environment, 
			file.encoding=UTF-8, java.vm.name=OpenJDK 64-Bit Server VM, java.vendor.version=Temurin-17.0.10+7, 
			java.vendor.url.bug=https://github.com/adoptium/adoptium-support/issues, 
			java.io.tmpdir=C:\Users\ user\AppData\Local\Temp\, java.version=17.0.10, 
			user.dir=C:\Users\ user\Desktop\course\java\workspace\JavaAPI, os.arch=amd64, 
			java.vm.specification.name=Java Virtual Machine Specification, sun.os.patch.level=, native.encoding=MS949, 
			java.library.path=C:\Users\ user\Desktop\course\java\eclipse\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.10.v20240120-1143\jre\bin;C:\windows\Sun\Java\bin;C:\windows\system32;C:\windows;C:/Users/user/Desktop/course/java/eclipse//plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.10.v20240120-1143/jre/bin/server;C:/Users/user/Desktop/course/java/eclipse//plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.10.v20240120-1143/jre/bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\windows\System32\OpenSSH\;C:\Program Files\Bandizip\;C:\Users\ user\AppData\Local\Microsoft\WindowsApps;C:\Users\ user\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\ user\Desktop\course\java\eclipse;;., 
			java.vm.info=mixed mode, stderr.encoding=UTF-8, java.vendor=Eclipse Adoptium, java.vm.version=17.0.10+7, 
			sun.io.unicode.encoding=UnicodeLittle, java.class.version=61.0}
		 */
		

		long start = System.currentTimeMillis();
		//프로그램 코드~
		String str = "";
		for(long i = 1; i <= 100000L; i++ ) str += "A";
		//~프로그램 코드
		long end = System.currentTimeMillis();
		System.out.println(start + "밀리초");
		System.out.println(end + "밀리초");
		System.out.println("소요시간:" + (end - start) * 0.001 ); //몇초걸림?
		
		
	}
}
