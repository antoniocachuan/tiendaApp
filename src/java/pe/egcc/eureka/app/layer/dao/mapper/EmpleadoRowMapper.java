package pe.egcc.eureka.app.layer.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pe.egcc.eureka.app.domain.Empleado;


public class EmpleadoRowMapper implements RowMapper<Empleado> {

	@Override
	public Empleado mapRow(ResultSet rs, int i) throws SQLException {
		Empleado emp = new Empleado();
                emp.setApellidos(rs.getString("apellidos"));
                emp.setClave(rs.getString("clave"));
                emp.setCorreo(rs.getString("clave"));
                emp.setDireccion(rs.getString("direccion"));
                emp.setTelefono(rs.getString("telefono"));
                emp.setTipo(rs.getInt("tipo"));
                emp.setIdempleado(rs.getString("idempleado"));
                emp.setNombres(rs.getString("nombres"));
		return emp;
	}

}
