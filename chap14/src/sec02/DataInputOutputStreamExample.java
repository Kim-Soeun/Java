package sec02;

import java.io.*;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("c:/temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		// 바이트 기반 출력 스트림을 생성하고 DataOutputStream 보조 스트림 연결
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		// 기본 타입값 출력
		
		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		
		FileInputStream fis = new FileInputStream("c:/temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		// 바이트 기반 입력 스트림을 생성하고 DataInputStream 보조 스트림 연결
		
		for(int i=0; i<2; i++) {
			// 기본 타입값 읽기
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close();
		
	}

}
