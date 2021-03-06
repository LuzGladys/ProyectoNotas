package pe.glinares.proyectonotas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ESTUDIO on 14/10/2016.
 */
public class Note {

    private long id;
    private String title;
    private String content;
    private long creationTimestamp;
    private long modificationTimestamp;

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Note(long id,String title, String content, long creationTimestamp,long modificationTimestamp) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.creationTimestamp = creationTimestamp;
        this.modificationTimestamp = modificationTimestamp;
    }

    public Note(String title, String content, long creationTimestamp,long modificationTimestamp) {
        this.title = title;
        this.content = content;
        this.creationTimestamp = creationTimestamp;
        this.modificationTimestamp = modificationTimestamp;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCreationTimestamp() {
        Date date = new Date(this.creationTimestamp);
        return sdf.format(date);
    }

    public String getModificationTimestamp() {
        Date date = new Date(this.modificationTimestamp);
        return sdf.format(date);
    }
}
