package pj.s18946.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String currency;
    private Date datefrom;
    private Date dateto;
    private Double course;
    private Date date;

    public currency() {
    }

    public currency(Integer id, String currency, Date dateTo, Date dateFrom, Double course, Date date) {
        this.id = id;
        this.currency = currency;
        this.dateto = dateTo;
        this.datefrom = dateFrom;
        this.course = course;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getDateTo() {
        return dateto;
    }

    public void setDateTo(Date dateTo) {
        this.dateto = dateTo;
    }

    public Date getDateFrom() {
        return datefrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.datefrom = dateFrom;
    }

    public Double getCourse() {
        return course;
    }

    public void setCourse(Double course) {
        this.course = course;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}