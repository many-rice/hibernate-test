package domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Score {
    @Column(name="fenshu")
    Integer fenshu;
    @Column(name="paiming")
    Integer paiming;

    public Integer getFenshu() {
        return fenshu;
    }

    public void setFenshu(Integer fenshu) {
        this.fenshu = fenshu;
    }

    public Integer getPaiming() {
        return paiming;
    }

    public void setPaiming(Integer paiming) {
        this.paiming = paiming;
    }

    public Score()
    {

    }
    public Score(Integer fenshu,Integer paiming)
    {
        this.fenshu=fenshu;
        this.paiming=paiming;
    }
}
