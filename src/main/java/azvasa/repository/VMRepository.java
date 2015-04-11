package azvasa.repository;

import azvasa.model.VMEntry;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.logging.Logger;

public class VMRepository {
    org.slf4j.Logger logger = LoggerFactory.getLogger("VMRepository");
    @Autowired
    JdbcTemplate jdbcTemplate;
    public void storeVMEntry(VMEntry vmEntry) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final String sql = String.format("insert into vm_inventory(vm_name,user_name,time_stamp) VALUES('%s','%s','%s')",vmEntry.getVmName(),vmEntry.getUserName(),sdf.format(vmEntry.getTime()));
        jdbcTemplate.execute(sql);
        logger.info("Created VMEntry for user {}",vmEntry.getUserName());
    }
}
