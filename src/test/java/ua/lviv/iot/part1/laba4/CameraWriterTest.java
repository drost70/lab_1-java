package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CameraWriterTest {

    private static final String EXPECTED_FILE_NAME = "expected.csv";
    private static final String GENERATED_FILE_NAME = "generated.csv";
    private CameraWriter cameraWriter;
    private List<Camera> cameras;

    @BeforeEach
    public void setUp() {
        cameraWriter = new CameraWriter();
        cameras = new ArrayList<>();
        
    }

    @Test
    public void testWriteToFileWithEmptyList() {
        String resultFileName = cameraWriter.writeToFile(cameras);
        Assertions.assertNull(resultFileName);
    }

    @Test
    public void testWriteToFileWithCameras() throws IOException, AssertionError {
        // Arrange
        List<Camera> cameras = new ArrayList<>();
        cameras.add(new DigitalCamera("Canon", "L23", "1.8 stm"));
        cameras.add(new DigitalCamera("Nikon", "A51", "2.43 tp"));
        cameras.add(new DigitalCamera("Sony", "PXM-45", "t4.67"));

        // Act
        String resultFileName = cameraWriter.writeToFile(cameras);

        // Assert
        Assertions.assertNotNull(resultFileName);

        File generatedFile = new File(resultFileName);
        BufferedReader generatedReader = new BufferedReader(new FileReader(generatedFile));
        List<String> generatedLines = new ArrayList<>();
        String generatedLine;
        while ((generatedLine = generatedReader.readLine()) != null) {
            generatedLines.add(generatedLine);
        }
        generatedReader.close();

        InputStream expectedStream = getClass().getClassLoader().getResourceAsStream(EXPECTED_FILE_NAME);
        if (expectedStream == null) throw new AssertionError();
        BufferedReader expectedReader = new BufferedReader(new InputStreamReader(expectedStream));
        List<String> expectedLines = new ArrayList<>();
        String expectedLine;
        while ((expectedLine = expectedReader.readLine()) != null) {
            expectedLines.add(expectedLine);
        }
        expectedReader.close();

        Assertions.assertEquals(expectedLines, generatedLines);
    }
