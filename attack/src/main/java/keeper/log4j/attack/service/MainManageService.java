package keeper.log4j.attack.service;

import keeper.log4j.attack.entity.AttackEntity;
import keeper.log4j.attack.repository.AttackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;



import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@Service
public class MainManageService {

  @Autowired
  AttackRepository attackRepository;

  public void saveIpToDB(String ip){
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss");
    Date now = new Date();
    String now_dt = format.format(now);

    AttackEntity attackEntity = AttackEntity.builder()
            .ip(ip)
            .connectionDate(now_dt)
            .build();
    attackRepository.save(attackEntity);
  }



}
