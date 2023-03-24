package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.BbbApplication;
import test.domain.Bbb;

@Entity
@Table(name = "Bbb_table")
@Data
public class Bbb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long aaaid;

    @PostPersist
    public void onPostPersist() {
        Bbb bbb = new Bbb(this);
        bbb.publishAfterCommit();
    }

    public static BbbRepository repository() {
        BbbRepository bbbRepository = BbbApplication.applicationContext.getBean(
            BbbRepository.class
        );
        return bbbRepository;
    }

    public static void bbb(Aaa aaa) {
        /** Example 1:  new item 
        Bbb bbb = new Bbb();
        repository().save(bbb);

        */

        /** Example 2:  finding and process
        
        repository().findById(aaa.get???()).ifPresent(bbb->{
            
            bbb // do something
            repository().save(bbb);


         });
        */

    }
}
