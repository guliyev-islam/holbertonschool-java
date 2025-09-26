package entities;

import javax.persistence.*;

@Entity
@Table(name = "course_materials")
public class CourseMaterial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "material_name", nullable = false)
    private String materialName;
    
    @Column(name = "material_type")
    private String materialType;
    
    @Column(name = "author")
    private String author;
    
    @Column(name = "url")
    private String url;
    
    @Column(name = "description")
    private String description;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", unique = true)
    private Course course;
    
    public CourseMaterial() {}
    
    public CourseMaterial(String materialName, String materialType, String author, String url, String description) {
        this.materialName = materialName;
        this.materialType = materialType;
        this.author = author;
        this.url = url;
        this.description = description;
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getMaterialName() {
        return materialName;
    }
    
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
    
    public String getMaterialType() {
        return materialType;
    }
    
    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Course getCourse() {
        return course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    
    @Override
    public String toString() {
        return "CourseMaterial{" +
                "id=" + id +
                ", materialName='" + materialName + '\'' +
                ", materialType='" + materialType + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
