package compressorUtility.formats;

import compressorUtility.Compressor;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static org.apache.commons.compress.archivers.ArchiveEntry.SIZE_UNKNOWN;

public class ZIP implements Compressor {
    public static String fileType = "GZIP";

    @Override
    public void write(String filename, byte[] data) throws IOException {
        StringBuilder sb = new StringBuilder();

        File f = new File("Test.zip");
        ZipOutputStream zipOutput = new ZipOutputStream(new FileOutputStream(f));
        ZipEntry e = new ZipEntry(filename);
        zipOutput.putNextEntry(e);
        zipOutput.write(data, 0, data.length);
        zipOutput.close();


        //        ZipArchiveOutputStream zipOutput = new ZipArchiveOutputStream(new File(filename));
//        ZipArchiveEntry entry = new ZipArchiveEntry(filename);
//        System.out.println(data.length);
//        entry.setSize(data.length);
//
//        zipOutput.putArchiveEntry(entry);
//        zipOutput.write(data);
//        zipOutput.closeArchiveEntry();
    }

    @Override
    public String getFileType() {
        return fileType;
    }

}
