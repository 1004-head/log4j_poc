package keeper.log4j.attack.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "ip")
public class AttackEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  @Column(name = "ip")
  private String ip;
  @Column(name = "connection_date")
  private String connectionDate;

}
