package ma.pfe.entities;

import java.io.*;

public class TestSerializable {
    StudentId studentId = new StudentId(12l,"C12","A12");
    FileOutputStream fs = new FileOutputStream("monFicherSerializable.bin");
    ObjectOutputStream os = new ObjectOutputStream(fs);


    public TestSerializable() throws IOException {
    }
}
