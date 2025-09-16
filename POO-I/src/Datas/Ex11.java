package Datas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex11 {
	public static void main(String[] args) {
		DateTimeFormatter dtfDataBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt = LocalDate.parse("24/04/1978", dtfDataBrasil);
		System.out.println(dt);
	}
}
