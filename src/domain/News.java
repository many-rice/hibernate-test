package domain;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name="news_inf")
public class News
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="news_title",length = 50)
    private String title;
    private String content;

    @Transient
    private Season happenSeason;

    @Lob
    @Basic(fetch=FetchType.LAZY)
    private byte[] pic;

//    @Formula("(select concat(nt.title,nt.content) from news_inf nt where nt.id=id)")
    @Generated(GenerationTime.ALWAYS)
    private String fullContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFullContent() {
        return fullContent;
    }

    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }

    public Season getHappenSeason() {
        return happenSeason;
    }

    public void setHappenSeason(Season happenSeason) {
        this.happenSeason = happenSeason;
    }
    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}
