

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] mass = {"A a", "B b", "C c", "D d", "E e", "F f",
                         "G g", "H h", "I i", "J j", "K k", "L l",
                          "M m", "N n", "O o", "P p", "Q q", "R r",
                        "S s", "T t", "U u", "V v", "W w", "X x",
                        "Y y", "Z z"};
        int [] mass1= {1,2,3,4,5,6,7,8,9,0};

        StringBuilder sb = new StringBuilder();

        try (FileWriter fileWriter=new FileWriter("alphabet.txt")){
            for (int i = 0; i < mass.length; i++) {
                fileWriter.write(mass[i]+"\n");
            }
            for (int i = 0; i < mass1.length; i++) {
               fileWriter.write(mass1[i]+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fileReader= new FileReader("alphabet.txt")) {
            Scanner scanner=new Scanner(fileReader);
            int i = 0;
            while (scanner.hasNext()){
                i++;
                System.out.println(i+":"+scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}