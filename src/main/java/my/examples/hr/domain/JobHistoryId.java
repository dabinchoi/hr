package my.examples.hr.domain;

        import lombok.Data;

        import javax.persistence.Embeddable;
        import java.io.Serializable;
        import java.util.Date;

@Data
@Embeddable
public class JobHistoryId implements Serializable {
    private Long employeeId;
    private Date startData;

    public JobHistoryId(){
        startData = new Date();
    }
}
