package sec02;

import java.io.*;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {

		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		// 그림파일 경로 끌어옴 : original파일 위치 나타냄
		String targetFilePath1 = "c:/temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		// original 파일 읽기 위한 스트림 생성
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		// 데이터를 targetFile에 쓰게 됨
		
		
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		// 그림파일 경로 끌어옴
		String targetFilePath2 = "c:/temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		
		
		long nonBufferTime = copy(fis,fos);
		System.out.println("버퍼를 사용하지 않을 때 : " + nonBufferTime + "ns");
		
		
		
		long BufferTime = copy(bis,bos); 
		System.out.println("버퍼를 사용할 때 : " + BufferTime + "ns");
		 
		
		fis.close();
		fos.close();
		System.out.println();
	}
	
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data==-1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
	}
	
	

}
