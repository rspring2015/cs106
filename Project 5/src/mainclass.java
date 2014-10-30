
import java.io.*;
import java.util.*;

public class mainclass {
	public static void main(String[] args) throws FileNotFoundException {
		Average a = new Average();
		a.load("src/swimtimes");
		a.analyze();
	}
}