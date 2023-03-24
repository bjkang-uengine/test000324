package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.CccApplication;
import test.domain.Ccc;

@Entity
@Table(name = "Ccc_table")
@Data
public class Ccc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long aaaid;

    @PostPersist
    public void onPostPersist() {
        Ccc ccc = new Ccc(this);
        ccc.publishAfterCommit();
    }

    public static CccRepository repository() {
        CccRepository cccRepository = CccApplication.applicationContext.getBean(
            CccRepository.class
        );
        return cccRepository;
    }

    public static void ccc(Aaa aaa) {
        /** Example 1:  new item 
        Ccc ccc = new Ccc();
        repository().save(ccc);

        */

        /** Example 2:  finding and process
        
        repository().findById(aaa.get???()).ifPresent(ccc->{
            
            ccc // do something
            repository().save(ccc);


         });
        */

    }
}
