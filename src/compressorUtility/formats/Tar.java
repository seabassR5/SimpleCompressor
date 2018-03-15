package compressorUtility.formats;

import compressorUtility.Compressor;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Tar implements Compressor {
    public static String fileType = "Tar";

    @Override
    public void write(String filename, byte[] data) throws IOException {

        TarArchiveEntry entry = new TarArchiveEntry(filename);
        entry.setSize(data.length);
        TarArchiveOutputStream tarOutput = new TarArchiveOutputStream(new FileOutputStream(new File("tarTest.tar")));
        tarOutput.putArchiveEntry(entry);
        tarOutput.write(data/*contentOfEntry*/, 0, data.length);
        tarOutput.closeArchiveEntry();
//        File f = new File("tarTest.zip");
//        FileOutputStream dest = new FileOutputStream( "c:/test/test.tar" );
//        TarOutputStream out = new TarOutputStream( new BufferedOutputStream( dest ) );
//        ZipOutputStream zipOutput = new ZipOutputStream(new FileOutputStream(f));

    }

    @Override
    public String getFileType() {
        return fileType;
    }
}
