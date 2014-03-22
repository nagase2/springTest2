package test5;

/*
 * Dummy implementation of logger.
 */

public class Logger {

	private LogWriter consoleWriter1;
	private LogWriter fileWriter;

	public void setConsoleWriter(LogWriter writer) {
		this.consoleWriter1 = writer;
	}

	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter1.write(text);
	}

}
