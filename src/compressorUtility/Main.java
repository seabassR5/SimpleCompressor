package compressorUtility;

import java.util.ArrayList;
import java.lang.System;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

import static compressorUtility.CompressorFactory.*;

class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> compressionTypes = getCompressionOptions();
        //ArrayList<Compressor> compressionStrats = new ArrayList<>();
        for(String type: compressionTypes){
            System.out.println(type);
            createCompressor(type).getFileType();
        }
        System.out.println("Enter file directory to compress: ");
        Scanner reader = new Scanner(System.in);
        String inputFile = reader.nextLine();
        System.out.println("Enter Output Format: ");
        String format = reader.nextLine();

        Path path = Paths.get(inputFile);
        CompressorFactory.createCompressor(format).write(inputFile,Files.readAllBytes(path));



        reader.close();




    }
}