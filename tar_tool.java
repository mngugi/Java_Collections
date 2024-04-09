import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

public class ArchiveUtility {

    // Create a .tar archive
    public static void createTarArchive(String archiveName, String... files) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(archiveName);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             TarOutputStream tos = new TarOutputStream(bos)) {
            for (String file : files) {
                Path filePath = Paths.get(file);
                TarEntry entry = new TarEntry(filePath.toFile(), filePath.getFileName().toString());
                tos.putNextEntry(entry);
                Files.copy(filePath, tos);
                tos.closeEntry();
            }
        }
    }

    // Create a .tar.gz archive
    public static void createTarGzArchive(String archiveName, String... files) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(archiveName);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             GZIPOutputStream gzos = new GZIPOutputStream(bos);
             TarOutputStream tos = new TarOutputStream(gzos)) {
            for (String file : files) {
                Path filePath = Paths.get(file);
                TarEntry entry = new TarEntry(filePath.toFile(), filePath.getFileName().toString());
                tos.putNextEntry(entry);
                Files.copy(filePath, tos);
                tos.closeEntry();
            }
        }
    }

    // Create a .tar.bz2 archive
    public static void createTarBz2Archive(String archiveName, String... files) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(archiveName);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             BZip2CompressorOutputStream bz2os = new BZip2CompressorOutputStream(bos);
             TarOutputStream tos = new TarOutputStream(bz2os)) {
            for (String file : files) {
                Path filePath = Paths.get(file);
                TarEntry entry = new TarEntry(filePath.toFile(), filePath.getFileName().toString());
                tos.putNextEntry(entry);
                Files.copy(filePath, tos);
                tos.closeEntry();
            }
        }
    }

    // Extract a .tar archive
    public static void extractTarArchive(String archiveName, String targetDirectory) throws IOException {
        try (FileInputStream fis = new FileInputStream(archiveName);
             BufferedInputStream bis = new BufferedInputStream(fis);
             TarInputStream tis = new TarInputStream(bis)) {
            TarEntry entry;
            while ((entry = tis.getNextEntry()) != null) {
                Path filePath = Paths.get(targetDirectory, entry.getName());
                Files.createDirectories(filePath.getParent());
                Files.copy(tis, filePath, StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }

    // Extract a .tar.gz archive
    public static void extractTarGzArchive(String archiveName, String targetDirectory) throws IOException {
        try (FileInputStream fis = new FileInputStream(archiveName);
             BufferedInputStream bis = new BufferedInputStream(fis);
             GzipCompressorInputStream gzis = new GzipCompressorInputStream(bis);
             TarInputStream tis = new TarInputStream(gzis)) {
            TarEntry entry;
            while ((entry = tis.getNextEntry()) != null) {
                Path filePath = Paths.get(targetDirectory, entry.getName());
                Files.createDirectories(filePath.getParent());
                Files.copy(tis, filePath, StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }

    public static void main(String[] args) {
        try {
            // Create .tar archive
            createTarArchive("archive.tar", "file1.txt", "file2.txt");

            // Create .tar.gz archive
            createTarGzArchive("archive.tar.gz", "file1.txt", "file2.txt");

            // Create .tar.bz2 archive
            createTarBz2Archive("archive.tar.bz2", "file1.txt", "file2.txt");

            // Extract .tar archive
            extractTarArchive("archive.tar", ".");

            // Extract .tar archive to target directory
            extractTarArchive("archive.tar", "/path/to/targetdirectory/");

            // Extract .tar.gz archive
            extractTarGzArchive("archive.tar.gz", ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
