package azvasa.repository;

import azvasa.model.VMEntry;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
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

    public List<VMEntry> findBy(String userName) {

        try {
            final List<VMEntry> vmEntries = jdbcTemplate.query("select vm_name,user_name,time_stamp from vm_inventory", new RowMapper<VMEntry>() {
                @Override
                public VMEntry mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return new VMEntry(rs.getString("user_name"),rs.getString("vm_name"),rs.getDate("time_stamp"));
                }
            });
            return vmEntries;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
