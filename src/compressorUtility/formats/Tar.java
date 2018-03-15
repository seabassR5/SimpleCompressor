package compressorUtility.formats;

import compressorUtility.Compressor;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;


public class Tar implements Compressor {
    public static String fileType = "Tar";

    @Override
    public void write(String filename, byte[] data) {
        File f = new File("tarTest.zip");
        FileOutputStream dest = new FileOutputStream( "c:/test/test.tar" );
        TarOutputStream out = new TarOutputStream( new BufferedOutputStream( dest ) );
        ZipOutputStream zipOutput = new ZipOutputStream(new FileOutputStream(f));

    }

    @Override
    public String getFileType() {
        return fileType;
    }
}
