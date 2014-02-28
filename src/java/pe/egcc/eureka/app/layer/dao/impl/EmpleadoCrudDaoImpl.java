package pe.egcc.eureka.app.layer.dao.impl;

import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pe.egcc.eureka.app.domain.Empleado;
import pe.egcc.eureka.app.layer.dao.espec.EmpleadoCrudDao;
import pe.egcc.eureka.app.layer.dao.mapper.EmpleadoRowMapper;

@Repository
public class EmpleadoCrudDaoImpl extends AbstractDao implements EmpleadoCrudDao {

    @Override
    public Empleado leerPorCodigo(String codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Empleado> leerPorNombre(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void crear(Empleado obj) {
        String sql = "insert into shop.persona(idempleado,nombres,"
                + "apellidos,correo,clave) "
                + "values(?,?,?,?,?)";
        Object[] parms = {obj.getIdempleado(), obj.getNombres(), obj.getApellidos(), obj.getCorreo(), obj.getClave()};
        jdbcTemplate.update(sql, parms);
    }

    @Override
    public void modificar(Empleado obj) {
        // TODO Auto-generated method stub
    }

    @Override
    public void eliminar(String codigo) {
        // TODO Auto-generated method stub
    }

    @Override
    public Empleado leerPorUsuario(String usuario) {
        Empleado emp = null;
        try {
            String sql = "select * from shop.persona where idempleado = ?";
            Object[] parm = {usuario};
            emp = jdbcTemplate.queryForObject(sql, parm, new EmpleadoRowMapper());
        } catch (EmptyResultDataAccessException e) {
            emp = null;
        }
        return emp;
    }

}
