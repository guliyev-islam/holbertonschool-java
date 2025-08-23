public class Video {

    private String file;
    private FormatVideo format;

    Video(String file, FormatVideo format) {
        setFile(file);
        setFormat(format);
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public FormatVideo getFormat() {
        return format;
    }

    public void setFormat(FormatVideo format) {
        this.format = format;
    }
}