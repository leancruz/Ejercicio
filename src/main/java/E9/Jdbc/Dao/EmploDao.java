package E9.Jdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import E9.Jdbc.Emplo;

public class EmploDao {

	/*
	 * ----------------------------------------------------------------------
	 * -------------------------------ALTA-----------------------------------
	 * ----------------------------------------------------------------------
	 */

	public static void insertar(Emplo emp, Statement stmt) throws SQLException {
		String insertSql = "insert into emplo (email, `FIRST_NAME` , `LAST_NAME` ) values " + "('" + emp.getEmail()
				+ "'," + "'" + emp.getFirstName() + "', '" + emp.getLastName() + "')";
		stmt.executeUpdate(insertSql);

		System.out.println("Registro Ingresado");
		System.out.println("------------------");
	}

	/*
	 * ----------------------------------------------------------------------
	 * --------------------------MODIFICACION-------------------------------
	 * ----------------------------------------------------------------------
	 */

	public static void modif(Emplo emp, Statement stmt) throws SQLException {
		String insertSql = "update emplo set email = '" + emp.getEmail() + "' , FIRST_NAME ='" + emp.getFirstName()
				+ "' , LAST_NAME='" + emp.getLastName() + "' where id= " + emp.getId();
		stmt.executeUpdate(insertSql);

		System.out.println("Registro Modificado");
		System.out.println("------------------");
	}

	/*
	 * ----------------------------------------------------------------------
	 * -------------------------------BAJA-----------------------------------
	 * ----------------------------------------------------------------------
	 */

	public static void baja(Emplo emp, Statement stmt) throws SQLException {
		if (emp == null) {
			System.out.println("No existe el ID ingresado");
		} else {
			String insertSql = "delete from emplo where ID=  " + emp.getId();
			stmt.executeUpdate(insertSql);

			System.out.println("Registro Eliminado");
			System.out.println("------------------");
		}
	}

	/*
	 * ----------------------------------------------------------------------
	 * ------------------------------LISTAR----------------------------------
	 * ----------------------------------------------------------------------
	 */

	public static List<Emplo> listar(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from emplo");
		List<Emplo> lista = new ArrayList<Emplo>();
		while (rs.next()) {
			int id = rs.getInt(1);
			String mail = rs.getString(2);
			String name = rs.getString(3);
			String last = rs.getString(4);

			Emplo emp = new Emplo();
			emp.setId(id);
			emp.setEmail(mail);
			emp.setFirstName(name);
			emp.setLastName(last);
			lista.add(emp);
		}
		return lista;
	}

	/*
	 * ----------------------------------------------------------------------
	 * ------------------------------BUSQUEDA---------------------------------
	 * ----------------------------------------------------------------------
	 */

	public static Emplo buscar(Statement stmt, int id) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from emplo where ID = " + id);
		Emplo emp = null;
		while (rs.next()) {
			emp = new Emplo();
			emp.setEmail(rs.getString(2));
			emp.setFirstName(rs.getString(3));
			emp.setLastName(rs.getString(4));
		}
		return emp;

	}

}