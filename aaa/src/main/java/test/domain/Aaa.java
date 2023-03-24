package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.AaaApplication;
import test.domain.Aaa;

@Entity
@Table(name = "Aaa_table")
@Data
public class Aaa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        Aaa aaa = new Aaa(this);
        aaa.publishAfterCommit();
    }

    public static AaaRepository repository() {
        AaaRepository aaaRepository = AaaApplication.applicationContext.getBean(
            AaaRepository.class
        );
        return aaaRepository;
    }
}
