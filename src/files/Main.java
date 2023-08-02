package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreem();
        OutputStreem("resource/text.txt");
        BufferWriter();
        BufferReader();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.err.println("Error!!!");
        Path path = Path.of("resource", "text.txt");
        try {
            String text = new String(Files.readAllBytes(path)) ;
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Files.write(path, List.of("Ivan", "Alex"));
        Path file = Path.of("resource", "text.txt");
        Scanner scanner1 = new Scanner(file);
        String text1 = scanner.nextLine();
        System.out.println(text1);

    }

    private static void BufferReader() {
        File file = Path.of("resource", "text.txt").toFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(file)) ) {
            //функциональный поток для чтения информации
           String text = reader
                                .lines()
                                .collect(Collectors.joining(System.lineSeparator()));
           System.out.println(text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void BufferWriter() {
        File file = Path.of("resource", "text.txt").toFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)) ) {

            writer.append("Hello, world!");
            writer.newLine();
            writer.append("!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void OutputStreem(String pathname) {
        File file = new File(pathname);
        try (FileOutputStream outputStream = new FileOutputStream(file)) {

            String text = new String("bytes");
            byte[] bytes;
            outputStream.write(text.getBytes());

            for (int i = 0; i < 10; i++) {
                outputStream.write(text.getBytes());
                outputStream.write(System.lineSeparator().getBytes()); //outputStream.write("\r".getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void InputStreem() {
        File file = new File("resource/text.txt");
        // до Java 8
        File file1 = new File(String.join(File.separator, "resource", "text.txt"));
        // После Java 8
        File file2 = Path.of("resource", "text.txt").toFile();

        System.out.println(file.getName());
        if (file.exists()) {
            System.out.println("Он существует");
        }


        try (FileInputStream inputStream = new FileInputStream(file2)) {
            //вариант 1
            byte[] bytes = inputStream.readAllBytes();

            //вариант 2 подкапотная реализация
            /*
            byte[] bytes = new byte[inputStream.available()] ;
            int ind = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1 ) {
                bytes[ind++] = currentByte;
            }
            */
            String text = new String(bytes);
            System.out.println(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } /*finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            }catch (IIOException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
    }

}

