package compressorUtility.formats;

import compressorUtility.Compressor;

import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Tar implements Compressor {
    public static String fileType = "Tar";

    @Override
    public void write(String filename, byte[] data) {
        File f = new File("tarTest.zip");
        FileOutputStream dest = new FileOutputStream( "c:/test/test.tar" );
        TarOutputStream out = new TarOutputStream( new BufferedOutputStream( dest ) );
        ZipOutputStream zipOutput = new ZipOutputStream(new FileOutputStream(f));
        ZipEntry e = new ZipEntry(filename);
        zipOutput.putNextEntry(e);
        zipOutput.write(data, 0, data.length);
        zipOutput.close();

    }

    @Override
    public String getFileType() {
        return fileType;
    }
}
