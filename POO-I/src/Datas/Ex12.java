package Datas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex12 {
	public static void main(String[] args) {
		DateTimeFormatter dtfDataBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDate dt = LocalDate.parse("24/04/1978 15:01:27", dtfDataBrasil);
		System.out.println(dt);
	}
}
