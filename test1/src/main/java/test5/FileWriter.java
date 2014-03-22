package test5;

public class FileWriter implements LogWriter {
	
	FileWriter(String a){
		
	}
	FileWriter(){
		System.out.println("const");
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void write(String text) {
		// Write to a file here.
		// Dummy implementation
		System.out.println("Write to file: " + text);
		
	}

}
